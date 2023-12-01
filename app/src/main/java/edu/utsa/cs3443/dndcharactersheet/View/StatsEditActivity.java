package edu.utsa.cs3443.dndcharactersheet.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.dndcharactersheet.Controller.StatsEditController;
import edu.utsa.cs3443.dndcharactersheet.Model.Character;
import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;
import edu.utsa.cs3443.dndcharactersheet.R;
/**
 * @author Israel Chaves  11/18
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class StatsEditActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //displays appropriate Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_base_stats_edit);

        //Creates temporary Character and statistics class for testing
        Statistics statistics = new Statistics(0,0,0,0,0,0);
        Character character = new Character("0","0","0", statistics);

        //Calls on controller class
        StatsEditController statsEditController = new StatsEditController(this,character);


    }

}
