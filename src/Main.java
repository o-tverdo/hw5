public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int iOS = 0;
        int android = 1;
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int iOS = 0;
        int android = 1;
        int clientDeviceYear = 2016;
        int clientOS = 1;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2000;
        if (year % 100 != 0 && (year % 4 == 0 || year % 400 == 0)) {
            System.out.println("visokostnii");
        } else {
            System.out.println("НЕ visokostnii");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 90;
        if (deliveryDistance >100) {
            System.out.println("dostavki net");}
        else {int day = 1;
            if (deliveryDistance >20) { day++; }
            if (deliveryDistance >60) { day++; }
            System.out.println( "Потребуется дней: " + day + " dnei");}
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 9;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("zima");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("vesna");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("leto");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("osen");
                    break;
                default:
                    System.out.println("Такого mesiaca ne sushestvuet");
            }
        }
    }

