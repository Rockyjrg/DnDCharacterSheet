package edu.utsa.cs3443.dndcharactersheet.Model;

public class Spells {
    String spellName, spellDescrpition;
    int level;

    public Spells(String spellName, String spellDescrpition, int level) {
        this.spellName = spellName;
        this.spellDescrpition = spellDescrpition;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellDescrpition() {
        return spellDescrpition;
    }

    public void setSpellDescrpition(String spellDescrpition) {
        this.spellDescrpition = spellDescrpition;
    }
}
