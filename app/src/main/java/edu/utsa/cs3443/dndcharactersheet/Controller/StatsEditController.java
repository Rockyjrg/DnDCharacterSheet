package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.dndcharactersheet.View.CharSpellsDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.Model.Character;
import edu.utsa.cs3443.dndcharactersheet.R;
import edu.utsa.cs3443.dndcharactersheet.View.StatsEditActivity;

/**
 * @author Gael Sifuentes  11/22
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class StatsEditController implements View.OnClickListener{

    //Activity from view class
    public StatsEditActivity activity;

    //character variable for referencing character chosen
    public Character current;

    //Constructor
    public StatsEditController(StatsEditActivity activity, Character current){
        this.activity = activity;
        this.current = current;
        //the following function provides the buttons in the characterEdit view their funcitonality
        setUpButtons();
    }

    //When the user presses the button, it transfers them to the appropriate Activity
    private void setUpButtons(){
        Button spell = (Button) activity.findViewById(R.id.spells);
        spell.setOnClickListener(this::onClick);
        Button weapons = activity.findViewById(R.id.weapons);
        weapons.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        //Id set to an integer for convenience
        int id = v.getId();

        //Checks if the spellsEdit button is clicked
        if (v == activity.findViewById(R.id.spells)) {
            Intent intent = new Intent(activity, CharSpellsDisplayActivity.class);
            intent.putExtra("Current", current);
            activity.startActivity(intent);
        }
    }
}
