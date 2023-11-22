package edu.utsa.cs3443.dndcharactersheet;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.dndcharactersheet.Controller.MainController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainController controller1 = new MainController(this);

        Button edit1 = findViewById(R.id.editButton);
        edit1.setOnClickListener(controller1);

        Button delete1 = findViewById(R.id.deleteButton);
        delete1.setOnClickListener(controller1);

        Button edit2 = findViewById(R.id.editButton2);
        edit2.setOnClickListener(controller1);

        Button delete2 = findViewById(R.id.deleteButton2);
        delete2.setOnClickListener(controller1);

        Button edit3 = findViewById(R.id.editButton3);
        edit3.setOnClickListener(controller1);

        Button delete3 = findViewById(R.id.deleteButton3);
        delete3.setOnClickListener(controller1);

        Button edit4 = findViewById(R.id.editButton4);
        edit4.setOnClickListener(controller1);

        Button delete4 = findViewById(R.id.deleteButton4);
        delete4.setOnClickListener(controller1);

        Button edit5 = findViewById(R.id.editButton5);
        edit5.setOnClickListener(controller1);

        Button delete5 = findViewById(R.id.deleteButton5);
        delete5.setOnClickListener(controller1);



    }

    public static class StatsEditActivity {
    }
}