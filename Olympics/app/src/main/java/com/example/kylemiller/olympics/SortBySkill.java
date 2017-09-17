package com.example.kylemiller.olympics;

import java.util.Comparator;

/**
 * Created by kylemiller on 17/09/2017.
 */

public class SortBySkill implements Comparator<Competeable> {

    @Override
    public int compare(Competeable a, Competeable b){
        return a.getSkillLevel() - b.getSkillLevel();
    }
}




