package edu.hanover.cs323_averyodproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class DrinkOrderedActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_ordered);
        Toast.makeText(this, "", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Your order is ready!", Toast.LENGTH_SHORT).show();
    }

}
