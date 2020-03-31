import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MilkyWayTest {

    @Test
    void setPlanets() {
        ArrayList<Planet> planets = new ArrayList<>();
        MilkyWay milkyWay = new MilkyWay();
        Planet earth = new Planet("Earth");
        planets.add(earth);
        milkyWay.setPlanets(planets);

        assertEquals(earth, milkyWay.getPlanets().get(0));
    }

    @Test
    void getDistance(){
        Planet firstPlanet = new Planet("Earth");
        /*Distance from earth to sun as of 18:55 14.03.20*/
        firstPlanet.setDistanceFromSun(148759837);
        Planet secondPlanet = new Planet("Mars");
        /*Distance from mars to sun as of 18:55 14.03.20*/
        secondPlanet.setDistanceFromSun(224065308);
        MilkyWay milkyWay = new MilkyWay();

        assertEquals(239000000, milkyWay.getDistance(firstPlanet, secondPlanet), 1000000);

        Planet thirdPlanet = new Planet("Earth");
        /*Distance from earth to sun as of 18:32 14.03.20*/
        thirdPlanet.setDistanceFromSun(148759195);
        Planet fourthPlanet = new Planet("Mercury");
        /*Distance from mars to sun as of 18:32 14.03.20*/
        fourthPlanet.setDistanceFromSun(66622713);

        assertEquals(114000000, milkyWay.getDistance(thirdPlanet, fourthPlanet), 1000000);
    }
}