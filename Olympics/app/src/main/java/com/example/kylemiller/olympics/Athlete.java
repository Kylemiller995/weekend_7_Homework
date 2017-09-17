package com.example.kylemiller.olympics;

import java.util.ArrayList;

/**
 * Created by kylemiller on 15/09/2017.
 */

public class Athlete implements Competeable {
    private String name;
    private String nationality;
    private int skillLevel;
    private ArrayList<MedalType> accolades;

    public Athlete(String name, String nationality, int skillLevel) {
        this.name = name;
        this.nationality = nationality;
        this.skillLevel = skillLevel;
        this.accolades = new ArrayList<>();
    }

    public String getNationality() {
        return nationality;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public ArrayList<MedalType> getAccolades() {
        return accolades;
    }

    public String getName() {
        return name;
    }

    public void addMedal(MedalType medalType){
        accolades.add(medalType);
    }
}
