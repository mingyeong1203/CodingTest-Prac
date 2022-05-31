package week01;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2752_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[3];

        for(int i = 0; i <3 ; i++){
            intArr[i] = sc.nextInt();
        }

        Arrays.sort(intArr);

        for(int i = 0; i<3; i++) {
            System.out.println(intArr[i] + " ");
        }
    }
}
