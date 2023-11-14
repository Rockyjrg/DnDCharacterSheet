package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

import edu.utsa.cs3443.dndcharactersheet.Model.Attributes;

import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;

public class Character {
    public Statistics stats;
    public Attributes atts;

    public Character(Statistics stats,Attributes atts) {
        this.stats = stats;
        this.atts = atts;
    }

    @Override
    public String toString() {
        return atts.toString() + stats.toString();
    }

}
