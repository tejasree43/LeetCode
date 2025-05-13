package Basics;

import Medium.ValidSudoku36V2;

public class ModulesDemo {

    public static void main(String[] args) {

        ModulesDemo mo = new ModulesDemo();

        int row=0;
        int column=5;
        int value=9%3;
        int columnSize = column - value;

        System.out.println("modulas values="+value);

    }
}