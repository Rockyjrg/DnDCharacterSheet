package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

public class Statistics {
    //Initializes the Strength, Constitution, and Dexterity statistics;
    public int str; public int con; public int dex;

    //Initializes the Charisma, Intelligence, and Wisdom Statistics
    public  int chr; public int itl; public int wis;

    //Initializes an array for any additional bonuses
    public int[] bonus;

    //------------------------------------------------------------------------------------------------------------

    //Constructors
    public Statistics(
            int str, int dex, int con,
            int itl, int wis, int chr)
    {

        this.str = str; this.con = con; this.dex = dex;


        this.chr = chr; this.itl = itl; this.wis = wis;

        this.bonus = new int[23];
        bonusDefaulter();
    }


    private void bonusDefaulter(){
        for(int i = 0; i<17;i++){
            bonus[i] = 0;
        }
    }

    //------------------------------------------------------------------------------------------------------------

    //List for bonuses stored in the array

    //INDEX: SKILL     - STAT
    //----------------------------
    //  0  :  Athletics - Strength
    //  1  :  Strength Saving throw - Strength

    //  2  :  Acrobatics -      Dexterity
    //  3  :  Sleight of hand - Dexterity
    //  4  :  Stealth -         Dexterity
    //  5  :  Dexterity Saving throw -         Dexterity

    //  6  :  Arcana -        Intelligence
    //  7  :  History -       Intelligence
    //  8  :  Investigation - Intelligence
    //  9  :  Nature -        Intelligence
    // 10  :  Religion -      Intelligence
    // 11  :  Intelligence Saving Throw -      Intelligence

    // 12  :  Animal Handling - Wisdom
    // 13  :  Insight -         Wisdom
    // 14  :  Medicine -        Wisdom
    // 15  :  Perception -      Wisdom
    // 16  :  Survival -        Wisdom
    // 17  :  Wisdom Saving Throw -        Wisdom

    // 18  :  Deception -    Charisma
    // 19  :  Intimidation - Charisma
    // 20  :  Performance -  Charisma
    // 21  :  Persuasion -   Charisma
    // 22  :  Charisma Saving Throw -        Charisma

    // 23  : Constitution Saving Throw - Constitution

    //------------------------------------------------------------------------------------------------------------

    //Method to calculate modifier
    private int callMod(int stat){
        double a = Math.floor((stat - 10)/2);
        return (int)a;
    }

    //Get the modifiers for each Stat
    public int getStrMod(){
        return callMod(getStr());
    }
    public int getConMod(){
        return callMod(getCon());
    }
    public int getDexMod(){
        return callMod(getDex());
    }
    public int getItlMod(){
        return callMod(getItl());
    }
    public int getChrMod(){
        return callMod(getChr());
    }
    public int getWisMod(){
        return callMod(getWis());
    }

    //Makes the skill total for with the bonus and the modifier
    public int getSkillBonusTotal(int index){
        //Mod for the Strength skills
        if (index < 2)
            return getStrMod() + bonus[0];
            //Mod for the Dexterity skills
        else if(index < 6)
            return getDexMod() + bonus[index];
            //Mod for the Intelligence skills
        else if(index < 12)
            return getItlMod() + bonus[index];
            //Mod for the Charisma skills and saving throw
        else if(index < 18)
            return getChrMod() + bonus[index];
            //Mod for the Wisdom skills and saving throw
        else if(index < 23)
            return getWisMod() + bonus[index];
            //Mod for the Con Saving throw
        else if(index == 23)
            return getCon() + bonus[index];
        return 0;
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


    @Override
    public String toString() {
        String g = "Strenght:\n \t" + getStr() + "\n\t+" + getStrMod();
        g += "\nDexterity:\n\t" + getDex() + "\n\t+" + getDexMod();
        g += "\nConstitution:\n\t" + getCon() + "\n\t+" + getConMod();
        g += "\nIntelligence:\n\t" + getItl() + "\n\t+" + getItlMod();
        g += "\nCharisma:\n\t" + getChr() + "\n\t+" + getChrMod();
        g += "\nWisdom:\n\t" + getWis() + "\n\t+" + getWisMod();
        return g;
    }

}
