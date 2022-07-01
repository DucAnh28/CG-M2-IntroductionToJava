import java.util.Scanner;

//package com.codegym;
public class main {
    public static void main(String[] args) {
        float width;
        float height, erea;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        erea = width*height;
        System.out.println("Area is: "+erea);
    }
}
