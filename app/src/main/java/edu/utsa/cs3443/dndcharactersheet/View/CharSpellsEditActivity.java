package edu.utsa.cs3443.dndcharactersheet.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.dndcharactersheet.R;
/**
 * @author Gael Sifuentes  11/16
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class CharSpellsEditActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        //Displays the spells edit page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_spells_edit);

    }
}
