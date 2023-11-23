package edu.utsa.cs3443.dndcharactersheet;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.dndcharactersheet.Controller.CharDisplayController;

public class CharDisplayActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_base_stats_display);

        CharDisplayController charDisplayController = new CharDisplayController(this);

        Button spell = findViewById(R.id.spells);
        spell.setOnClickListener(charDisplayController);
        Button weapons = findViewById(R.id.weapons);
        weapons.setOnClickListener(charDisplayController);


    }
}
