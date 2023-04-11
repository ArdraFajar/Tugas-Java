/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);

      System.out.print("Masukkan nilai 1: ");
      int nilai1 = input.nextInt();

      System.out.print("Masukkan nilai 2: ");
      int nilai2 = input.nextInt();
 
      int hasil = nilai1 + nilai2;
      
      System.out.println(nilai1 + " + " + nilai2 + " = " + hasil);
      System.out.println("Dikerjakan oleh Ardra Fajar Nasrullah 2220146");
    }
    
}
        