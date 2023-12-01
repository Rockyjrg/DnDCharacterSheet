package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.content.Intent;
import android.content.res.AssetManager;
import android.view.View;

import edu.utsa.cs3443.dndcharactersheet.View.CharDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.View.CharSpellsDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.View.CharWeaponsDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.R;
/**
 * @author Israel Chaves  11/16
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class CharDisplayController implements View.OnClickListener {

    //get activity
    CharDisplayActivity activity;

    AssetManager assets;

    //constructor
    public CharDisplayController(CharDisplayActivity activity) {
        this.activity = activity;
        assets = activity.getAssets();
    }

    @Override
    public void onClick(View v) {

        //sets clicked id to an integer for convenience
        int id = v.getId();

        //determines which button in the character view is clicked an moves the user to the appropriate page
        if(id == R.id.spells) {
            Intent intent = new Intent(activity, CharSpellsDisplayActivity.class);
            activity.startActivity(intent);

        }else if(id == R.id.weapons) {
            Intent intent = new Intent(activity, CharWeaponsDisplayActivity.class);
            activity.startActivity(intent);
        }
    }
}
