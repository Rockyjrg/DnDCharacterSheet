package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.content.Intent;
import android.content.res.AssetManager;
import android.view.View;

import edu.utsa.cs3443.dndcharactersheet.CharDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.CharSpellsDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.CharWeaponsDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.MainActivity;
import edu.utsa.cs3443.dndcharactersheet.R;

public class CharDisplayController implements View.OnClickListener {

    CharDisplayActivity activity;

    AssetManager assets;
    public CharDisplayController(CharDisplayActivity activity) {
        this.activity = activity;
        assets = activity.getAssets();
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if(id == R.id.spells) {
            Intent intent = new Intent(activity, CharSpellsDisplayActivity.class);
            activity.startActivity(intent);

        }else if(id == R.id.weapons) {
            Intent intent = new Intent(activity, CharWeaponsDisplayActivity.class);
            activity.startActivity(intent);
        }
    }
}
