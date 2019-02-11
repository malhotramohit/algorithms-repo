package com.rms.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] finalGrades=new int[grades.length];
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]<38)
            {
                finalGrades[i]=grades[i];
            }
            else if((grades[i]%5)>2)
            {
                int round=5-(grades[i]%5);
                finalGrades[i]=finalGrades[i]+round;
            }
        }
        return finalGrades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        
        
        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            System.out.println(result[gradesItr]);
        }
       
    }
}

