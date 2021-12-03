package fr.cefim;

public class Story {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.1***");
        System.out.println("--------------------------------------------");
        Human human = new Human("John");
        human.speak("Hello, how are you");
        human.speak(human.drink());

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.2***");
        System.out.println("--------------------------------------------");
        Cowboy cowboy = new Cowboy("John");
        Lady lady = new Lady("Marie", "Rouge");
        Robber robber = new Robber("Robert");
        lady.speak(lady.setColorDress("blue"));
        cowboy.speak(cowboy.freeALady(lady));
        cowboy.speak(cowboy.shootARobber(robber));
        robber.speak(robber.kidnapALady(lady));
        robber.speak(robber.getNumberKidnappedLadies());
        robber.speak(robber.toBeAPrisoner(cowboy));
        cowboy.speak(cowboy.getPopularity());

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.3***");
        System.out.println("--------------------------------------------");
        lady.speak(lady.getName());
        robber.speak(robber.getName());

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.4***");
        System.out.println("--------------------------------------------");
        cowboy.speak(cowboy.present());
        lady.speak(lady.present());
        robber.speak(robber.present());

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.5***");
        System.out.println("--------------------------------------------");
        Barman barman = new Barman("Jack");
        barman.speak(barman.present());
        barman.speak(barman.serveADrink(cowboy));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.6***");
        System.out.println("--------------------------------------------");
        Sheriff sheriff = new Sheriff("Woody");
        sheriff.speak(sheriff.present());

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.7***");
        System.out.println("--------------------------------------------");
        Cowboy clint = new Sheriff("Clint");
        clint.speak(clint.present());
        //clint.speak(clint.stopARobber()); IMPOSSIBLE

        System.out.println("--------------------------------------------");
        System.out.println("***Part 2.1***");
        System.out.println("--------------------------------------------");
        Robber billyTheKid = new Robber("Billy the kid");
        billyTheKid.speak(billyTheKid.kidnapALady(lady));
        billyTheKid.speak(billyTheKid.getNumberKidnappedLadies());

        System.out.println("--------------------------------------------");
        System.out.println("***Part 2.2***");
        System.out.println("--------------------------------------------");
        cowboy.speak(cowboy.shootARobber(billyTheKid));
    }
}
