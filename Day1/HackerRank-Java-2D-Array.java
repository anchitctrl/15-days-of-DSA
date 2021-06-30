// You are given a  2D array. An hourglass in an array is a portion shaped like this:

// a b c
//   d
// e f g
// For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

// 1 1 1     1 1 0     1 0 0
//   1         0         0
// 1 1 1     1 1 0     1 0 0
// The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

// In this problem you have to print the largest sum among all the hourglasses in the array.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public void ans(int[][] arr){
    int max=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum1=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int sum2=arr[i+1][j+1];
                int sum3=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                int sum=sum1+sum2+sum3;
                if(sum>max){
                    max=sum;
                    // System.out.print(i+" "+j+ " ");
                    // System.out.println("Hello");
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution arrObj=new Solution();
        arrObj.ans(arr);
    }
}

