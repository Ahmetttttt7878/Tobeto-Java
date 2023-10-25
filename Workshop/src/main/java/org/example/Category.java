package org.example;

public class Category {

    // 1-Variables
    private String name;
    private String description;

    // 2- Constructor
    public Category() {

    }
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Encapsulation Getter - Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
