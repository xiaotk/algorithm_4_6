package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mShow2PingFangTV;
    private EditText mGet2PingFangET;
    private Button mGet2PingFangBtn;
    private Button mGo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mShow2PingFangTV = (TextView) findViewById(R.id.show2PingFangTV);
        mGet2PingFangET = (EditText) findViewById(R.id.get2PingFangET);
        mGet2PingFangBtn = (Button) findViewById(R.id.get2PingFangBtn);
        mGo2 = (Button) findViewById(R.id.go2);

        mGet2PingFangBtn.setOnClickListener(this);
        mGo2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.get2PingFangBtn:
                submit();
                break;
            case R.id.go2:
                Intent intent = new Intent(MainActivity.this, Algorithm2.class);
                startActivity(intent);
                break;
        }
    }

    private void submit() {
        // validate
        String get2PingFangETString = mGet2PingFangET.getText().toString().trim();
        if (TextUtils.isEmpty(get2PingFangETString)) {
            Toast.makeText(this, "输入要计算的数", Toast.LENGTH_SHORT).show();
            return;
        }
        int twoPingFang = MyAlgorithm.getTwoPingFang(Integer.valueOf(get2PingFangETString));
        mShow2PingFangTV.setText("结果:" + twoPingFang);


    }
}
