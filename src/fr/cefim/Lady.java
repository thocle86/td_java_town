package fr.cefim;

public class Lady extends Human{

    private String colorDress;
    private boolean free;

    Lady(String name, String colorDress) {
        super(name);
        super.setFavoriteDrink("milk");
        this.colorDress = colorDress;
        this.free = true;
    }

    public String toBeKidnapped() {
        String response = "";
        if (free) {
            free = false;
            response += "Haaaa, help me !!!";
        } else {
            response += "Free me please";
        }
        return response;
    }

    public String toBeReleased(Cowboy cowboy) {
        String response = "";
        if (!free) {
            free = true;
            response += "Thank you " + cowboy.getName() + " the cowboy, you are my hero";
        } else {
            response += "Are you free for a drink, lady ?";
        }
        return response;
    }

    public String getColorDress() {
        return "Look my " + colorDress + " dress";
    }

    public String setColorDress(String colorDress) {
        this.colorDress = colorDress;
        return "Look at my new " + colorDress + " dress";
    }

    public boolean isFree() {
        return free;
    }

    @Override
    public String getName() {
        return "Miss " + super.getName();
    }

    @Override
    public String present() {
        String response = "";
        response += super.present() + "\n";
        response += getColorDress();
        return response;
    }
}
