package com.hodge.daniel.tutorial.corejava;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class CoreJavaApp {
    public static void main(String[] args) {
        CoreJavaApp app = new CoreJavaApp();
    }

    public CoreJavaApp() {
        callLoops();

        callVariables();

        Person.taxRate = .183;

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.income = 40000;
        p2.income = 100000;
        p3.income = 80000;

        NumberFormat curr = NumberFormat.getCurrencyInstance(Locale.getDefault());
        System.out.println(curr.format(p1.taxRate * p1.income));
        System.out.println(curr.format(p2.taxRate * p2.income));
        System.out.println(curr.format(p3.taxRate * p3.income));
    }

    private void callVariables() {
        String myString = "0|1|2|3|4|5|6|7|8|9";
        String myString2 = myString;

        int myInt;
        myInt = 3;
        final int myInt2 = myInt;

        int[] myInts = new int[5];
        int[] myInts2 = new int[]{3,4,5};
        int last = myInts2[2];
        int[] myInts3 = new int[myInts2.length * 2];
        System.arraycopy(myInts2, 0, myInts3, 0, myInts2.length);
        System.out.println(Arrays.toString(myInts3));
    }

    private void callLoops() {
        for (int i = 0; i < 10; i++) {
            System.out.println("--->");
            if (true) {
                break;
            }
        }

        do {
            break;
        }while (123.4D == 0L);

        while(true == Boolean.FALSE) {
            //statements
        }
    }
}
