
/*

* * * * * 
      *
    *
  *
* * * * *

*/

public class Z_Pattern {

    public static void main(String[] args) {
        int rows = 8;

        // ! Solution 1

        for (int i = 1; i <= rows; i++)
            for (int j = 1; j <= rows; j++) {
                if (i == 1) {
                    System.out.print("* ");
                }
            }

        System.out.println();

        for (int i = rows - 1; i > 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++)
            for (int j = 1; j <= rows; j++) {
                if (i == rows) {
                    System.out.print("* ");
                }
            }

        System.out.println("\n\n");
        
        // ! Solution 2

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows)
                    System.out.print("* ");
            }

            if (i > 1) {
                for (int j = i; j <= rows; j++) {
                    if (j == rows) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }

    }

}