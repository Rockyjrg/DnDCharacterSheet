package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

        int id = view.getId();


        if(id == R.id.Class1 || id == R.id.Class2 || id == R.id.Class3 || id == R.id.Class4) {
            Intent intent = new Intent(activity, CharDisplayActivity.class);
            activity.startActivity(intent);
        } else if(id == R.id.createClass1 || id == R.id.createClass2 || id == R.id.createClass3 || id == R.id.createClass4) {
            Intent intent = new Intent(activity, StatsEditActivity.class);
            activity.startActivity(intent);
        } else if(id == R.id.editClass1 || id == R.id.editClass2 || id == R.id.editClass3 || id == R.id.editClass4) {
            Intent intent = new Intent(activity, StatsEditActivity.class);
            activity.startActivity(intent);
        } else if (id == R.id.deleteClass1 || id == R.id.deleteClass2 || id == R.id.deleteClass3 || id == R.id.deleteClass4) {
            showDeleteConfirmation(id);
        }



    }

    public void showDeleteConfirmation(final int id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        String characterName = "Umbreon";

        builder.setMessage("Are you sure you want to delete " + characterName + "?")
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    deleteCharacter(id);
                }
            })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

        dialog.show();


    }

    public void deleteCharacter(int id) {

    }
}
