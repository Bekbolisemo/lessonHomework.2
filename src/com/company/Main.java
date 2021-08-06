package com.company;


public class Main {
    public static void main(String[] args) {
        gul(generateRandomAge(), 25);
        gul(generateRandomAge(), 15);
        gul(generateRandomAge(), 33);
        gul(generateRandomAge(), 20);
        gul(generateRandomAge(), 30);


    }


    public static void gul(int age, int temp) {

        if (age > 20 && age < 45 && temp > -25 && temp < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temp > 0 && temp < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temp > -10 && temp < 25) {
            System.out.println("Можно идти гулять");
        } else System.out.println("Оставайтесь дома");
    }

    public static int generateRandomAge() {
        int random = (int) (Math.random() * 80);
        return random;

    }
}
