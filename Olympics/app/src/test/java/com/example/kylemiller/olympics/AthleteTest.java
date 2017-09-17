package com.example.kylemiller.olympics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 15/09/2017.
 */
public class AthleteTest {
    private ArrayList<MedalType> accolades;
    private Athlete athlete;
    private MedalType medalType;


    @Before
    public void setUp(){
         athlete = new Athlete("Kyle", "Scottish", 5);
    }
    @Test
    public void getNationality()  {
        assertEquals("Scottish", athlete.getNationality());

    }

    @Test
    public void getSkillLevel()  {
        assertEquals(5, athlete.getSkillLevel());
    }

    @Test
    public void getAccolades() {
        assertEquals( 0 , athlete.getAccolades().size());
    }

    @Test
    public void getName(){
        assertEquals(athlete.getName(), "Kyle");
    }

    @Test
    public void canCompete(){
        athlete.addMedal(medalType.GOLD);
        assertEquals(1, athlete.getAccolades().size());
    }


}