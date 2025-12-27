package org.example;

import org.example.enums.Color;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Color c= Color.BLUE;
        System.out.println(c.getValue());
        System.out.println(c.name());

        for(Color colour: Color.values())
            System.out.println(colour.getValue());



    }
}