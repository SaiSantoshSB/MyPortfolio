package com.example.saisantosh.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button popularMovies,
            stockHawk,
            buildItBigger,
            appMaterial,
            goUbiquitous,
            capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popularMovies = (Button) findViewById(R.id.movies);
        stockHawk = (Button) findViewById(R.id.stock_hawk);
        buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        appMaterial = (Button) findViewById(R.id.app_material);
        goUbiquitous = (Button) findViewById(R.id.ubiquitous);
        capstone = (Button) findViewById(R.id.capstone);
        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        appMaterial.setOnClickListener(this);
        goUbiquitous.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.movies:
                Toast.makeText(getApplicationContext(), "This Button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_hawk:
                Toast.makeText(getApplicationContext(), "This Button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger:
                Toast.makeText(getApplicationContext(), "This Button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.app_material:
                Toast.makeText(getApplicationContext(), "This Button will launch my  Make your Material App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ubiquitous:
                Toast.makeText(getApplicationContext(), "This Button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(getApplicationContext(), "This Button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}
