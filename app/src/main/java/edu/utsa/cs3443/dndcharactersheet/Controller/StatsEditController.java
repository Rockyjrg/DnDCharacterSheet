package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.dndcharactersheet.CharSpellsDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.Model.Character;
import edu.utsa.cs3443.dndcharactersheet.R;
import edu.utsa.cs3443.dndcharactersheet.StatsEditActivity;

public class StatsEditController implements View.OnClickListener{

    public StatsEditActivity activity;

    public Character current;

    public StatsEditController(StatsEditActivity activity, Character current){
        this.activity = activity;
        this.current = current;
        setUpButtons();
    }

    private void setUpButtons(){
        Button spell = (Button) activity.findViewById(R.id.spells);
        spell.setOnClickListener(this::onClick);
        Button weapons = activity.findViewById(R.id.weapons);
        weapons.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        int id = v.getId();

        if (v == activity.findViewById(R.id.spells)) {
            Intent intent = new Intent(activity, CharSpellsDisplayActivity.class);
            intent.putExtra("Current", current);
            activity.startActivity(intent);
        }
    }
}
