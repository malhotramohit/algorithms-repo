package com.rms.random;

import java.math.BigDecimal;
import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
         Scanner s = new Scanner(System.in);
         String noOfUnitsStr=s.nextLine();
         String[] noOfUnitsArray=noOfUnitsStr.split(",");
         int i=noOfUnitsArray.length;
         String[][] arrayOflines=new String[i-1][3];
         String[] leftSideUnitArray=new String[i-1];
         for(int j=0;j<i-1;j++)
         {
             String row=s.nextLine();
             String[] rowArray=row.split(" ");
             leftSideUnitArray[j]=rowArray[3];
             arrayOflines[j][0]=rowArray[0];
             arrayOflines[j][1]=rowArray[2];
             arrayOflines[j][2]=rowArray[3];
         }
         String highestUnit=findMissing(noOfUnitsArray, leftSideUnitArray);

         
         String[] result=new String[i];
         BigDecimal previousWeight=new BigDecimal(1);
         result[0]="1"+highestUnit;
         int c=i;
         int h=1;
         while(c>1)
         {
          
             String[] nextRow=searchHighestUnit(highestUnit,arrayOflines); // 24 hour , 60 min
             BigDecimal currentWeight=new BigDecimal(nextRow[0]);
             currentWeight=currentWeight.multiply(previousWeight);
             result[h]=currentWeight+nextRow[1];
             h++;
             highestUnit=nextRow[1]; //hour
             previousWeight=currentWeight;
             c--;
         }
         System.out.print(result[0]);
         for(int r=1;r<result.length;r++)
         {
             System.out.print(" "+"= "+result[r]);
         }
         
    }

	private static String[] searchHighestUnit(String highestUnit, String[][] arrayOflines) {
		String[] arrayToreturn= {"1",""};
		for (int i = 0; i < arrayOflines.length; i++) {
			if(arrayOflines[i][0].equalsIgnoreCase(highestUnit))
			{
				arrayToreturn[0]=arrayOflines[i][1];
				arrayToreturn[1]=arrayOflines[i][2];
				break;
			}
		}
		return arrayToreturn;
	}


	
	private static String findMissing(String[] array1,String[] array2)
	{
		String toReturn=null;
		 for (int i = 0; i < array1.length; i++)
	        {
	            int j;
	             
	            for (j = 0; j < array2.length; j++)
	                if (array1[i].equalsIgnoreCase(array2[j]))
	                    break;
	 
	            if (j == array2.length)
	                toReturn= array1[i];
	        }
		return toReturn;
	}
}
