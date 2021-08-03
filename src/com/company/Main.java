package com.company;
import java.util.Random;



public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        gul(50,25);
        gul(25,15);
        gul(13,33);
        gul(50,20);
        gul(24,30);

    }

    public static void gul(int age, int temp) {

        if (age > 20 && age < 45 && temp > -25 && temp < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temp > 0 && temp < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temp > -10 && temp <25){
            System.out.println("Можно идти гулять");
        }else System.out.println("Оставайтесь дома");
    }
}
