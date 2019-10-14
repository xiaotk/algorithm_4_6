package com.crazy16.algorithm_4_6;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm3;

public class Algorithm3_3 extends AppCompatActivity implements View.OnClickListener {

    private EditText mInputMoneyET;
    private Button mGetTaxBTN;
    private TextView mAlgorithm33ResultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm3_3);
        initView();
    }

    private void initView() {
        mInputMoneyET = (EditText) findViewById(R.id.inputMoneyET);
        mGetTaxBTN = (Button) findViewById(R.id.getTaxBTN);

        mGetTaxBTN.setOnClickListener(this);
        mAlgorithm33ResultTV = (TextView) findViewById(R.id.algorithm3_3ResultTV);
        mAlgorithm33ResultTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.getTaxBTN:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        String inputMoneyETString = mInputMoneyET.getText().toString().trim();
        if (TextUtils.isEmpty(inputMoneyETString)) {
            Toast.makeText(this, "请输入月工资", Toast.LENGTH_SHORT).show();
            return;
        }
        Double aDouble = Double.valueOf(inputMoneyETString);
        double tax = MyAlgorithm3.getTax(aDouble>3000?aDouble-3000:aDouble);
        mAlgorithm33ResultTV.setText("你需要交" + tax);

    }
}
