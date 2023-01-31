package exam1;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bevarage = scanner.nextLine();
        String sugar = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if(bevarage.equals("Espresso") && sugar.equals("Without")){
            sum=0.9;
        } else if (bevarage.equals("Espresso") && sugar.equals("Normal")) {
            sum=1;
        } else if (bevarage.equals("Espresso") && sugar.equals("Extra")) {
            sum=1.2;
        } else if (bevarage.equals("Cappuccino")&& sugar.equals("Without")) {
            sum=1;
        }else if (bevarage.equals("Cappuccino")&& sugar.equals("Normal")) {
            sum=1.2;
        }else if (bevarage.equals("Cappuccino")&& sugar.equals("Extra")) {
            sum=1.6;
        }else if (bevarage.equals("Tea")&& sugar.equals("Without")) {
            sum=0.5;
        }else if (bevarage.equals("Tea")&& sugar.equals("Normal")) {
            sum=0.6;
        }else if (bevarage.equals("Tea")&& sugar.equals("Extra")) {
            sum=0.7;
        }

        double wholesum=sum*count;
        if (sugar.equals("Without")) {
            wholesum=wholesum * 0.65;
        }
        if (bevarage.equals("Espresso") && count >= 5) {
            wholesum = wholesum * 0.75;
        }
        if (wholesum > 15) {
            wholesum = wholesum * 0.80;
        }

        System.out.printf("You bought %s cups of %s for %.2f lv.", count, bevarage, wholesum);
    }
}
