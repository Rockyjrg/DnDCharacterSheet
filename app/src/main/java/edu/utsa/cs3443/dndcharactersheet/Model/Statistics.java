package edu.utsa.cs3443.dndcharactersheet.Model;

import java.io.Serializable;

/**
 * @author Gael Sifuentes  11/14
 */

public class Statistics implements Serializable {
    //Initializes the Strength, Constitution, and Dexterity statistics ;
    public int str, con, dex, chr, itl, wis;
    public int[] bonus = new int[21];

    //------------------------------------------------------------------------------------------------------------

    //Constructors
    public Statistics(int str, int dex, int con, int itl, int wis, int chr)
    {
        this.str = str; this.con = con; this.dex = dex;
        this.chr = chr; this.itl = itl; this.wis = wis;
        this.bonus = bonus;
        bonusDefaulter();
    }


    private void bonusDefaulter(){
        for(int i = 0; i<21;i++){
            bonus[i] = 0;
        }
    }

    //Manipulation for individual bonus values
    public void setBonusValue(int index, int value){
        bonus[index] = value;
    }
    public int getBonusValue(int index){
        return bonus[index];
    }



    //------------------------------------------------------------------------------------------------------------
    //Values getters and setters



    public int[] getBonusArray() {
        return bonus;
    }

    public void setBonusArray(int[] bonus) {
        this.bonus = bonus;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getChr() {
        return chr;
    }

    public void setChr(int chr) {
        this.chr = chr;
    }

    public int getItl() {
        return itl;
    }

    public void setItl(int itl) {
        this.itl = itl;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }


}
