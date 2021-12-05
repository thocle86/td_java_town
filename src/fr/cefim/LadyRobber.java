package fr.cefim;

public class LadyRobber extends Lady implements Outlaw {

    private int numberKidnappedLadies;
    private int rewardOffered;
    private boolean prisoner;

    LadyRobber(String name, String colorDress) {
        super(name, colorDress);
        this.numberKidnappedLadies = 0;
        this.rewardOffered = 300;
        this.prisoner = false;
    }

    @Override
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

    @Override
    public String kidnapALady(Lady lady) {
        String response = "";
        if (lady.isFree()) {
            lady.toBeKidnapped();
            numberKidnappedLadies++;
            response += "Haha! " + lady.getName() + " you are mine now";
        } else {
            response += "You are already prisoner";
        }
        return response;
    }

    @Override
    public String getNumberKidnappedLadies() {
        return "I kidnapped " + numberKidnappedLadies + " ladies";
    }

    @Override
    public String getRewardOffered() {
        return "We offer " + rewardOffered + " dollars for my capture";
    }

    @Override
    public boolean isPrisoner() {
        return prisoner;
    }
}
