package com.crazy16.algorithm_4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.crazy16.algorithm_4_6.algorithm.MyAlgorithm;
import com.crazy16.algorithm_4_6.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Algorithm3 extends AppCompatActivity implements View.OnClickListener {
    private List<Student> studentList = new ArrayList<>();
    private MyAlgorithm.StudentArray studentArray;
    private TextView mShowAlgorithm3InfoTV;
    private TextView mAlgorithm3ResultTV;
    private Button mAlgorithm3SortBTN;
    private Button mAlgorithm3AddAgeBtn;
    private Button mAlgorithm3CountBTN;
    private Button mGo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm3);
        initView();
        initStudent();


        refresh();
    }

    private void initStudent() {
        studentList.add(new Student(1, "TK", 18));
        studentList.add(new Student(4, "Bob", 20));
        studentList.add(new Student(66, "Faker", 22));
        studentList.add(new Student(2, "Job", 14));
        studentArray = new MyAlgorithm.StudentArray(studentList);

    }

    private void initView() {
        mShowAlgorithm3InfoTV = (TextView) findViewById(R.id.showAlgorithm3InfoTV);
        mAlgorithm3ResultTV = (TextView) findViewById(R.id.algorithm3ResultTV);
        mAlgorithm3SortBTN = (Button) findViewById(R.id.algorithm3SortBTN);
        mAlgorithm3AddAgeBtn = (Button) findViewById(R.id.algorithm3AddAgeBtn);
        mAlgorithm3CountBTN = (Button) findViewById(R.id.algorithm3CountBTN);
        mGo4 = (Button) findViewById(R.id.go4);

        mAlgorithm3SortBTN.setOnClickListener(this);
        mAlgorithm3AddAgeBtn.setOnClickListener(this);
        mAlgorithm3CountBTN.setOnClickListener(this);
        mGo4.setOnClickListener(this);
    }

    public void refresh(List<Student> students,TextView textView) {
        String resultLine = "";
        String result = "";
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            resultLine = String.format("学号:%d, 姓名:%s, 年龄:%d",student.getId(),student.getName(),student.getAge());
            result += resultLine + "\n";
        }
        textView.setText(result);


    }
    public void refresh() {
        refresh(studentList,mShowAlgorithm3InfoTV);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.algorithm3SortBTN:
                studentArray.sort(false);
                refresh();
                break;
            case R.id.algorithm3AddAgeBtn:
                studentArray.addAge(1);
                refresh();
                break;
            case R.id.algorithm3CountBTN:
                List<Student> students = studentArray.countStudent(20);
                refresh(students,mAlgorithm3ResultTV);
                break;
            case R.id.go4:
                Intent intent = new Intent(Algorithm3.this, Algorithm2_1.class);
                startActivity(intent);
                break;
        }
    }
}
