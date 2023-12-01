package edu.utsa.cs3443.dndcharactersheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.dndcharactersheet.Controller.StatsEditController;
import edu.utsa.cs3443.dndcharactersheet.Model.Character;
import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;

public class StatsEditActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_base_stats_edit);
        Statistics statistics = new Statistics(0,0,0,0,0,0);
        Character character = new Character("0","0","0", statistics);
        StatsEditController statsEditController = new StatsEditController(this,character);


    }

}
