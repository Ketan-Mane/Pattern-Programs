package Patterns;

/*

       *
      **
     ***
    ****
   *****
  ******
 *******
********
********
 *******
  ******
   *****
    ****
     ***
      **
       *

*/


public class Solid_Half_Diamond {
    public static void main(String[] args) {
        
        int rows = 8;
        // Above Triangle
        for (int i = 1; i <= rows; i++)
        {
            for(int j = rows-i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++)
            {
                System.out.print("*");
            }   
            System.out.println();
        }

        
        // Below Triangle
        for (int i = rows; i >= 1; i--)
        {
            for(int j = rows-i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++)
            {
                System.out.print("*");
            }   
            System.out.println();
        }

    }
}
