import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void getMoons() {
        Planet earth = new Planet("Earth");
        Moon moon = new Moon("Moon");
        ArrayList<Moon> earthsMoons = new ArrayList<>();
        earthsMoons.add(moon);
        earth.setMoons(earthsMoons);

        assertEquals(earthsMoons, earth.getMoons());
    }

    @Test
    void getMoonCount(){
        Planet earth = new Planet("Earth");
        Moon moon = new Moon("Moon");
        ArrayList<Moon> earthsMoons = new ArrayList<>();
        earthsMoons.add(moon);
        earth.setMoons(earthsMoons);

        assertEquals(earthsMoons.size(), earth.getMoonCount());
    }
}