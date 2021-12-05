package fr.cefim;

public abstract class Human {

    private String name;
    private String favoriteDrink;
    private String specialSpeak;

    Human(String name) {
        this.name = name;
        this.favoriteDrink = "water";
        this.specialSpeak = "";
    }

    public static String speak(String text, Human human) {
        return ("(" + human.getName() + ")" + " - " + text + " " + human.specialSpeak);
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

    public void setSpecialSpeak(String specialSpeak) {
        this.specialSpeak = specialSpeak;
    }
}
