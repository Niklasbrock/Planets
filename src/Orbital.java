public abstract class Orbital {
    /*Everything is Metric
    * Minutes, kilometers, square kilometers, km/hour, kilograms*/
    private String name;
    private double oneWayLightMinutesToTheSun;
    private int distanceFromSun;
    private int daysInAYear;
    private int surfaceArea;
    private int orbitVelocity;
    private int equatorialRadius;
    private long volume;
    private long mass;

    public Orbital(String name) {
        this.name = name;
    }

    public Orbital() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOneWayLightMinutesToTheSun() {
        return oneWayLightMinutesToTheSun;
    }

    public void setOneWayLightMinutesToTheSun(double oneWayLightMinutesToTheSun) {
        this.oneWayLightMinutesToTheSun = oneWayLightMinutesToTheSun;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(int distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public int getDaysInAYear() {
        return daysInAYear;
    }

    public void setDaysInAYear(int daysInAYear) {
        this.daysInAYear = daysInAYear;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getOrbitVelocity() {
        return orbitVelocity;
    }

    public void setOrbitVelocity(int orbitVelocity) {
        this.orbitVelocity = orbitVelocity;
    }

    public int getEquatorialRadius() {
        return equatorialRadius;
    }

    public void setEquatorialRadius(int equatorialRadius) {
        this.equatorialRadius = equatorialRadius;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getMass() {
        return mass;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }
}
