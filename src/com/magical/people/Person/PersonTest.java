/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.magical.people.Person;

/**
 *
 * @author User
 */
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("=== Student System of the Arcane Academy ===");

        // 1. Create multiple Person objects using both no-arg and parameterized constructors
        Person student1 = new Person(); //no-arg
        Person student2 = new Person("Ali", 20); 
        Person student3 = new Person("Marcus", 50);
        Person student4 = new Person("Marcus", 50);
        Person student5 = new Person("Ali", 15);

        student1.display();
        student2.display();
        student3.display();

        
        // 2. check age (valid and invalid)
        // Valid Age
        student1.setAge(25);
        System.out.println("\nValid Age: " + student1.getAge());

        // Invalid Age
        try {
            student1.setAge(-1);
            System.out.println("Invalid Age: " + student1.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        //age after error - remain unchanged
        System.out.println("Age after failed attempt: " + student1.getAge());
    
        
        // 3. Test compareTo()
        
        // Compare different name and age
        boolean isSame1 = student2.compareTo(student3);
        System.out.println("\nIs Marcus the same as Ali? " + isSame1);

        // Compare same name and age
        boolean isSame2 = student3.compareTo(student4);
        System.out.println("Is Marcus1 the same as Marcus2? " + isSame2);
        
        // Compare same name and different age
        boolean isSame3 = student2.compareTo(student5);
        System.out.println("Is Ali(age20) the same as Ali(age15)? " + isSame3);

        
        // 4. Test getPersonCount()
        System.out.println("\nTotal Students in Academy: " + Person.getPersonCount());
    }  
}
