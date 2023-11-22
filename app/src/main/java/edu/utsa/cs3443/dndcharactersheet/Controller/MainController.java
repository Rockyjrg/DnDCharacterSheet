package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.content.Intent;
import android.content.res.AssetManager;
import android.view.View;

import edu.utsa.cs3443.dndcharactersheet.CharDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.MainActivity;
import edu.utsa.cs3443.dndcharactersheet.R;
import edu.utsa.cs3443.dndcharactersheet.StatsEditActivity;

public class MainController implements View.OnClickListener {

    MainActivity activity;

    AssetManager assets;
    public MainController(MainActivity activity) {
        this.activity = activity;
        assets = activity.getAssets();
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.Class2 | view.getId() == R.id.Class3 || view.getId() == R.id.Class4 ) {
            Intent intent = new Intent(activity, CharDisplayActivity.class);
            activity.startActivity(intent);
        } else if(view.getId() == R.id.editClass1 || view.getId() == R.id.editClass2 || view.getId() == R.id.editClass3) {
            Intent intent = new Intent(activity, StatsEditActivity.class);
            activity.startActivity(intent);
        } else if(view.getId() == R.id.deleteClass1 || view.getId() == R.id.deleteClass2 || view.getId() == R.id.deleteClass3 ||) {

        }



    }
}
