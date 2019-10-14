package com.crazy16.algorithm_4_6.algorithm;

import android.widget.LinearLayout;

import com.crazy16.algorithm_4_6.bean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyAlgorithm {
    /**
     * 获取2的平方
     */
    public static int getTwoPingFang(int n) {
        int sumN = 0;
        int pingFang;
        for (int i = 1; i <= n + 1; i++) {
            pingFang = 1;
            for (int j = 1; j < i; j++) {
                pingFang *= 2;
            }
            sumN += pingFang;
        }
        return sumN;
    }

    /**
     * 计算成绩管理类
     */
    public static class ScoreManager {
        private List<Integer> scoreList = new ArrayList<>();

        public void addScore(int score) {
            scoreList.add(score);
        }

        /**
         * 计算分数区间
         *
         * @return 返回之前加入分数的区间个数
         */
        public String getResult() {
            int score60 = 0;
            int score70 = 0;
            int score80 = 0;
            int score90 = 0;
            int score100 = 0;
            int noScore = 0;
            for (int i = 0; i < scoreList.size(); i++) {
                Integer integer = scoreList.get(i);
                if (integer < 0 || integer > 100) {
                    noScore += 1;
                    continue;
                }
                switch (integer / 10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        score60 += 1;
                        break;
                    case 6:
                        score70 += 1;
                        break;
                    case 7:
                        score80 += 1;
                        break;
                    case 8:
                        score90 += 1;
                        break;
                    case 9:
                    case 10:
                        score100 += 1;
                        break;
                }
            }
            String format = String.format("60分以下:%d个,60到70:%d个,70到80:%d个,80到90:%d个,90到100:%d个,无效成绩:%d", score60, score70, score80, score90, score100, noScore);
            this.scoreList = new ArrayList<>();
            return format;

        }

        public ScoreManager() {
        }
    }


    public static class StudentArray {
        List<Student> studentList;

        public StudentArray(List<Student> studentList) {
            this.studentList = studentList;
        }

        public void sort(boolean isReverse) {
            Collections.sort(studentList);
            if (isReverse) {
                Collections.reverse(studentList);
            }
        }

        /**
         * 给所有人增加年龄
         * @param num 增的年龄数
         */
        public void addAge(int num) {
            for (int i = 0; i < studentList.size(); i++) {
                Student student = studentList.get(i);
                student.setAge(student.getAge() + num);
            }
        }

        /**
         * 统计年龄大于指定数的
         * @param age 年龄
         * @return 学生列表
         */
        public List<Student> countStudent(int age){
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < studentList.size(); i++) {
                Student student = studentList.get(i);
                if(student.getAge() > age){
                    students.add(student);
                }

            }
            return students;
        }


    }

}
