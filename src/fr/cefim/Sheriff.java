package fr.cefim;

public class Sheriff extends Cowboy {

    private int numberArrestedRobber;

    Sheriff(String name) {
        super(name);
        this.numberArrestedRobber = 0;
    }

    public String stopARobber(Robber robber) {
        numberArrestedRobber++;
        return robber.getName() + "In the name of the law, I stop you!";
    }

    public String searchARobber(Robber robber) {
        robber.setRewardOffered(200);
        return "HEAR HEAR BRAVE PEOPLE !! 200 $ to who will stop " + robber.getName() +" the robber dead or alive !!";
    }

    @Override
    public String present() {
        String response = "";
        response += "Hello, Sheriff " + getName() + "\n";
        response += "I arrested " + numberArrestedRobber + " robbers in my life";
        return response;
    }
}
