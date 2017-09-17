package com.example.kylemiller.olympics;

import java.util.ArrayList;

/**
 * Created by kylemiller on 15/09/2017.
 */

public class AthleteTeam implements Competeable {
    private String nationality;
    private ArrayList<Athlete> teamlist;
    private int teamSkillLevel;
    private ArrayList<MedalType> accolades;

    public AthleteTeam(String nationality) {
        this.nationality = nationality;
        this.teamlist = new ArrayList<>();
        this.teamSkillLevel = 0;
        this.accolades = new ArrayList<>();
    }

    public String getNationality() {
        return nationality;
    }

    public ArrayList<Athlete> getTeamlist() {
        return teamlist;
    }

    public int getSkillLevel() {
        for(Athlete athlete: teamlist) {
            teamSkillLevel += athlete.getSkillLevel();
        }
        return teamSkillLevel;
    }

    public void teamJoin(Athlete athlete){
        teamlist.add(athlete);
    }

    public void addMedal(MedalType medalType){
        accolades.add(medalType);
    }

}




