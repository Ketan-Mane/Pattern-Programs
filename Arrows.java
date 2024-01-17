

/*

Right Direction

 *
   *
     *
       *
 * * * * *
 * * * * *
       *
     *
   *
 *


Left Direction

        *
      *
    *
  *
* * * * *
* * * * *
  *
    *
      *
        *


*/


public class Arrows {
    public static void main(String[] args) {
        
        int rows = 5;

        // Right Direction Arrow

        // UP Side
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if(j==i || i==rows)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        // Down Side
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if(j==i || i==rows)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Left Direction Arrow 
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= rows-i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) 
            {
                if(j==1 || i==rows)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
        // Down Side
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= rows-i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) 
            {
                if(j==1 || i==rows)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
