package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm;

public class Algorithm2 extends AppCompatActivity implements View.OnClickListener {

    private EditText mInputScoreET;
    private Button mGetScoreBtn;
    private Button mGo3;
    private MyAlgorithm.ScoreManager scoreManager = new MyAlgorithm.ScoreManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm2);
        initView();
    }

    private void initView() {
        mInputScoreET = (EditText) findViewById(R.id.inputScoreET);
        mGetScoreBtn = (Button) findViewById(R.id.getScoreBtn);
        mGo3 = (Button) findViewById(R.id.go3);

        mGetScoreBtn.setOnClickListener(this);
        mGo3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.getScoreBtn:
                submit();
                break;
            case R.id.go3:
                Intent intent = new Intent(Algorithm2.this, Algorithm3.class);
                startActivity(intent);
                break;
        }
    }

    private void submit() {
        // validate
        String inputScoreETString = mInputScoreET.getText().toString().trim();
        if (TextUtils.isEmpty(inputScoreETString)) {
            Toast.makeText(this, "输入学生成绩,输入-1结束", Toast.LENGTH_SHORT).show();
            return;
        }
        Integer socre = Integer.valueOf(inputScoreETString);
        if(socre != -1){
            scoreManager.addScore(socre);
            mInputScoreET.setText("");
        }else{
            String result = scoreManager.getResult();
            mInputScoreET.setText(result);
        }
    }
}
