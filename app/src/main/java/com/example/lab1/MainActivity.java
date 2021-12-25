package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button autorInfo;
    private Button autorGoals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autorInfo=(Button) findViewById(R.id.AuthorInfo);
        autorGoals=(Button) findViewById(R.id.myGoals);

        autorInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autorInfoToast();
            }
        });
        autorGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autorGoalsToast();
            }
        });
    }

    public void autorInfoToast(){
        LayoutInflater inflater=getLayoutInflater();
        View layout =inflater.inflate(R.layout.autor_info_toast, (ViewGroup) findViewById(R.id.authorInfoToast));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public void autorGoalsToast(){
        LayoutInflater inflater=getLayoutInflater();
        View layout =inflater.inflate(R.layout.autor_goals_toast, (ViewGroup) findViewById(R.id.autorGoalsToast));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}