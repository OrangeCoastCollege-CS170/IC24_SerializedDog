package edu.orangecoastcollege.sbadajoz.ic24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
Badajoz, Seve
CS A170
November 30, 2016

IC24
 */
public class SearilzedDogDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name, breed;
        double age;
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        File binaryFile = new File("dogs.dat");

        System.out.println("Previously saved Dogs:");
        if (binaryFile.exists())
        {
            try
            {
                ObjectInputStream fileReader = new ObjectInputStream(new FileInputStream(binaryFile));
                Dog[] array = (Dog[]) fileReader.readObject();
                fileReader.close();
                for (Dog doggo : array)
                {
                    dogs.add(doggo);
                    System.out.println(doggo);
                }
            }
            catch (IOException e)
            {
                System.out.println("File not found.");
            }
            catch (ClassNotFoundException e)
            {
                System.out.println("File found, data was in wrong format.");
            }
        }
        else
        {
            System.out.println("[None, please enter Dog data]");
        }
        while (true)
        {
            System.out.print("Please enter dog's name (or \"quit\" to exit): ");
            name = input.nextLine();
            if (name.toLowerCase().equals("quit")) break;
            System.out.print("Please enter dog's breed: ");
            breed = input.nextLine();
            System.out.print("Please enter dog's age: ");
            age = input.nextDouble();
            input.nextLine();
            dogs.add(new Dog(name, breed, age));
            System.out.println();
        }
        input.close();
        try
        {
            ObjectOutputStream fileWriter = new ObjectOutputStream(new FileOutputStream(binaryFile));
            fileWriter.writeObject(dogs.toArray(new Dog[dogs.size()]));
        }
        catch (IOException e)
        {
            System.out.println("File not found.");
        }
    }
}
