package Patterns;

/*

    *
   * *
  *   *
 *     *
* * * * *

 */

public class Hollow_Triangle {
    public static void main(String[] args) {
        
        int rows = 5;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows-i; j >= 1; j--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                if (j==1 || j==i || i==rows)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
