package edu.ib.projekt_tom_2.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import edu.ib.projekt_tom_2.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btnStartClicked(View view) {
        Intent intent = new Intent(this, MeasurementActivity.class);
        startActivity(intent);
    }

    public void btnYourResultsClicked(View view) {
    }

    public void btnHealthInfoClicked(View view) {
    }
}
