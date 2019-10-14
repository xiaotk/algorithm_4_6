package com.crazy16.algorithm_4_6.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MyAlgorithm3 {
    public static class IntegerArrayManager {
        List<Double> integerList;

        public Double getMax() {
            Double max = null;
            for (int i = 0; i < integerList.size(); i++) {
                if (max == null) {
                    max = integerList.get(1);
                }
                Double integer = integerList.get(i);
                if (max < integer) {
                    max = integer;
                }
            }
            return max;
        }

        public Double getMin() {

            Double min = null;
            for (int i = 0; i < integerList.size(); i++) {
                if (min == null) {
                    min = integerList.get(1);
                }
                Double integer = integerList.get(i);
                if (min > integer) {
                    min = integer;
                }
            }
            return min;
        }

        public double getAverage() {
            Double sumNum = 0D;
            for (int i = 0; i < integerList.size(); i++) {
                Double integer = integerList.get(i);
                sumNum += integer;
            }
            return sumNum / integerList.size();
        }

        public IntegerArrayManager(List<Double> integerList) {
            this.integerList = integerList;
        }
    }

    public static double getTax(double money) {
        // 税率
        double tax;
        // 钱
        double money2 = money;
        if (money == 0) {
            return 0;
        }
        if (money <= 1500) {
            tax = 0.05;

        } else if (money <= 4500) {
            tax = 0.1;
            money2 -= 1500;
        } else if (money <= 9000) {
            tax = 0.2;
            money2 -= 4500;
        } else if (money <= 35000) {
            tax = 0.25;
            money2 -= 9000;
        } else if (money <= 55000) {
            tax = 0.3;
            money2 -= 35000;
        } else if (money <= 800000) {
            tax = 0.35;
            money2 -= 1500;
        } else {
            tax = 0.45;
            money2 -= 800000;
        }
        return getTax(money - money2) + (money2 * tax);

    }

}
