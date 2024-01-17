package Patterns;

/**
 * Hollow_Diamond

     *
    * *
   *   *
  *     *
 *       *
 *       *
  *     *
   *   *
    * *
     *


 */
public class Hollow_Diamond {

    public static void main(String[] args) {
        
        int rows = 5;

        for (int i = 1; i <= rows; i++)
        {
            for(int j = rows-i; j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                if( j==1 || j==i)
                System.out.print(" *");
                else
                System.out.print("  ");
               
            }   
            System.out.println(); 
        }

        for (int i = rows; i >= 1; i--)
        {
            for(int j = rows-i; j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                if( j==1 || j==i)
                System.out.print(" *");
                else
                System.out.print("  ");
               
            }   
            System.out.println(); 
        }

    }

}