
/*

       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 
* * * * * * * * 
 * * * * * * * 
  * * * * * * 
   * * * * * 
    * * * * 
     * * * 
      * * 
       *

 */

public class Solid_Diamond {
    public static void main(String[] args) {
        
        int rows = 8;
        for (int i = 1; i <= rows; i++) {
            for(int k = rows-i ; k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i;j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            for(int k = rows-i ; k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i;j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
