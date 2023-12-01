package edu.utsa.cs3443.dndcharactersheet.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.dndcharactersheet.R;
/**
 * @author Israel Chaves  11/16
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class CharWeaponsDisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Displays Weapons page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_weapons_display);
    }
}
