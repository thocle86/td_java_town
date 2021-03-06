package fr.cefim;

public class Cowboy extends Human implements PaleFace {

    private int popularity;
    private String look;

    Cowboy(String name) {
        super(name);
        super.setFavoriteDrink("whisky");
        this.popularity = 0;
        this.look = "valiant";
    }

    public String shootARobber(Outlaw robber) {
        String response = "";
        if (!robber.isPrisoner()) {
            popularity++;
            response += "The " + look + " " + super.getName() + " shoots " + robber.getName() + ". PAN !\n";
            response += "Take that rascal";
        } else {
            response += "You're lucky to be a prisoner";
        }
        return response;
    }

    public String freeALady(Lady lady) {
        String response = "";
        if (!lady.isFree()) {
            response += "You look lovely in that " + lady.getColorDress() + " dress\n";
            response += Human.speak(lady.toBeReleased(this), lady);
        } else {
            response += "Are you free for a drink, lady ?";
        }
        return response;
    }

    public String getPopularity() {
        return "My popularity is " + popularity;
    }

    @Override
    public String present() {
        String response = "";
        response += super.present() + "\n";
        response += "People say I'm " + look + "\n";
        response += getPopularity();
        return response;
    }
}
