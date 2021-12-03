package fr.cefim;

public class Story {
    public static void main(String[] args) {
        Cowboy cowboy = new Cowboy("John");
        Lady lady = new Lady("Marie", "Rouge");
        Robber robber = new Robber("Robert");

        lady.setColorDress("blue");
        cowboy.freeALady(lady);
        cowboy.shootARobber(robber);
        robber.kidnapALady(lady);
        System.out.println(robber.getNumberKidnappedLadies());
        robber.toBeAPrisoner(cowboy);
        System.out.println(cowboy.getPopularity());
    }
}
