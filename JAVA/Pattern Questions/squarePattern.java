package com.learningJava.initialPrograms;
import java.util.Scanner;

public class squarePattern {
    public static void pattern(int row,int col){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.println("* ");
               }
             System.out.println();
        }
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();   
        sc.close(); 
        pattern(row,col);        
    }
       
} 
     
   

