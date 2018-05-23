package edu.hanover.cs323_averyodproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void orderDrink(View view){
        // the orderDrink method that is called when the order button is clicked
        Intent startNewActivity = new Intent(this, DrinkOrderedActivity.class);
        startActivity(startNewActivity);
    }


}
