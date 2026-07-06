package com.example.free;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Note noteA = new Note();
        Note noteB = new Note();
        //Note note1 = new Note();
        noteA.title ="Do Lad";
        noteA.content = "create class diagram and code";
        noteA.createdDate = "6 July 2026";
        noteA.getSummary();

        noteB.title ="..";
        noteB.content = "";
        noteB.createdDate ="6 July 2026";
        noteB.getSummary();

        User note1 = new User();
        note1.UserId ="6812247018";
        note1.username = "PHAT";
        note1.email = "phat.chanate@gmail.com";
        note1.password ="11111111";
        note1.login();



    }
}