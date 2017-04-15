package com.aqlogicst.tallycounter;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class TallyCounterActivity extends AppCompatActivity {

    private TextView lblDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tally_counter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        lblDisplay=(TextView) findViewById(R.id.lblDisplay);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/digital.ttf");
        lblDisplay.setTypeface(font);

    }

}
