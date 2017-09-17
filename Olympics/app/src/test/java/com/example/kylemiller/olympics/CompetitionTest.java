package com.example.kylemiller.olympics;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 17/09/2017.
 */
public class CompetitionTest {

    Athlete athlete;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;
    Competition competition;

    @Before
    public void setup() {
        athlete = new Athlete("Kyle", "Scottish", 5);
        athlete2 = new Athlete("b", "b", 2);
        athlete3 = new Athlete("c", "c", 3);
        athlete4 = new Athlete("d", "d", 4);
        competition = new Competition(3);

    }

    @Test
    public void getEvent() {
        assertEquals(competition.getEvent().size(), 0);
//is this how you test this??
    }


    @Test
    public void getMaxNumOfCompetitors() {
        assertEquals(competition.getMaxNumOfCompetitors(), 3);
    }

    @Test
    public void addCompetitior() {
        competition.addCompetitior(athlete);
        assertEquals(competition.getEvent().size(), 1);

    }

    @Test
    public void CantAddMoreThan3(){
        competition.addCompetitior(athlete);
        competition.addCompetitior(athlete2);
        competition.addCompetitior(athlete3);
        competition.addCompetitior(athlete4);
        assertEquals(competition.getEvent().size(), 3);
    }



    @Test
    public void awardMedals() {
        competition.addCompetitior(athlete);
        competition.addCompetitior(athlete3);
        competition.addCompetitior(athlete2);
        competition.awardMedals();
        assertEquals(athlete.getAccolades(), MedalType.GOLD);
    }

}