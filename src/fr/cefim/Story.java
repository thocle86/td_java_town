package fr.cefim;

public class Story {
    public static void main(String[] args) {
        Cowboy cowboy = new Cowboy("John");
        Lady lady = new Lady("Marie", "Rouge");
        Robber robber = new Robber("Robert");

        System.out.println("--------------------------------------------");
        System.out.println("***Parts 1.1***");
        System.out.println("--------------------------------------------");
        Human human = new Human("John");
        human.speak("Hello, how are you");
        human.drink();

        System.out.println("--------------------------------------------");
        System.out.println("***Parts 1.2***");
        System.out.println("--------------------------------------------");
        lady.setColorDress("blue");
        cowboy.freeALady(lady);
        cowboy.shootARobber(robber);
        robber.kidnapALady(lady);
        System.out.println(robber.getNumberKidnappedLadies());
        robber.toBeAPrisoner(cowboy);
        System.out.println(cowboy.getPopularity());

        System.out.println("--------------------------------------------");
        System.out.println("***Parts 1.3***");
        System.out.println("--------------------------------------------");
        System.out.println(lady.getName());
        System.out.println(robber.getName());
    }
}
