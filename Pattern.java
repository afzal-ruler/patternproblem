package PatterProblem;

import java.util.Scanner;

public class Pattern {


    public static void rectangle(int row, int column){

        for(int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void borderRectangle(int row, int column){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                if (i==1 || i==row || j==1 || j==column) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void halfPyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rotatedHalfPyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i;j++){
               System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }

    public static void invertedHalfPyramid(int row){
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberHalfPyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
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


        // rectangle(row, column);

        // System.out.println();
        // System.out.println();

        // borderRectangle(row, column);

        // System.out.println();
        // System.out.println();

        // halfPyramid(row);

        // System.out.println();
        // System.out.println();

        // invertedHalfPyramid(row);

        // System.out.println();
        // System.out.println();

        // rotatedHalfPyramid(row);

        numberHalfPyramid(row);
    }
}