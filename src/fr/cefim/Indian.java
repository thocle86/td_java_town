package fr.cefim;

public class Indian extends Human {

    private int numberFeathers;
    private String totem;

    Indian(String name) {
        super(name);
        this.numberFeathers = 0;
        this.totem = "coyote";
        super.setFavoriteDrink("root juice");
        super.setSpecialSpeak("Ugh !");
    }

    @Override
    public String present() {
        String response = "";
        response += super.present() + "\n";
        response += "I have " + numberFeathers + " feathers\n";
        response += "My totem is " + totem;
        return response;
    }

    public String scalpingAPaleFace(PaleFace paleFace) {
        numberFeathers++;
        String response = "";
        response += "Haaa, I have a new feather, I now have " + numberFeathers + "\n";
        response += Human.speak(paleFace.scalp(), (Human)paleFace);
        return response;
    }
}
