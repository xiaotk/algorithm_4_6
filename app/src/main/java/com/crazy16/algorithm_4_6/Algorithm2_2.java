package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm2;

public class Algorithm2_2 extends AppCompatActivity implements View.OnClickListener {

    private TextView mAlgorithm22ResultTV;
    private Button mGo23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm2_2);
        initView();
        int f2 = MyAlgorithm2.getFactorial2(2);
        int f4 = MyAlgorithm2.getFactorial2(4);
        int f5 = MyAlgorithm2.getFactorial2(5);
        mAlgorithm22ResultTV.setText(String.valueOf(f2+f4+f5));
    }

    private void initView() {
        mAlgorithm22ResultTV = (TextView) findViewById(R.id.algorithm2_2ResultTV);
        mGo23 = (Button) findViewById(R.id.go2_3);

        mGo23.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go2_3:
                Intent intent = new Intent(Algorithm2_2.this, Algorithm2_3.class);
                startActivity(intent);
                break;
        }
    }
}
