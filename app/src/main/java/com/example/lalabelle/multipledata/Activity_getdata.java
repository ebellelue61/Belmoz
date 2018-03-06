package com.example.lalabelle.multipledata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Activity_getdata extends AppCompatActivity {

    private DatabaseReference Hdatabase ;

    private TextView HnameView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);

        Hdatabase = FirebaseDatabase.getInstance().getReference().child("History");

        HnameView = (TextView) findViewById((R.id.history1));

        Hdatabase.addValueEventListener((new ValueEventListener() {
            int i=0;
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                    for(;;) {
                        String history = snapshot.getValue().toString();
                        HnameView.setText("History: " + history);
                    }
                   // i=i+1;
                }

              //   List<String> history = (ArrayList<String>)dataSnapshot.getValue();
                // HnameView.setText("History: " + history);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }));




    }
}
