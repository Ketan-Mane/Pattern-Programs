/*

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

*/

public class Butterfly_Pattern {

    public static void main(String[] args) {
        
        int rows = 5;

        // Above Triangles
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            
            for (int j = 1; j <= (rows-i)*2; j++) 
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Below Triangles
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            
            for (int j = 1; j <= (rows-i)*2; j++) 
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
