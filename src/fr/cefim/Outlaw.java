package fr.cefim;

public interface Outlaw {

    String toBeAPrisoner(Cowboy cowboy);

    String kidnapALady(Lady lady);

    String getNumberKidnappedLadies();

    String getRewardOffered();

    boolean isPrisoner();

    String getName();
}
