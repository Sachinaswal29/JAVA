/*
Create two dimensional integer array and insert and traverse this array.
Note: Use Scanner class to insert data.
*/

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

class TwoDArray {
      public static void main(String[] args) {
            int[][] arr = new int[2][3];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                  System.out.println("Enter data for " + (i + 1) + " row");
                  for (int j = 0; j < arr[0].length; j++) {
                        arr[i][j] = scanner.nextInt();
                  }
            }
            System.out.println("Elements are:");
            for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr[0].length; j++) {
                        System.out.print(arr[i][j] + " ");
                  }
                  System.out.println();
            }
      }

}
