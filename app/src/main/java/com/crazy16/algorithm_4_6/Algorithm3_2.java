package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Algorithm3_2 extends AppCompatActivity implements View.OnClickListener {

    private TextView mAlgorithm32ResultTV;
    private Button mGo33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm3_2);
        initView();
        String str1 = "FEDCBA";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String str2 = String.valueOf(chars[i]);
            mAlgorithm32ResultTV.append(str2);
        }
        File file = new File("/storage/emulated/0/123.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(str1);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void initView() {
        mAlgorithm32ResultTV = (TextView) findViewById(R.id.algorithm3_2ResultTV);
        mGo33 = (Button) findViewById(R.id.go3_3);

        mGo33.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go3_3:
                Intent intent = new Intent(Algorithm3_2.this, Algorithm3_3.class);
                startActivity(intent);
                break;
        }
    }
}
