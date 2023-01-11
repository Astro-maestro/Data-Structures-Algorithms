package com.learningJava.initialPrograms;
import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        for (int i = 0; i < inp; i++){
             int n = sc.nextInt();
             
             //start the loop from 2 because every number gets divided by 1 ; so no need to check
             // we know for p*q = n, where p & q are the two factorials of n, then p <= sqrt(n) or q <= sqrt(n)
             //So, end the loop with sqrt(n) because we don't need to check more than that in order to find divisor      
             int count = 0;
             for ( int div = 2; div*div <= n; div++){ 
                if (n % div == 0){
                    count++;
                    break; 
                // to reduce the time complexity we have to break the loop as soon as we get 1 divisor in the range  
                }
             }
             
             if(count == 0){
                System.out.println("prime number");
             }
              else{
                System.out.println("non prime number");
             }     
        }
        sc.close(); 
    }   
}
