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

public class circle {
    public static void area(int r)
    {
        double pi=3.14,a;
        a=pi*r*r;
        System.out.println("area of circle :"+a);
               
    }
    public static void main(String args[])
    {
       int r;
         area(5);
    }
}
