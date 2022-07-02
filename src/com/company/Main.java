package com.company;

public class Main {
    public static int task1(int[][] matrix){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matrix[i][j]==1)
                    return Math.abs(i-3)+Math.abs(j-3);;
            }
        }
        return -1;
    }

    public static int task2(int n){
        if (n<5)
            return 0;
        return 1;
        //oxirgi raqami 0 bo'lishi uchun 2, 5 tub sonlari ko'paytirilishi kerak,
        // bunaqa sonlar ko'paytmada 1 martadan qatnashadi holos
    }


    public static void main(String[] args) {


    }
}
