package com.example.lalabelle.multipledata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Activity_multiple extends AppCompatActivity {

    private DatabaseReference mDatabase, mDatabase2,mDatabase3,mDatabase4,mDatabase5,mDatabase6;

    private TextView mNameView, mNameView2 ,mNameView3;
    private TextView mQuantity, mQuantity2, mQuantity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("ชื่อยา1");
        mDatabase2 = FirebaseDatabase.getInstance().getReference().child("การรับประทาน1");
        mDatabase3 = FirebaseDatabase.getInstance().getReference().child("ชื่อยา2");
        mDatabase4 = FirebaseDatabase.getInstance().getReference().child("การรับประทาน2");
        mDatabase5 = FirebaseDatabase.getInstance().getReference().child("ชื่อยา3");
        mDatabase6 = FirebaseDatabase.getInstance().getReference().child("การรับประทาน3");

        mNameView = (TextView) findViewById(R.id.name_view);
        mQuantity = (TextView) findViewById(R.id.quan_view);
        mNameView2 = (TextView) findViewById(R.id.name2_view);
        mQuantity2 = (TextView) findViewById(R.id.quan2_view);
        mNameView3 = (TextView) findViewById(R.id.name3_view);
        mQuantity3 = (TextView) findViewById(R.id.quan3_view);

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String name = dataSnapshot.getValue().toString();
                mNameView.setText("ชื่อยา1 : " + name);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        mDatabase2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String taking = dataSnapshot.getValue().toString();
                mQuantity.setText("การรับประทาน1 : " + taking);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mDatabase3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String name2 = dataSnapshot.getValue().toString();
                mNameView2.setText("ชื่อยา2 : " + name2);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mDatabase4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String taking2 = dataSnapshot.getValue().toString();
                mQuantity2.setText("การรับประทาน2 : " + taking2);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mDatabase5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String name3 = dataSnapshot.getValue().toString();
                mNameView3.setText("ชื่อยา3 : " + name3);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mDatabase6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String taking3 = dataSnapshot.getValue().toString();
                mQuantity3.setText("การรับประทาน3 : " + taking3);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

}
