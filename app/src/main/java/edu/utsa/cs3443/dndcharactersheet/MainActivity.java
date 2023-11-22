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

        Button class1 = findViewById(R.id.Class1);
        class1.setOnClickListener(controller1);

        Button editClass1 = findViewById(R.id.editClass1);
        editClass1.setOnClickListener(controller1);

        Button delete1 = findViewById(R.id.deleteClass1);
        delete1.setOnClickListener(controller1);

        Button class2 = findViewById(R.id.Class2);
        class2.setOnClickListener(controller1);

        Button editClass2 = findViewById(R.id.editClass2);
        editClass2.setOnClickListener(controller1);

        Button delete2 = findViewById(R.id.deleteClass2);
        delete2.setOnClickListener(controller1);

        Button class3 = findViewById(R.id.Class3);
        class3.setOnClickListener(controller1);

        Button editClass3 = findViewById(R.id.editClass3);
        editClass3.setOnClickListener(controller1);

        Button delete3 = findViewById(R.id.deleteClass3);
        delete3.setOnClickListener(controller1);

        Button class4 = findViewById(R.id.Class4);
        class4.setOnClickListener(controller1);

        Button editClass4 = findViewById(R.id.editClass4);
        editClass4.setOnClickListener(controller1);

        Button delete4 = findViewById(R.id.deleteClass4);
        delete4.setOnClickListener(controller1);

    }

}