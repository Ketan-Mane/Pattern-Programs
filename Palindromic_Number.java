/*

        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5

*/


public class Palindromic_Number {
    public static void main(String[] args) {
        
        int rows = 5;
        for (int i = 1; i <= rows; i++) 
        {
            // Print Spaces to make a triangle
            for (int j = 1; j <= rows-i; j++) 
            {
                System.out.print("  ");    
            }

            // Print Numbers
            // 1st Half
            for (int j = i; j >= 1; j--) 
            {
                System.out.print(j+" ");    
            }

            //2nd Half 
            for (int j = 2; j <= i; j++) 
            {
                System.out.print(j+" ");      
            }
            System.out.println();
        }

    }
}
