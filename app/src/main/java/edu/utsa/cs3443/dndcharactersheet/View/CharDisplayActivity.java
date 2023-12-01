package edu.utsa.cs3443.dndcharactersheet.View;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.dndcharactersheet.Controller.CharDisplayController;
import edu.utsa.cs3443.dndcharactersheet.R;
/**
 * @author Israel Chaves  11/16
 * Brandan Ariel
 * Jamie Gallegos
 * Rene Guardiola
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class CharDisplayActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_base_stats_display);

        //Calls Controller
        CharDisplayController charDisplayController = new CharDisplayController(this);

        //Declares functional buttons and sets their listener
        Button spell = findViewById(R.id.spells);
        spell.setOnClickListener(charDisplayController);
        Button weapons = findViewById(R.id.weapons);
        weapons.setOnClickListener(charDisplayController);


    }
}
