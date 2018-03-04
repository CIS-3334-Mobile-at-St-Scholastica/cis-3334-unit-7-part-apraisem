package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HeartDetailActivity extends AppCompatActivity {

    TextView tvPulse; //initializing variables
    TextView tvRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_detail);

        tvPulse = (TextView) findViewById(R.id.textViewPulseDetail); //declaring variables
        tvRange = (TextView) findViewById(R.id.textViewRange);

        Bundle extras = getIntent().getExtras(); //gets information from the Bundle
        HeartRate hr = (HeartRate) extras.getSerializable(MainActivity.HEARTRATE_KEY);
        tvPulse.setText(hr.getPulse().toString());  //toString sets the value to a string value so it can display
        tvRange.setText(hr.getRangeName()); //displays information in the text fields
    }
}
