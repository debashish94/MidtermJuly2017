package math;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows to print:");
        int rows = s.nextInt();
        System.out.println("Pyramid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here



