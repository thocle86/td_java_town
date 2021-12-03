package fr.cefim;

public class Robber extends  Human{

    private String look;
    private int numberKidnappedLadies;
    private int rewardOffered;
    private boolean prisoner;

    Robber(String name) {
        super(name);
        this.look = "Bad";
        this.numberKidnappedLadies = 0;
        this.rewardOffered = 100;
        this.prisoner = false;
    }

    public void kidnapALady(Lady lady) {
        if (lady.isFree()) {
            lady.toBeKidnapped();
            numberKidnappedLadies++;
            System.out.println("Haha! " + lady.getName() + " you are mine now");
        } else {
            System.out.println("You are already my prisoner");
        }
    }

    public void toBeAPrisoner(Cowboy cowboy) {
        if (!prisoner) {
            prisoner = true;
            System.out.println("Damned, I'm done ! " + cowboy.getName() + " you got me !");
        } else {
            System.out.println("Haaaaa, free me or I'll kill you");
        }
    }

    public int getNumberKidnappedLadies() {
        return numberKidnappedLadies;
    }

    public int getRewardOffered() {
        return rewardOffered;
    }

    public boolean isPrisoner() {
        return prisoner;
    }
}
