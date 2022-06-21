package tests;

import level8.WelcomeToCity;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWelcomeToCity {
    WelcomeToCity t = new WelcomeToCity();

    @Test
    public void testWelcomeToCity1() {
        assertEquals("Hello, Pyramid Head! Welcome to Silent Hill, Maine!", t.sayHello(new String[]{"Pyramid","Head"}, "Silent Hill", "Maine"));
    }

    @Test
    public void testWelcomeToCity2() {
        assertEquals("Hello, Robbie The Rabbit! Welcome to Silent Hill, Maine!", t.sayHello2(new String[]{"Robbie","The", "Rabbit"}, "Silent Hill", "Maine"));
    }

    @Test
    public void testWelcomeToCity3() {
        assertEquals("Hello, John Doe! Welcome to Silent Hill, Maine!", t.sayHello3(new String[]{"John","Doe"}, "Silent Hill", "Maine"));
    }

}
