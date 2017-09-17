package com.example.kylemiller.olympics;

import java.util.ArrayList;

/**
 * Created by kylemiller on 17/09/2017.
 */

public class Competition {
    private ArrayList<Competeable> event;
    private int maxNumOfCompetitors;

    public Competition(int maxNumOfCompetitors) {
        this.maxNumOfCompetitors = maxNumOfCompetitors;
        this.event = new ArrayList<>();
    }

    public void addCompetitior(Competeable competitor){
        if (event.size() < maxNumOfCompetitors) {
            event.add(competitor);
            return;
        }
        System.out.println("event full");
    }

    public ArrayList<Competeable> getEvent() {
        return event;
    }

    public int getMaxNumOfCompetitors() {
        return maxNumOfCompetitors;
    }

    public void awardMedals(){
//        Collections.sort(event, new SortBySkill());
//        event.get(2).addMedal(MedalType.GOLD);
//        event.get(1).addMedal(MedalType.SILVER);
//        event.get(0).addMedal(MedalType.BRONZE);
        ArrayList<Competeable> podium = new ArrayList<>();
        Competeable winningAthletes = event.get(0);
        while( podium.size() < 3){
            for (Competeable competitor : event) {
                if(competitor.getSkillLevel() > winningAthletes.getSkillLevel())
                    winningAthletes = competitor;
            }
            podium.add(winningAthletes);
            event.remove(winningAthletes);
        }
        podium.get(0).addMedal(MedalType.GOLD);
        podium.get(1).addMedal(MedalType.SILVER);
        podium.get(2).addMedal(MedalType.BRONZE);
    }




}
