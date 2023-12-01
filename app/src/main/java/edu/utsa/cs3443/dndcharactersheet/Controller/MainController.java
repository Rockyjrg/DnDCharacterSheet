package edu.utsa.cs3443.dndcharactersheet.Controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.utsa.cs3443.dndcharactersheet.View.CharDisplayActivity;
import edu.utsa.cs3443.dndcharactersheet.View.MainActivity;
import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;

import edu.utsa.cs3443.dndcharactersheet.Model.Character;
import edu.utsa.cs3443.dndcharactersheet.R;
import edu.utsa.cs3443.dndcharactersheet.View.StatsEditActivity;

/**
 * @author Brandon Ariel  11/22
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class MainController implements View.OnClickListener {

    MainActivity activity;

    //Creates four empty characters which effectively act as save slots
    Character char1;
    Character char2;
    Character char3;
    Character char4;


    AssetManager assets;

    //constructor
    public MainController(MainActivity activity) {
        this.activity = activity;
        assets = activity.getAssets();
        //When the class is called, checks if the first character has been properly declared
        if(char1 == null)
            //The following class populated the character class with data values
            instateChar();
        else
            System.out.println("Complete");
        //Updates the buttons to represent the character names
        updateButtonNames();
    }

    private void instateChar(){

        System.out.println("Did it!");
        //Creates four statistics classes
        Statistics stats1 = new Statistics(10,10,10,10,10,10);
        Statistics stats2 = new Statistics(10,10,10,10,10,10);
        Statistics stats3 = new Statistics(10,10,10,10,10,10);
        Statistics stats4 = new Statistics(10,10,10,10,10,10);

        //Creates 4 Character classes attributes the Statistics classes to them

        char1 = new Character("Umbreon","Genasi","Paladin",stats1);
        char2 = new Character("Wafer","Titan","Monk",stats2);
        char3 = new Character("Trio","Mulwar","Archer",stats3);
        char4 = new Character("EMPTY","EMPTY","EMPTY",stats4);
    }

    @Override
    public void onClick(View view) {

        //Denotes id to integer variable for convenience
        int id = view.getId();

        //Defaults "current" to character 1 to avoid null reference
        Character current = char1;

        //if the button pressed requires a characeter input, the following does so based on the save slot
        if(id != R.id.credits) {
            current = getChar(id);
        }
        else
            //if the one button that doesn't take a character input is pressed, then the toast is displayed with credits
            Toast.makeText(activity, "Israel Chavez, Brandon Ariel, Jaime Gallegos, Gael Sifuentes, Rene Guardiola", Toast.LENGTH_SHORT).show();

        //Switches to appropriate screen with appropriate character
        getScreen(id,current);

        //updates the buttons again for redundancy's sake
        updateButtonNames();
    }
    private void updateButtonNames(){
        //references each button
        Button button1 = (Button) activity.findViewById(R.id.Class1);
        Button button2 = (Button) activity.findViewById(R.id.Class2);
        Button button3 = (Button) activity.findViewById(R.id.Class3);
        Button button4 = (Button) activity.findViewById(R.id.Class4);

        //sets their text to character name
        button1.setText(char1.getName());
        button2.setText(char2.getName());
        button3.setText(char3.getName());
        button4.setText(char4.getName());

    }
    public Character getChar(int id){
        if (id == R.id.Class1|| id == R.id.createClass1 || id == R.id.editClass1 || id == R.id.deleteClass1){
            System.out.println("Char1");

            //If the buttons pressed have anything to do with the first character object, it returns the first character object
            return char1;
        }else if (id == R.id.Class2|| id == R.id.createClass2 || id == R.id.editClass2 || id == R.id.deleteClass2){
            System.out.println("Char2");

            //If the buttons pressed have anything to do with the Second character object, it returns the second character object
            return char2;
        }else if (id == R.id.Class3|| id == R.id.createClass3 || id == R.id.editClass3 || id == R.id.deleteClass3){
            System.out.println("Char3");

            //If the buttons pressed have anything to do with the third character object, it returns the third character object
            return char3;
        }
        else{
            System.out.println("Char4");
            //if none of the previous conditions passed for some reason other than the intended purpose,
            // the 4th character object is returned
            return char4;
        }

    }
    private void getScreen(int id, Character current){
        //determines which screen is changed to depending on the action
        if(id == R.id.Class1 || id == R.id.Class2 || id == R.id.Class3 || id == R.id.Class4) {
            System.out.println("Display");
            //creates intent
            Intent intent = new Intent(activity, CharDisplayActivity.class);

            //Serializes appropriate character object
            intent.putExtra("DisplayCurrent",current);

            activity.startActivity(intent);
        } else if(id == R.id.createClass1 || id == R.id.createClass2 || id == R.id.createClass3 || id == R.id.createClass4) {

            //if the current character object registers as "EMPTY" in their name, then they are considered an empty object
            //allowing the create button to work
            if (current.getName() == "EMPTY") {

                //creates intent
                Intent intent = new Intent(activity, StatsEditActivity.class);

                //Sets appropriate character object for Serialization
                intent.putExtra("CreateCurrent", current);
                activity.startActivity(intent);
            }
            else
                //If the character object is considered 'filled' with a name other than
                //"EMPTY" button doesn't work and displays toast
                Toast.makeText(activity, "Save Slot in use", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.editClass1 || id == R.id.editClass2 || id == R.id.editClass3 || id == R.id.editClass4) {
            //Creates intent
            Intent intent = new Intent(activity, StatsEditActivity.class);

            //Sets appropriate character object for Serialization
            intent.putExtra("EditCurrent",current);
            activity.startActivity(intent);
        } else if (id == R.id.deleteClass1 || id == R.id.deleteClass2 || id == R.id.deleteClass3 || id == R.id.deleteClass4) {
            if(current.getName() != "EMPTY")
                //If the character object is registered as 'filled' then it allows the Delete function to go through
                //with the appropriate character object
                showDeleteConfirmation(id,current);
            else
                //if not, it displays a toast reiterating the fact that its empty
                Toast.makeText(activity, "Save Slot has no character", Toast.LENGTH_SHORT).show();
        }
    }



    public void showDeleteConfirmation(final int id, Character current) {
        //Creates allert builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        //Gets character name in quesiton
        String characterName = current.getName();

        //Displays message
        builder.setMessage("Are you sure you want to delete " + characterName + "?")
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                //On an confirmation, the delete function is finalized
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    deleteCharacter(id, current);
                }
            })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //On a decline, the message is dismissed
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

        dialog.show();


    }

    public void deleteCharacter(int id, Character current) {
        //Creates empty Statistics object to set character object to a zero value
        Statistics stats = new Statistics(0,0,0,0,0,0) ;

        //Compares character object in question with available character objects
        //and sets it to EMPTY
        if(current == char1)
            char1 = new Character("EMPTY","EMPTY","EMPTY",stats);
        else if(current == char2)
            char2 = new Character("EMPTY","EMPTY","EMPTY",stats);
        else if(current == char3)
            char3 = new Character("EMPTY","EMPTY","EMPTY",stats);
        else
            char4 = new Character("EMPTY","EMPTY","EMPTY",stats);
        //displays message that character in question has effectively been deleted
        Toast.makeText(activity, current.getName() + " Deleted. May take a moment to update", Toast.LENGTH_SHORT).show();
    }
}
