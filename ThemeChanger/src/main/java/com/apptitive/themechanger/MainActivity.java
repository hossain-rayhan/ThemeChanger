package com.apptitive.themechanger;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.apptitive.themechanger.helper.MathEval;

public class MainActivity extends Activity implements View.OnClickListener {

    LinearLayout llMainBody;
    MathEval mathEval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMainBody = (LinearLayout) findViewById(R.id.ll_main_body);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);

        mathEval = new MathEval();
        Double result = mathEval.evaluate("5+5+4-1*3");
        Log.e("MathEval ", "" + result);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                llMainBody.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                break;
            case R.id.btn_2:
                llMainBody.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
                break;
            case R.id.btn_3:
                llMainBody.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                break;
            default:
                break;
        }
    }
}
