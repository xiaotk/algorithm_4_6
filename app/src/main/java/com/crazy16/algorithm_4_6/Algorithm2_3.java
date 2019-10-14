package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.Circle;
import com.crazy16.algorithm_4_6.algorithm.Rectangle;
import com.crazy16.algorithm_4_6.algorithm.Triangle;

public class Algorithm2_3 extends AppCompatActivity implements View.OnClickListener {

    private TextView mAlgorithm23ResultTV;
    private Button mGo31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm2_3);
        initView();

        Triangle triangle = new Triangle(5, 6);
        mAlgorithm23ResultTV.append("三角形面积:" + triangle.calArea() + "\n");
        Rectangle rectangle = new Rectangle(5, 12);
        mAlgorithm23ResultTV.append("矩形面积:" + rectangle.calArea() + "\n");
        Circle circle = new Circle(5);
        mAlgorithm23ResultTV.append("园的面积:" + circle.calArea() + "\n");

    }

    private void initView() {
        mAlgorithm23ResultTV = (TextView) findViewById(R.id.algorithm2_3ResultTV);
        mGo31 = (Button) findViewById(R.id.go3_1);

        mGo31.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go3_1:
                Intent intent = new Intent(Algorithm2_3.this, Algorithm3_1.class);
                startActivity(intent);
                break;
        }
    }
}
