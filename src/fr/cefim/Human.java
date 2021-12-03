package fr.cefim;

public class Human {

    private String name;
    private String favoriteDrink;

    Human(String name) {
        this.name = name;
        this.favoriteDrink = "water";
    }

    public void speak(String text) {
        System.out.println(name + " - " + text);
    }

    public void present() {
        System.out.println("Hello, my name is " + name + ", my favorite drink is " + favoriteDrink);
    }

    public void drink() {
        System.out.println("Aaaah, a good glass of " + favoriteDrink + " ! GLOUPS !");
    }

    public String getName() {
        return name;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }
}
