
/** ******************************************************
  *
  *  Project :  Growth
  *  File    :  Growth.java
  *  Name    :  [Redacted]
  *  Date    :  Feb 12, 2021 (due Feb 14, 2021)
  * 
  *  Description :
  *  The purpose of the code is to evaluate and check the percentile curve of each
  *  listed baby on the list via BabyGrowth.txt as reference. It solves which baby is designated
  *  on the indicated percentile. Arrays/Index is used as data structures. I used a for loop
  *  the goes through the entire array to identify baby and indicate percentile. Input files used
  *  were BabyGrowth.txt as per reference
  *
  *  Changes :  Started with project and laying out class, and  main method | Feb 12, 2021
  *          :  Experimented and worked on findCol method to seek designated results | Feb 13, 2021
  *          :  Cleaned up methods/formats and started comments| Feb 14, 2021
  *          :  Finished last set of comments | Feb 14, 2021
  * 
  *******************************************************
  */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Growth {

     /**
       * **************************************************
       * Method : Main Method
       *
       * Purpose : The Main Method is to allow user to input 
       *
       * Parameters : String [] args - contains the command lines for Java
       * 
       * Also throws an Exception an error comes up while being
       * compiled
       *
       * Returns : This method returns the calculated percentile of a baby.
       *
       * @param args
       * @throws java.io.IOException
       ***************************************************
       */
    
    public static void main(String[] args) throws IOException {
        File growth = new File("BabyGrowth.txt");
        Scanner babies = new Scanner(growth);
        Scanner keyboard = new Scanner(System.in);
        double[][] length = new double[37][9];
        double[] percentile = {3, 5, 10, 25, 50, 75, 90, 95, 97};
        for (int i = 0; i < length[i].length; i++) {
            for (int j = 0; j < length[i].length; j++) {
                length[i][j] = babies.nextDouble();
            }
        }
        System.out.print("Enter the baby's age in months between (birth) 0 - 36 months: ");
        int babyAge = keyboard.nextInt();
        System.out.print("Enter the baby's height to centimeteres between 41 - 104: ");
        double babyHeight = keyboard.nextDouble();
        System.out.println("Baby's percentile is " + percentile[findCol(length[babyAge], babyHeight)] + "%");
    }
    
     /**
       * **************************************************
       * Method : findCol Method
       *
       * Purpose : The method goes through the entire list of the file and
       *           calculates what percentile it is.
       *
       * Parameters : double[] length, as the array to go through the columns
       *              double babyHeight, the double of the baby's height
       *
       * Returns : This method returns the column of where the 
       *           statistic of the baby.
       *
       ***************************************************
       * @param arr
       * @param babyHeight
       * @return column
       */

    public static int findCol(double[] arr, double babyHeight) {
        boolean flag = false;
        int column = 0;
        for (int i = 0; !flag && i < arr.length; i++) {
            if (arr[i] > babyHeight) {
                column = i;
                flag = true;
            }
        }
        return column;
    }
}
