package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm3;

import java.util.ArrayList;
import java.util.List;

public class Algorithm3_1 extends AppCompatActivity implements View.OnClickListener {

    private TextView mAlgorithm32ResultTV;
    private Button mGo33;
    private List<Double> doubleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm3_1);
        initView();
        doubleList.add(9.8);
        doubleList.add(12D);
        doubleList.add(45D);
        doubleList.add(67D);
        doubleList.add(23D);
        doubleList.add(1.98);
        doubleList.add(2.55);
        doubleList.add(45D);
        MyAlgorithm3.IntegerArrayManager integerArrayManager = new MyAlgorithm3.IntegerArrayManager(doubleList);
        mAlgorithm32ResultTV.append("最大数:" + integerArrayManager.getMax()+ "\n");
        mAlgorithm32ResultTV.append("最小数:" + integerArrayManager.getMin() + "\n");
        mAlgorithm32ResultTV.append("平均值:" + integerArrayManager.getAverage() + "\n");

    }

    private void initView() {
        mAlgorithm32ResultTV = (TextView) findViewById(R.id.algorithm3_1ResultTV);
        mGo33 = (Button) findViewById(R.id.go3_3);

        mGo33.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go3_3:
                Intent intent = new Intent(Algorithm3_1.this, Algorithm3_2.class);
                startActivity(intent);
                break;
        }
    }
}
