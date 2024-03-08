
package com.mycompany.petgrooming.logic;

public class Pet {
    
    private int id;
    private String name;
    private String breed;
    private String color;
    private String Allergic;
    private String specialAttention;

    public Pet() {
    }

    public Pet(int id, String name, String breed, String color, String Allergic, String specialAttention) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.Allergic = Allergic;
        this.specialAttention = specialAttention;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return Allergic;
    }

    public void setAllergic(String Allergic) {
        this.Allergic = Allergic;
    }

    public String getSpecialAttention() {
        return specialAttention;
    }

    public void setSpecialAttention(String specialAttention) {
        this.specialAttention = specialAttention;
    }
    
}
