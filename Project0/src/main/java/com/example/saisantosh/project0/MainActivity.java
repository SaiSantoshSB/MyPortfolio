package com.example.saisantosh.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
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
