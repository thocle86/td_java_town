package fr.cefim;

public class Barman extends Human {

    private String nameBar;

    Barman(String name) {
        super(name);
        super.setFavoriteDrink("wine");
        this.nameBar = super.getName() + " House";
    }

    Barman(String name, String nameBar) {
        super(name);
        super.setFavoriteDrink("wine");
        this.nameBar = nameBar;
    }

    @Override
    public String present() {
        String response = "";
        response += super.present() + "\n";
        response += "The name of my bar is " + nameBar;
        return response;
    }

    @Override
    public void speak(String text) {
        super.speak(text + " COCO");
    }

    public String serveADrink(Human human) {
        String response = human.getName() + " your favorite drink is " + human.getFavoriteDrink();
        return response;
    }
}
