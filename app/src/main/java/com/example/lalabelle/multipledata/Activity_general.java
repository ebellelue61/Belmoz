package com.example.lalabelle.multipledata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Activity_general extends AppCompatActivity {

    private DatabaseReference Gdatabase , Gdatabase2 ,Gdatabase3;
    private TextView Gnameview , Gnameview2, Gnameview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        Gdatabase = FirebaseDatabase.getInstance().getReference().child("Name");
        Gdatabase2 = FirebaseDatabase.getInstance().getReference().child("HN");
        Gdatabase3 = FirebaseDatabase.getInstance().getReference().child("Next Appointment");

        Gnameview = (TextView) findViewById((R.id.Pinfo1));
        Gnameview2 = (TextView) findViewById((R.id.Pinfo2));
        Gnameview3 = (TextView) findViewById((R.id.Pinfo3));

        Gdatabase.addValueEventListener((new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Name = dataSnapshot.getValue().toString();
                Gnameview.setText("Name: " + Name);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }));


        Gdatabase2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String hn = dataSnapshot.getValue().toString();
                Gnameview2.setText("HN: " + hn);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        Gdatabase3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Appointment = dataSnapshot.getValue().toString();
                Gnameview3.setText("Next Appointment: " + Appointment);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




    }
}
