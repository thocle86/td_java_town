package fr.cefim;

public class Cowboy extends Human{

    private int popularity;
    private String look;

    Cowboy(String name) {
        super(name);
        this.popularity = 0;
        this.look = "Valiant";
    }

    public void shootARobber(Robber robber) {
        if (!robber.isPrisoner()) {
            popularity++;
            System.out.println("The " + look + " " + super.getName() + " shoots " + robber.getName() + ". PAN !");
            System.out.println("Take that rascal");
        } else {
            System.out.println("You're lucky to be a prisoner");
        }
    }

    public void freeALady(Lady lady) {
        if (!lady.isFree()) {
            lady.toBeReleased(this);
            System.out.println("You look lovely in that " + lady.getColorDress() + " dress");
        } else {
            System.out.println("Are you free for a drink, lady ?");
        }
    }

    public int getPopularity() {
        return popularity;
    }
}
