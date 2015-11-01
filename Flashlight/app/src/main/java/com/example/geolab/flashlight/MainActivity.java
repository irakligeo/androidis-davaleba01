package com.example.geolab.flashlight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private Button blue, green, yellow, red, white;
    private RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (RelativeLayout) findViewById(R.id.main);

    }

    static int color;
    @Override
    public void onClick(View v) {
        color=0;
        switch (v.getId()){

            case R.id.blue:
                color= R.color.lurji;
                break;
            case R.id.green:
                color= R.color.mwvane;
                break;
            case R.id.yellow:
                color= R.color.yviteli;
                break;
            case R.id.red:
                color= R.color.witeli;
                break;
            case R.id.white:
                color= R.color.tetri;
                break;
        }

        layout.setBackgroundColor(getResources().getColor(color));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("color", color);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        color = savedInstanceState.getInt("color");
        layout.setBackgroundColor(getResources().getColor(color));

    }
}
