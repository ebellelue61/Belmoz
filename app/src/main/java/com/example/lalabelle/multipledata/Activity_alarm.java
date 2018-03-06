package com.example.lalabelle.multipledata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Activity_alarm extends AppCompatActivity {

    private DatabaseReference Adatabase , Adatabase2 ,Adatabase3;
    private TextView Anameview , Anameview2, Anameview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        Adatabase = FirebaseDatabase.getInstance().getReference().child("Alarm");

        Anameview = (TextView) findViewById((R.id.al1));


        Adatabase.addValueEventListener((new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String al = dataSnapshot.getValue().toString();
                Anameview.setText("Alarm: " + al);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }));

    }}