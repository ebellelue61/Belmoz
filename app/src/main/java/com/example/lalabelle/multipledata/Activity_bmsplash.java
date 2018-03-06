package com.example.lalabelle.multipledata;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

public class Activity_bmsplash extends AppCompatActivity {

    public Button buttonsub;
    public Button button2;
    public Button button3;
    public Button button4;

        public void init(){
            buttonsub = (Button)findViewById(R.id.buttonsub);
            buttonsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent start_but = new Intent(Activity_bmsplash.this,Activity_multiple.class);

                    startActivity(start_but);
                }
            });
        }




        public void init2(){
            button2 = (Button)findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent start_but2 = new Intent(Activity_bmsplash.this,Activity_general.class);

                    startActivity(start_but2);
            }
        });
    }



    public void init3(){
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent start_but3 = new Intent(Activity_bmsplash.this,Activity_getdata.class);

                startActivity(start_but3);
            }
        });
    }


    public void init4(){
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent start_but4 = new Intent(Activity_bmsplash.this,Activity_alarm.class);

                startActivity(start_but4);
            }
        });
    }



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();
        init2();
        init3();
        init4();
    }
}
