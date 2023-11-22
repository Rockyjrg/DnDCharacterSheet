package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.content.res.AssetManager;
import android.view.View;

import edu.utsa.cs3443.dndcharactersheet.MainActivity;

public class MainController implements View.OnClickListener {

    MainActivity activity;

    AssetManager assets;
    public MainController(MainActivity activity) {
        this.activity = activity;
        assets = activity.getAssets();
    }

    @Override
    public void onClick(View view) {



    }
}
