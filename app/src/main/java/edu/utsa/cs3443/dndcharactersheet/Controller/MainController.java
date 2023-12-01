package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.utsa.cs3443.dndcharactersheet.CharDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.MainActivity;
import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;

import edu.utsa.cs3443.dndcharactersheet.Model.Character;
import edu.utsa.cs3443.dndcharactersheet.R;
import edu.utsa.cs3443.dndcharactersheet.StatsEditActivity;

public class MainController implements View.OnClickListener {

    MainActivity activity;

    Character char1;
    Character char2;
    Character char3;
    Character char4;


    AssetManager assets;
    public MainController(MainActivity activity) {
        this.activity = activity;
        assets = activity.getAssets();
        if(char1 == null)
            instateChar();
        else
            System.out.println("Got one");
        updateButtonNames();
    }

    private void instateChar(){

        System.out.println("did it!");
        Statistics stats1 = new Statistics(10,10,10,10,10,10);
        Statistics stats2 = new Statistics(10,10,10,10,10,10);
        Statistics stats3 = new Statistics(10,10,10,10,10,10);
        Statistics stats4 = new Statistics(10,10,10,10,10,10);

        char1 = new Character("Umbreon","Genasi","Paladin",stats1);
        char2 = new Character("Wafer","Titan","Monk",stats2);
        char3 = new Character("Trio","Mulwar","Archer",stats3);
        char4 = new Character("EMPTY","EMPTY","EMPTY",stats4);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        Character current = char1;
        if(id != R.id.credits) {
            current = getChar(id);
        }
        else
            Toast.makeText(activity, "Israel Chavez, Brandon Ariel, Jaime Gallegos, Gael Sifuentes, Rene Guardiola", Toast.LENGTH_SHORT).show();

        getScreen(id,current);

        /*if(id == R.id.Class1 || id == R.id.Class2 || id == R.id.Class3 || id == R.id.Class4) {
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
        } /*else if(id == R.id.credits) {
            Toast.makeText(activity, "Israel Chavez, Brandon Ariel, Jaime Gallegos, Gael Sifuentes, Rene Guardiola", Toast.LENGTH_SHORT).show();
        }*/
        updateButtonNames();
    }
    private void updateButtonNames(){
        Button button1 = (Button) activity.findViewById(R.id.Class1);
        Button button2 = (Button) activity.findViewById(R.id.Class2);
        Button button3 = (Button) activity.findViewById(R.id.Class3);
        Button button4 = (Button) activity.findViewById(R.id.Class4);

        button1.setText(char1.getName());
        button2.setText(char2.getName());
        button3.setText(char3.getName());
        button4.setText(char4.getName());

    }
    private void getScreen(int id, Character current){
        if(id == R.id.Class1 || id == R.id.Class2 || id == R.id.Class3 || id == R.id.Class4) {
            System.out.println("Display");
            Intent intent = new Intent(activity, CharDisplayActivity.class);
            intent.putExtra("DisplayCurrent",current);
            activity.startActivity(intent);
        } else if(id == R.id.createClass1 || id == R.id.createClass2 || id == R.id.createClass3 || id == R.id.createClass4) {
            if (current.getName() == "EMPTY") {
                Intent intent = new Intent(activity, StatsEditActivity.class);
                intent.putExtra("CreateCurrent", current);
                activity.startActivity(intent);
            }
            else
                Toast.makeText(activity, "Save Slot in use", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.editClass1 || id == R.id.editClass2 || id == R.id.editClass3 || id == R.id.editClass4) {
            Intent intent = new Intent(activity, StatsEditActivity.class);
            intent.putExtra("EditCurrent",current);
            activity.startActivity(intent);
        } else if (id == R.id.deleteClass1 || id == R.id.deleteClass2 || id == R.id.deleteClass3 || id == R.id.deleteClass4) {
            if(current.getName() != "EMPTY")
                showDeleteConfirmation(id,current);
            else
                Toast.makeText(activity, "Save Slot has no character", Toast.LENGTH_SHORT).show();
        }
    }

    public Character getChar(int id){
        if (id == R.id.Class1|| id == R.id.createClass1 || id == R.id.editClass1 || id == R.id.deleteClass1){
            System.out.println("Char1");
            return char1;
        }else if (id == R.id.Class2|| id == R.id.createClass2 || id == R.id.editClass2 || id == R.id.deleteClass2){
            System.out.println("Char2");
            return char2;
        }else if (id == R.id.Class3|| id == R.id.createClass3 || id == R.id.editClass3 || id == R.id.deleteClass3){
            System.out.println("Char3");
            return char3;
        }
        else{
            System.out.println("Char4");
            return char4;
        }

    }


    public void showDeleteConfirmation(final int id, Character current) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        String characterName = current.getName();

        builder.setMessage("Are you sure you want to delete " + characterName + "?")
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    deleteCharacter(id, current);
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

    public void deleteCharacter(int id, Character current) {
        Statistics stats = new Statistics(0,0,0,0,0,0) ;
        if(current == char1)
            char1 = new Character("EMPTY","EMPTY","EMPTY",stats);
        else if(current == char2)
            char2 = new Character("EMPTY","EMPTY","EMPTY",stats);
        else if(current == char3)
            char3 = new Character("EMPTY","EMPTY","EMPTY",stats);
        else
            char4 = new Character("EMPTY","EMPTY","EMPTY",stats);
        Toast.makeText(activity, current.getName() + " Deleted. May take a moment to update", Toast.LENGTH_SHORT).show();
    }
}
