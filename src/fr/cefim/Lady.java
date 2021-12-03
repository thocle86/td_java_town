package fr.cefim;

public class Lady extends Human{

    private String colorDress;
    private boolean free;

    Lady(String name, String colorDress) {
        super(name);
        this.colorDress = colorDress;
        this.free = true;
    }

    public void toBeKidnapped() {
        if (free) {
            free = false;
            System.out.println("Haaaa, help me !!!");
        } else {
            System.out.println("Free me please");
        }
    }

    public void toBeReleased(Cowboy cowboy) {
        if (!free) {
            free = true;
            System.out.println("Thank you " + cowboy.getName() + " the cowboy, you are my hero");
        } else {
            System.out.println("Are you free for a drink, lady ?");
        }
    }

    public String getColorDress() {
        return colorDress;
    }

    public void setColorDress(String colorDress) {
        this.colorDress = colorDress;
        System.out.println("Look at my new " + colorDress + " dress");
    }

    public boolean isFree() {
        return free;
    }

    @Override
    public String getName() {
        return "Miss " + super.getName();
    }
}
