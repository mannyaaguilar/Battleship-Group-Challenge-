package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        //Create 5x5 game board

//        int[] simpleArray = {1, 2, 3, 4, 5};

        int H = 5;
        int W = 5;
        String[][] declaredStringArray = new String[W][H];
        int counter = 0;
        String addASpace;

        for (int i = 0; i < W ; i++) {
            for (int j = 0; j < H; j++) {
                counter++;
                if (counter < 10) {
                    addASpace = " " + String.valueOf(counter);
                } else {
                    addASpace = String.valueOf(counter);
                }
                declaredStringArray[i][j] = addASpace;
                System.out.print(declaredStringArray[i][j] + "  ");

            } //end of inside loop
            System.out.println(" ");
        } // end of outer loop
//        declaredStringArray[0] = "1  " + "2  " + "3  " + "4  " + "5  ";
//        declaredStringArray[1] = "6  " + "7  " + "8  " + "9  " + "10 ";
//        declaredStringArray[2] = "11 " + "12 " + "13 " + "14 " + "15 ";
//        declaredStringArray[3] = "16 " + "17 " + "18 " + "19 " + "20 ";
//        declaredStringArray[4] = "21 " + "22 " + "23 " + "24 " + "25 ";
//
//        System.out.println(declaredStringArray[0]);
//        System.out.println(declaredStringArray[1]);
//        System.out.println(declaredStringArray[2]);
//        System.out.println(declaredStringArray[3]);
//        System.out.println(declaredStringArray[4]);
//
//        int boardWidth = 5;
//        int boardHeight = 5;
//
//
//        char[][] firstMultiArray = new char[boardHeight][boardWidth];
//
//        for (int y = 0; y < boardHeight; y++) {
//            for (int x = 0; x < boardWidth; x++) {
//
//                firstMultiArray[y][x] = '0';
//
//                System.out.print(firstMultiArray[y][x] + " ");
//            }
//
//            System.out.println("");
//        }
//
//        Random diceRoll = new Random();
//        int scottsRandomX = diceRoll.nextInt(boardWidth);
//        int scottsRandomY = diceRoll.nextInt(boardHeight);
//        System.out.println("random numbers " + scottsRandomX + " " + scottsRandomY);
//
//        firstMultiArray[scottsRandomX][scottsRandomY] = 'Q';
//
//        for (int y = 0; y < boardHeight; y++) {
//            for (int x = 0; x < boardWidth; x++) {
//
//                System.out.print(firstMultiArray[y][x] + " ");
//            }
//            System.out.println("");
//        }


        }
    }

