package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int type = 0;
        int num = 0;
        boolean isTrue = true;
        int total;
        Scanner in = new Scanner(System.in);
        while (isTrue){
            System.out.println("Выберите тип конвертации (1 - 3)" + "\n" +
                    "1 - из 10-ричной в 16-ричную" + "\n" +
                    "2 - из 10-ой в 2-ую" + "\n" +
                    "3 - из 2-ой в 10-ую");
            type = in.nextInt();
            if(type>=1 && type<=3){
                isTrue = false;
            }
        }
        num = in.nextInt();
        if (type == 1) {
                String convert = Integer.toHexString(num).toUpperCase();
                System.out.println("Число " + num + " в 16-ричной системе счисления = " + convert);
            } else if(type == 2) {
                String convert = Integer.toBinaryString(num);
                System.out.println("Число " + num + " в 2-чной системе счисления = " + convert);
            }else{
            System.out.println("Число " + num + " в 10-чной системе счисления = " + Integer.parseInt(Integer.toString(num),2));
            }
        }
}
