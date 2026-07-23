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
        TextNote note1 = new TextNote();
        note1.setTitle("LAB4");
        note1.createdDate = "20/07/2026";
        note1.content = " Class ";
        note1.getSummary();
        CheckListNote list1 = new CheckListNote();
        list1.setTitle("My Task");
        list1.createdDate = "20/07/2026";
        list1.addItem("Program");
        list1.getSummary();
        User user1 = new User();
        user1.userId = "6812247018";
        user1.username = "PHAT";
        user1.email = "phat@gmail.com";
        user1.password = "123456";
        user1.login();
    }
}