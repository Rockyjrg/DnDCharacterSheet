package edu.utsa.cs3443.dndcharactersheet.Model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Gael Sifuentes  11/03
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */

public class Statistics implements Serializable {
    /**
     *
     * So that the Character class declaration is not the size of a football field,
     * numerical attributes have been separated to a serparate "Statistics" Class
     */
    //Initializes the six major statistics as integers
    public int str, con, dex, chr, itl, wis;
    //Supplemental statistics will be placed in the array "bonus" for the user to input manually later.
    public int[] bonus = new int[21];

    //------------------------------------------------------------------------------------------------------------

    //Constructors
    public Statistics(int str, int dex, int con, int itl, int wis, int chr)
    {
        this.str = str; this.con = con; this.dex = dex;
        this.chr = chr; this.itl = itl; this.wis = wis;
        this.bonus = bonus;

        //The following function sets variables in the array to 0 when character is created
        bonusDefaulter();
    }


    //Loops through each index and defaults value to 0, just so there is no null value
    private void bonusDefaulter(){
        for(int i = 0; i<21;i++){
            bonus[i] = 0;
        }
    }

    //Functions that set and get individual values in the supplementary statistics array
    public void setBonusValue(int index, int value){
        bonus[index] = value;
    }
    public int getBonusValue(int index){
        return bonus[index];
    }



    //------------------------------------------------------------------------------------------------------------
    //Values getters and setters


    //Getters and setter for the entire array
    public int[] getBonusArray() {
        return bonus;
    }

    public void setBonusArray(int[] bonus) {
        this.bonus = bonus;
    }

    //Strength Getters and Setters
    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    //Constitution getters and setters
    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    //Dexterity getters and setters
    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    //Charisma getters and setters
    public int getChr() {
        return chr;
    }

    public void setChr(int chr) {
        this.chr = chr;
    }

    //Intelligence getters and setters
    public int getItl() {
        return itl;
    }

    public void setItl(int itl) {
        this.itl = itl;
    }

    //Wisdom Getters and setters
    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    //Class to string
    @Override
    public String toString() {
        return "Statistics{" +
                "str=" + str +
                ", con=" + con +
                ", dex=" + dex +
                ", chr=" + chr +
                ", itl=" + itl +
                ", wis=" + wis +
                ", bonus=" + Arrays.toString(bonus) +
                '}';
    }
}
