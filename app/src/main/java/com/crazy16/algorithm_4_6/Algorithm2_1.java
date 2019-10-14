package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm;
import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm2;

import java.util.List;

public class Algorithm2_1 extends AppCompatActivity implements View.OnClickListener {

    private TextView mAlgorithm21ResultTV;
    private Button mGo22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm2_1);
        initView();
        List<String> rangePrime = MyAlgorithm2.SistersNumber.getRangePrime();
        mAlgorithm21ResultTV.setText(TextUtils.join("\n", rangePrime));
    }

    private void initView() {
        mAlgorithm21ResultTV = (TextView) findViewById(R.id.algorithm2_1ResultTV);
        mGo22 = (Button) findViewById(R.id.go2_2);

        mGo22.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go2_2:
                Intent intent = new Intent(Algorithm2_1.this, Algorithm2_2.class);
                startActivity(intent);
                break;
        }
    }
}
