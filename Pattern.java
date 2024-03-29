package PatterProblem;


class Pattern {
    void boundryRhombus(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=row; j++){
                if(j==1 || i==1 || j==row || i== row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void rhombus(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=row; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=2; j<=i; j++){
                System.out.print(" ");
                if(j==i && i==row){
                    System.out.print("*");
                }
            }
            for(int j=1; j<=2*(row-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // <----butterfly pattern problem------>

    void butterfly(int row){
        for(int i=1;i<=row;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=i+1; j<=row; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=row-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


            // for double line butterfly

        // for(int i=row; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1; j<=2*(row-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }

    //printing a rectangle 

    void rectangle(int row, int column){

        for(int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //printing a hollow rectangle

    void borderRectangle(int row, int column){
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

    //printing half pyramid using *

    void halfPyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //printing half pyramid which is rotated 180 digree

    void rotatedHalfPyramid(int row){
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
    //printing an inverted half pyramid of *

    void invertedHalfPyramid(int row){
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //printing half pyramid of numbers

    void numberHalfPyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //printing a half inverted pyramid using numbers

    void invertedNumberHalfPyramid(int row){
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // printing floyds number triangle where numbers are in increasing manner

    void floydsNumberTriangle(int row){
        int k=1;
        for(int i=1;i<=row;i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    //printing tringle with integer only 1 and 0
    //two approches are here 

    void zeroOneTriangle(int row){
        // int z=1;
        // for(int i=1;i<=row; i++){
        //     for(int j=1;j<=i;j++){
        //         if (z==1) {
        //             System.out.print(z+" ");
        //             z--;
        //         }
        //         else {
        //             System.out.print(z+" ");
        //             z++;
        //         }
        //     }
        //     System.out.println();

        // Another Approach


        for(int i=1;i<=row; i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

}