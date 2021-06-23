package com.gfa;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Called: main");
        // write your code here
        System.out.println("Hello world!");

        //System.out.println(divdeByFive(20));


        int[] arr = new int[2];

        //IndexOutOfBoundsException
        //ArrayIndexOutOfBoundsException

        arr[1] = 99;

        System.out.println("hello");

        //ArithmeticException
        //int division = 77/0;

        //Exception
        //Exception e = new Exception("Message");

        int division;

        try {
            division = 77/0;
            divdeByFive(124);
        } catch (ArithmeticException arex){
            System.out.println(arex.getMessage());
            division = 77/1;
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            System.out.println("125 / 5 = 25");
        }

        int userInput = 0;

        Scanner sc = new Scanner(System.in);
        //sc.close();

        try {
            userInput = sc.nextInt();
            System.out.println(userInput);
            return;
        } catch (InputMismatchException e) {
            userInput = 1;
        } catch (NoSuchElementException e) {
            userInput = 12;
        } catch (IllegalStateException e) {
            userInput = 123;
        } finally {
            System.out.println("Mindenképpen lefutunk");
        }
    }

    public static double divdeByFive(double input) throws Exception {
        System.out.println("Called: divdeByFive");
        if (input == 125) {
            throw new Exception("Input can't be 125");
        }

        printUntillLimit((int) (input/4));
        return input/4;
    }

    public static void printUntillLimit(int limit) {
        System.out.println("Called: printUntillLimit");
        for (int i = 0; i < limit; i++) {
            System.out.println(i);
        }
    }
}
