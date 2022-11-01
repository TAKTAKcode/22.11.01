package com.tak.study;

import java.util.Scanner;

public class Study {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는 ? : ");

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < num - i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
            
        }
    }
}
