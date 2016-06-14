/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

/**
 *
 * @author miracle
 */
public class evenpos {

    public static void main(String args[]) {
        int num=236341,sum=0,i=2;
        int r;
       
        while (num > 0) {
            r = num % 10;
            if(i%2==0)
            {
                sum=sum+r;
               
            }
            
            num = num / 10;
            i=i++;
        }
        System.out.println(sum);
    }
}