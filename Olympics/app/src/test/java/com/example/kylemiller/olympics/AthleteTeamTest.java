package com.example.kylemiller.olympics;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 15/09/2017.
 */
public class AthleteTeamTest {
    Athlete athlete;
    AthleteTeam athleteTeam;

    @Before
    public void setUp(){
        athlete = new Athlete("Kyle", "Scottish", 5);
        athleteTeam = new AthleteTeam("Scottish");
    }

    @Test
    public void testgetNationality(){
        assertEquals(athleteTeam.getNationality(), "Scottish");
    }

    @Test
    public void testTeamStartsEmpty(){
        assertEquals(athleteTeam.getTeamlist().size(), 0 );
    }

    @Test
    public void canAddToTeam(){
        athleteTeam.teamJoin(athlete);
        assertEquals(athleteTeam.getTeamlist().size(), 1);
    }

    @Test
    public void sumsTeamSkill(){
        athleteTeam.teamJoin(athlete);
        assertEquals(athleteTeam.getSkillLevel(), 5);
    }




}