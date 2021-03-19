package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String n = "Viacheslav";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name (Viacheslav)");
        name = scanner.next();

        if (name.equals(n)){
            System.out.println("Hello Viacheslav!!");
        }else {
            System.out.println("noWay)");
        }
    }
}
