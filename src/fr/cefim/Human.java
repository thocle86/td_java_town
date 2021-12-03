package fr.cefim;

public class Human {

    private String name;
    private String favoriteDrink;

    Human(String name) {
        this.name = name;
        this.favoriteDrink = "water";
    }

    public void speak(String text) {
        System.out.println("(" + name + ")" + " - " + text);
    }

    public String present() {
        return "Hello, my name is " + name + ", my favorite drink is " + favoriteDrink;
    }

    public String drink() {
        return "Aaaah, a good glass of " + favoriteDrink + " ! GLOUPS !";
    }

    public String getName() {
        return name;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void setFavoriteDrink(String favoriteDrink) {
        this.favoriteDrink = favoriteDrink;
    }
}
