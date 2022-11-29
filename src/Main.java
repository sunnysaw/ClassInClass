/*
 In this we will see about how to use method by using class in class and how it functions.
 _________________________________________________________________________________________
 Question : for given two number find the sum of that two number .
 ______________________________________________________________________
 Approach : first make a class in which we write a functions for adding two numbers that is taken from the user and
            then return it in main class from where the function is called.
 */

import java.util.Scanner;
class alg{
    public int sum(int a , int d){
        int ans = a + d;
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {

        alg b = new alg();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int d = sc.nextInt();
        System.out.println("sum of tow number is by using class in class :" );
       int ans = b.sum(a,d);
        System.out.println(ans);
    }
}