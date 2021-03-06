package fr.cefim;

public class Robber extends Human implements Outlaw, PaleFace {

    private String look;
    private int numberKidnappedLadies;
    private int rewardOffered;
    private boolean prisoner;

    Robber(String name) {
        super(name);
        super.setFavoriteDrink("twist-gutters");
        this.look = "Bad";
        this.numberKidnappedLadies = 0;
        this.rewardOffered = 100;
        this.prisoner = false;
    }

    public String kidnapALady(Lady lady) {
        String response = "";
        if (lady.isFree()) {
            numberKidnappedLadies++;
            response += "Haha! " + lady.getName() + " you are mine now\n";
            response += Human.speak(lady.toBeKidnapped(), lady);
        } else {
            response += "You are already prisoner";
        }
        return response;
    }

    public String toBeAPrisoner(Cowboy cowboy) {
        String response = "";
        if (!prisoner) {
            prisoner = true;
            response += "Damned, I'm done ! " + cowboy.getName() + " you got me !";
        } else {
            response += "Haaaaa, free me or I'll kill you";
        }
        return response;
    }

    public String getNumberKidnappedLadies() {
        return "I kidnapped " + numberKidnappedLadies + " ladies";
    }

    public String getRewardOffered() {
        return "We offer " + rewardOffered + " dollars for my capture";
    }

    public void setRewardOffered(int rewardOffered) {
        this.rewardOffered = rewardOffered;
    }

    public boolean isPrisoner() {
        return prisoner;
    }

    @Override
    public String getName() {
        return super.getName() + " the " + look;
    }

    @Override
    public String present() {
        String response = "";
        response += super.present() + "\n";
        response += getNumberKidnappedLadies() + "\n";
        response += getRewardOffered();
        return response;
    }
}
