package PGO12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static int readNumber() throws NegativeNumberExeption {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number: ");
        int num = sc.nextInt();
        if (num < 0) {
            num = 0;
            throw new NegativeNumberExeption("Number can not be negative!!!! ");
        }
        return num;
    }
    int[] arr =new int[10];

    public static void fillArray(int[] arr) throws NegativeNumberExeption {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readNumber();
        }
    }
}