# IC24_SerializedDog

"Way back in IC14", we implemented a class named Dog that contained information about a dog.  The Dog class had the following instance variables (a.k.a. fields or data):


* The dog's name
* The breed
* The age of the dog


 

The Dog class had methods to:


* Create a new Dog (given a dog's name, breed and age) [constructor]
* Create a new Dog (from another Dog) [copy constructor - like cloning a dog]
* getName - returns the name of the dog
* getBreed
* getAge
* setName
* setBreed
* setAge
* ageInHumanYears - calculates and returns the dog's age in human years, which is generally estimated as: (if the dog is <= 2 years old, multiply its age * 11, else, subtract the age - 2, multiply by 5 and add 22)
* equals - method to check if one Dog is the same as another by comparing all instance variables
* toString - method to turn a Dog into a string for display, e.g. display as "Dog [Name=Scooby, Breed=Great Dane, Age=7]"


Now, we've graduated quite a bit.  We're going to add serialization to the Dog class, so that it can be persisted (written) to a binary file, acting like a database of Dog objects.  We need to customize the Dog class to make it Serializable, then use a ObjectOutputStream to write the Dog objects to disk.


Please make your Dog class (or the one attached to this in-class assignment) serializable, then create a SerializedDogDemo with a main( ) method that creates 3 Dog objects and writes them to a binary file named "Dog.dat".  We will then add Java code that reads a binary file (of Dog objects) into our program and displays each object to the console.  More details to be provided in class.

Here is a sample transaction with the user (first time the code is run):

```
Previously saved Dogs from binary file:
[None, please enter new dog data]

Please enter dog's name (or "quit" to exit): Lassie
Please enter dog's breed: Collie
Please enter dog's age  : 23.0
```
After 3 dogs have been entered by the user (second time the code is run):
```
Previously saved Dogs from binary file:
Dog [name=Lassie, breed=Collie, age=23.0]
Dog [name=Gidget, breed=Chihuahua, age=12.0]
Dog [name=Snoopy, breed=Beagle, age=65.0]

Please enter dog's name (or "quit" to exit): Pluto
Please enter dog's breed: Bloodhound
Please enter dog's age  : 60.0
```
Last time the code is run, after entering Pluto:
```
Previously saved Dogs from binary file:
Dog [name=Lassie, breed=Collie, age=23.0]
Dog [name=Gidget, breed=Chihuahua, age=12.0]
Dog [name=Snoopy, breed=Beagle, age=65.0]
Dog [name=Pluto, breed=Bloodhound, age=60.0] 
```
