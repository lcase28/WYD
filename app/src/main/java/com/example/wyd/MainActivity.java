package com.example.wyd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get view from activity_main.xml
        setContentView(R.layout.activity_main);
        //locate button in activity_main.xml
        button=(Button) findViewById(R.id.signinbutton);
        //capture button clicks
        button.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                //start SignInActivity.class
                Intent myIntent= new Intent(MainActivity.this,
                        SignInActivity.class);
                startActivity(myIntent);

            }
        });
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/
}

