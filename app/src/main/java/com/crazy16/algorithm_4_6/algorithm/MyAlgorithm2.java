package com.crazy16.algorithm_4_6.algorithm;


import java.util.ArrayList;
import java.util.List;

public class MyAlgorithm2 {
    public static class SistersNumber {
        private boolean lastNumberIsPrime;

        /**
         * 是否是姐妹数，根据integers判断
         *
         * @return
         */
        private boolean isSister(int num) {
            boolean prime = isPrime(num);
            boolean last = lastNumberIsPrime;
            lastNumberIsPrime = prime;
            return last && prime;
        }

        /**
         * 判断是否为质数
         *
         * @param num 需要判断的数
         * @return
         */
        private boolean isPrime(int num) {
            int primeNum = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primeNum++;
                }
            }
            return primeNum == 0;
        }

        /**
         * 获取100到1000姐妹数
         *
         * @return
         */
        public static List<String> getRangePrime() {
            SistersNumber sistersNumber = new SistersNumber();
            List<String> integers = new ArrayList<>();
            for (int i = 100; i <= 1000; i++) {
                if (i % 2 != 0) {
                    boolean sister = sistersNumber.isSister(i);
                    if (sister) {
                        integers.add((i - 2) + "和" + i);
                    }
                }
            }
            return integers;
        }

    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int getFactorial2(int n) {
        if (n == 1) {
            return 1;
        }
        return getFactorial2(n - 1) * n;
    }


}
