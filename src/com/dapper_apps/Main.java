package com.dapper_apps;

import java.util.Scanner;

/**
 * Created by falven on 4/19/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0) {
            System.out.println(getUtopianTreeHeight(input.nextInt()));
        }
    }

    public static int getUtopianTreeHeight(final int n) {
        // 2 cycles
        // Spring: doubles
        // Summer: +1m
        // 1m at the beginning of spring.
        // after n cycles?
        //      0, 1, 2, 3, 6, 7, 14, 15, 30, 31
        // 2^x: 1, 2,    4,    8,     16,     32
        int p = (int) Math.ceil(n / 2.0) + 1;
        int cycles = (int) Math.pow(2.0, p) - 1;
        return ((n & 1) == 1) ? cycles - 1 : cycles;
    }
}