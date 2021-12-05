package fr.cefim;

public class Story {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.1***");
        System.out.println("--------------------------------------------");
        //Human human = new Human("John");
        //plus possible de construire un humain car c'est une classe abstraite
        //Human.speak("Hello, how are you");
        //Human.speak(human.drink());

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.2***");
        System.out.println("--------------------------------------------");
        Cowboy cowboy = new Cowboy("John");
        Lady lady = new Lady("Marie", "Rouge");
        Robber robber = new Robber("Robert");
        System.out.println(Human.speak(lady.setColorDress("blue"), lady));
        System.out.println(Human.speak(cowboy.freeALady(lady), cowboy));
        System.out.println(Human.speak(cowboy.shootARobber(robber), cowboy));
        System.out.println(Human.speak(robber.kidnapALady(lady), robber));
        System.out.println(Human.speak(robber.getNumberKidnappedLadies(), robber));
        System.out.println(Human.speak(robber.toBeAPrisoner(cowboy), robber));
        System.out.println(Human.speak(cowboy.getPopularity(), cowboy));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.3***");
        System.out.println("--------------------------------------------");
        System.out.println(Human.speak(lady.getName(), lady));
        System.out.println(Human.speak(robber.getName(), robber));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.4***");
        System.out.println("--------------------------------------------");
        System.out.println(Human.speak(cowboy.present(), cowboy));
        System.out.println(Human.speak(lady.present(), lady));
        System.out.println(Human.speak(robber.present(), robber));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.5***");
        System.out.println("--------------------------------------------");
        Barman barman = new Barman("Jack");
        System.out.println(Human.speak(barman.present(), barman));
        System.out.println(Human.speak(barman.serveADrink(cowboy), barman));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.6***");
        System.out.println("--------------------------------------------");
        Sheriff sheriff = new Sheriff("Woody");
        System.out.println(Human.speak(sheriff.present(), sheriff));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 1.7***");
        System.out.println("--------------------------------------------");
        Cowboy clint = new Sheriff("Clint");
        System.out.println(Human.speak(clint.present(), clint));
        //clint.speak(clint.stopARobber()); IMPOSSIBLE

        System.out.println("--------------------------------------------");
        System.out.println("***Part 2.1***");
        System.out.println("--------------------------------------------");
        Robber billyTheKid = new Robber("Billy the kid");
        System.out.println(Human.speak(billyTheKid.kidnapALady(lady), billyTheKid));
        System.out.println(Human.speak(billyTheKid.getNumberKidnappedLadies(), billyTheKid));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 2.2***");
        System.out.println("--------------------------------------------");
        System.out.println(Human.speak(cowboy.shootARobber(billyTheKid), billyTheKid));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 2.3***");
        System.out.println("--------------------------------------------");
        Rascal rascal = new Rascal("Rascal the jackal");
        System.out.println(Human.speak(rascal.present(), rascal));
        System.out.println(Human.speak(rascal.kidnapALady(lady), rascal));
        System.out.println(Human.speak(rascal.stopARobber(billyTheKid), rascal));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 2.4***");
        System.out.println("--------------------------------------------");
        Lady caroline = new Lady("Caroline", "yellow");
        LadyRobber calamityJane = new LadyRobber("Calamity Jane", "black");
        System.out.println(Human.speak(calamityJane.present(), calamityJane));
        System.out.println(Human.speak(calamityJane.setColorDress("purple"), calamityJane));
        System.out.println(Human.speak(calamityJane.kidnapALady(caroline), calamityJane));
        System.out.println(Human.speak(calamityJane.kidnapALady(caroline), calamityJane));

        System.out.println("--------------------------------------------");
        System.out.println("***Part 2.5***");
        System.out.println("--------------------------------------------");
        Indian indian = new Indian("Sitting Bull");
        System.out.println(Human.speak(indian.present(), indian));
        System.out.println(Human.speak(indian.scalpingAPaleFace(calamityJane), indian));
        System.out.println(Human.speak(indian.scalpingAPaleFace(cowboy), indian));
    }
}
