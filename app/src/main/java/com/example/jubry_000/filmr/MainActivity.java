package com.example.jubry_000.filmr;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button rbtn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView)findViewById(R.id.myTextView);
        rbtn = (Button)findViewById(R.id.rbtn);
        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast rightButt = Toast.makeText(getBaseContext(), "You click on second button", Toast.LENGTH_LONG);
                rightButt.show();
                t.setText("Wow a button was clicked");
            }
        });
    }

    public void leftButton(View v) {
        Toast leftButt = Toast.makeText(getBaseContext(), "You click on first button", Toast.LENGTH_LONG);
        leftButt.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);
        leftButt.show();

        ImageView wat = (ImageView)findViewById(R.id.centerImage);
        wat.setImageResource(R.drawable.sunshine);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
