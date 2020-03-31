import java.util.ArrayList;

public class Planet extends Orbital {
    private String type;
    private ArrayList<Moon> moons;

    public Planet(String name) {
        super(name);
    }

    public Planet() {
    }

    public int getMoonCount(){
        return moons.size();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    public void setMoons(ArrayList<Moon> moons) {
        this.moons = moons;
    }
}
