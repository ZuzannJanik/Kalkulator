package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.util.*;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.adding();
        calculator.subtracion();
    }
}

class Calculator {
    private int a = 10;
    private int b = 5;
    public int resultA;
    public int resultS;
    public int getResultA() {
        return resultA;
    }

    public void adding() {
        resultA = a + b;
        System.out.println("Adding result is " + resultA);
    }
    public void subtracion() {
        resultS = a - b;
        System.out.println("Substracion result is " + resultS);
    }

}
