import java.util.ArrayList;

public class MilkyWay {
    private ArrayList<Planet> planets;

    public MilkyWay() {
    }


    public int getDistance(Planet firstPlanet, Planet secondPlanet){
        return 0;

    }

    
//    Realized a bit late that pythagoras was only for right triangles...

//    public int getDistance(Planet firstPlanet, Planet secondPlanet){
//        /*Calculating distance between 2 planets using pythagoras*/
//        /*Here I calculate the hypotenuse which will only work if the planets are further away from each
//        * other than the sun*/
//        double distance = (Math.pow(firstPlanet.getDistanceFromSun(),2)) + (Math.pow(secondPlanet.getDistanceFromSun(),2));
//        System.out.println((int)Math.sqrt(distance));
//        /*If the hypotenuse is larger than both distances to sun it is correct*/
//        if ((int)Math.sqrt(distance) > firstPlanet.getDistanceFromSun() &&
//                (int)Math.sqrt(distance) > secondPlanet.getDistanceFromSun()){
//            return (int)Math.sqrt(distance);
//        }
//        /*if it's lower, I have to find the largest number and use it as hypotenuse*/
//        else if (firstPlanet.getDistanceFromSun() > secondPlanet.getDistanceFromSun()){
//            int c = firstPlanet.getDistanceFromSun();
//            int b = secondPlanet.getDistanceFromSun();
//            double a = (Math.pow(c,2)) - (Math.pow(b,2));
//            return (int)Math.sqrt(a);
//        }
//        /*if not, then secondPlanet has to be hypotenuse*/
//        else{
//            int c = secondPlanet.getDistanceFromSun();
//            int b = firstPlanet.getDistanceFromSun();
//            double a = (Math.pow(c,2)) - (Math.pow(b,2));
//            return (int)Math.sqrt(a);
//        }
//    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }
}
