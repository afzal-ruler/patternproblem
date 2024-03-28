package PatterProblem;

import java.util.Scanner;

public class Pattern {


    public static void rectangle(int row, int column){

        for(int i=1; i<=row; i++){
            for (int j=0; j<=column; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row value: ");
        int row = sc.nextInt();
        System.out.print("Enter the column value: ");
        int column = sc.nextInt();

        sc.close();

        rectangle(row, column);

    }
}