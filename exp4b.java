/*
Author- Jahnavi Singh Chauhan
Roll no.- R2142220526
SAP ID- 500102342
Date- 22/09/2023
*/

class Animal { 
    int numberOfEyes; 
    public Animal(int numberOfEyes) { 
        this.numberOfEyes = numberOfEyes; 
    } 
} 
 
// Create a subclass called "Mammal" that inherits from "Animal" 
class Mammal extends Animal { 
    int numberOfLimbs; 
     Mammal(int numberOfEyes, int numberOfLimbs) { 
        super(numberOfEyes); 
        this.numberOfLimbs = numberOfLimbs; 
    } 
 
     void displayCharacteristics() { 
        System.out.println("Mammals"); 
        System.out.println("No. of limbs = " + numberOfLimbs); 
        System.out.println("No. of eyes = " + numberOfEyes); 
    } 
} 
 
// Create another subclass called "Bird" that inherits from "Animal" 
class Bird extends Animal { 
    int numberOfWings; 
 
    public Bird(int numberOfEyes, int numberOfWings) { 
        super(numberOfEyes); 
        this.numberOfWings = numberOfWings; 
    } 
 
    void displayCharacteristics() { 
        System.out.println("Birds"); 
        System.out.println("No. of wings = " + numberOfWings); 
        System.out.println("No. of eyes = " + numberOfEyes); 
    } 
} 
 
 class AnimalDemo { 
    public static void main(String[] args) { 
        // Create a mammal object 
        Mammal mammal = new Mammal(2, 4); 
 
        // Create a bird object 
        Bird bird = new Bird(2, 2); 
 
        // Display characteristics of the mammal 
        mammal.displayCharacteristics(); 
 
        // Display characteristics of the bird 
        bird.displayCharacteristics(); 
    } 
} 