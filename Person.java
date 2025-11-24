package edu.ccrm.domain;

/**
 * An abstract base class representing a person in the CCRM system.
 * This class demonstrates abstraction and inheritance.
 */
public abstract class Person {
    private String id;
    private String fullName;
    private String email;

    public Person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    // Getters and setters for encapsulation
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
    
    public String getEmail() {
        return email;
    }

    // Abstract methods to be implemented by subclasses, demonstrating polymorphism
    public abstract String getRole();
    public abstract void printProfile();
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + fullName + ", Email: " + email;
    }
}
