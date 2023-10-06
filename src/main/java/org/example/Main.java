package org.example;

import java.time.LocalDate;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//    ILeapYear leapYear = (a)-> (a % 4) == 0;
//    boolean year = leapYear.leapYear(2023);
//    if(year)
//        System.out.println("Leap year");
//    else
//        System.out.println("Not leap year");

//2
//        IDrob add = new IDrob() {
//            @Override
//            public void action(int a, int b, int c, int d) {
//                if(b==d)
//                {
//                    a = a+c;
//                }
//                else{
//                    a = (a*d) + (c*b);
//                    b = b*d;
//                }
//                System.out.println(a + "/" + b);
//            }
//        };
//
//        add.action(1,5,2,5);
//
//        IDrob minus = new IDrob() {
//            @Override
//            public void action(int a, int b, int c, int d) {
//                if(b==d)
//                {
//                    a = a-c;
//                }
//                else{
//                    a = (a*d) - (c*b);
//                    b = b*d;
//                }
//                System.out.println(a + "/" + b);
//            }
//        };
//        minus.action(1,5,2,5);
//
//        IDrob mult = new IDrob() {
//            @Override
//            public void action(int a, int b, int c, int d) {
//                a *= c;
//                b*=d;
//                System.out.println(a+"/"+b);
//            }
//        };
//        mult.action(2,5,1,6);
//
//        IDrob div = new IDrob() {
//            @Override
//            public void action(int a, int b, int c, int d) {
//                a*=d;
//                b*=c;
//                System.out.println(a+"/"+b);
//            }
//        };
//        div.action(2,5,3,4);

        //3

//        INumbers<Integer> maximum = new INumbers<Integer>() {
//            @Override
//            public Integer action(Integer a, Integer b, Integer c, Integer d) {
//                int max= a;
//                if (max<b)
//                    max = b;
//                if(max<c)
//                    max = c;
//                if(max < d)
//                    max = d;
//                return  max;
//            }
//        };
//        int max = maximum.action(2,4,6,1);
//        System.out.println("Maximum: " + max);
//
//        INumbers<Integer> minimum = new INumbers<Integer>() {
//            @Override
//            public Integer action(Integer a, Integer b, Integer c, Integer d) {
//                int min= a;
//                if (min>b)
//                    min = b;
//                if(min>c)
//                    min = c;
//                if(min > d)
//                    min = d;
//                return  min;
//            }
//        };
//        int min = minimum.action(2,4,5,1);
//        System.out.println("Minimum: " + min);

        //4
    IEqualityCheck equalityCheck = (a,b) -> a==b;
    boolean t = equalityCheck.action(3,4);
    if (t)
        System.out.println("Equality");
    else
        System.out.println("Not equality");

    ICheckPositiveOrNegative positive = (a)-> a>=0;
    boolean p = positive.action(-6);
    if(p)
        System.out.println("Positive");
    else{
        System.out.println("Negative");
    }
    }


}