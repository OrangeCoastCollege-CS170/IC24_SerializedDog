package edu.orangecoastcollege.sbadajoz.ic24;

import java.util.ArrayList;
import java.util.Scanner;

/*
Badajoz, Seve
CS A170
November 30, 2016

IC24
*/
public class SearilzedDogDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, breed;
        int age;
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        
        while(true) {
            System.out.print("Please enter dog's name (or \"quit\" to exit): ");
            name = input.nextLine();
            if(name.toLowerCase().equals("quit")) break;
            System.out.print("Please enter dog's breed: ");
            breed = input.nextLine();
            System.out.print("Please enter dog's age: ");
            age = input.nextInt();
            input.nextLine();
            dogs.add(new Dog(name, breed, age));
            System.out.println();
        }
    }
}
