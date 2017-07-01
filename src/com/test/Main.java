package com.test;


import java.lang.reflect.Array;

public class Main {

    public static void leapyear(int a) {
        if ((a % 4) == 3) System.out.println("It`s a leap year");
        else
            System.out.println("It`s not a leap year");

    }

    public static void equivalence(int b) {

        String[] number = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred",
                "nine hundred", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand"};
        int r10 = b%10;
        int r100 = b%100;
        int r1000 = b%1000;
        int r10000 = b%10000;
        for (r10 = 1; r10 <=9;r10++ ){
            for (r100 =1;r100 <=9;r100++){
                for (r1000 = 1;r1000 <=9;r1000++){
                    for (r10000 = 1; r10000 <=9;r10000++){
                        System.out.print(number[r10000]);
                        System.out.print(number[r1000]);
                        System.out.print(number[r100]);
                        System.out.print(r10);
                    }
                }
            }
        }
    }

    public static int[] fix94(int[] nums) {
        int c = nums.length;
        int[] changed = new int[0];
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] == 9) {
                for (int j = 0; j <= nums.length; j++) {
                    if (nums[j] == 4) {
                        //nums[j] = nums [i+1];
                        //nums[i+1] = 4 ;
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 4;
                        changed = nums;
                    }
                }
            }
        }
        return changed;
    }

    public static void complexCalc(double real1, double img1, double real2, double img2, int operator) {
        double real3 = real1 + real2;
        double img3 = img1 + img2;
        if (operator == 0) {
            //String x0 = "+";
            System.out.print(real3);
            System.out.print("+");
            System.out.print(img3);
            System.out.print("i");
        }
        if (operator == 1) {
            //String x1 = "-";
            System.out.print(real3);
            System.out.print("-");
            System.out.print(img3);
            System.out.print("i");
        }
        if (operator == 2) {
            //String x2 = ".";
            System.out.print(real3);
            System.out.print(".");
            System.out.print(img3);
            System.out.print("i");

        }
        if (operator == 3) {
            //String x3 = "/";
            System.out.print(real3);
            System.out.print("/");
            System.out.print(img3);
            System.out.print("i");
        }


    }


    public int[] seqGenerator(int n, int[] seq, int m) {
        int x;
        int[] seq1 = new int[0];
        if (m < n) {
            for (x = 0; x <= (n - m); x++) {
                seq1[x] = seq[x];
                return seq1;
            }

        }
        if (m == n) return seq;
        if (m > n) {
            int y = m % n;
            int z = m / n + y / n;
            m = (z * n) + y;
            for (int w = 0; w <= n; w++) {
                int[] seq2 = new int[0];
                seq2[w] = seq[w];
                int[] seq3 = new int[0];
                for (z = 0; z <= (n - 1); z++) {
                    for (int q = 0; q <= (m - n); q++) {
                        seq3[q] = (z * 10) seq[q];
                        System.out.print(seq);
                        System.out.print(seq2);
                        System.out.print(seq3);
                    }
                }
            }
        }
        return seq;
    }
}

    public static void main(String[] args) {

        //leapyear(1395);
        //fix94();
        //complexCalc();
    }