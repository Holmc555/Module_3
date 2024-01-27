package com.homework3;

public class SumCalculator {
    public static int sum(int n) {
        if (n <= 0){
            throw new IllegalArgumentException("Число не может быть меньше либо равно нулю");
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        return count;
    }
    public static void main(String[] args) {
        try {
            int result = sum(1);
            System.out.println(result);

            int result1 = sum(3);
            System.out.println(result1);

            int result2 = sum(2);
            System.out.println(result2);

            int result3 = sum(0);
            System.out.println(result3);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}