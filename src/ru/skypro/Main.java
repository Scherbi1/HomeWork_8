package ru.skypro;

public class Main {
    public static void LeapYearVerification(int annum){
         if (annum % 4==0 && annum % 100 !=0 || annum % 400 == 0){
             System.out.println("год "+annum+ " является високосным");
         } else {
             System.out.println("год "+annum+ " не является високосным");
         }
    }
    public static void toFindOS (int clientOS, int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Перейдите по ссылке и скачайте приложение для IOS!");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {

            System.out.println("Перейдите по ссылке и скачайте облегченную версию приложения для IOS!");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Перейдите по ссылке и скачайте приложение для Android!  ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {

            System.out.println("Перейдите по ссылке и скачайте облегченную версию приложения для Android!  ");
        }
    }

       public static void DeliveryOfBankCards(int deliveryDistance){

           if (deliveryDistance<=20) {
               System.out.println("Доставка займет 1 день!");
           } else if  (deliveryDistance<=60) {
               System.out.println("Доставка займет 2 дня!");
           } else if  (deliveryDistance<=100) {
               System.out.println("Доставка займет 3 дня!");
           }
       }
    public static void main(String[] args) {
	// write your code here
            int year = 500;
        LeapYearVerification(year);
        int COS=0;
        int manYear=2017;
        toFindOS (COS,manYear);
        int Distance = 50;
        DeliveryOfBankCards(Distance);

    }
}
