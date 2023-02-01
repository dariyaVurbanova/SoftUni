package exam1;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packag = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        if (days > 7) {
            days -= 1;
        }
        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            switch (city) {
                case "Bansko":
                case "Borovets":
                    if (packag.equals("noEquipment")) {
                        sum = 80 * days;
                        if (vipDiscount.equals("yes")) {
                            sum *= 0.95;
                        }
                        System.out.printf("The price is %.2flv! Have a nice time!", sum);

                    } else if (packag.equals("withEquipment")) {
                        sum = 100 * days;
                        if (vipDiscount.equals("yes")) {
                            sum *= 0.9;
                        }
                        System.out.printf("The price is %.2flv! Have a nice time!", sum);

                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;
                case "Varna":
                case "Burgas":
                    if (packag.equals("noBreakfast")) {
                        sum = 100 * days;
                        if (vipDiscount.equals("yes")) {
                            sum *= 0.93;
                        }
                        System.out.printf("The price is %.2flv! Have a nice time!", sum);

                    } else if (packag.equals("withBreakfast")) {
                        sum = 130 * days;
                        if (vipDiscount.equals("yes")) {
                            sum *= 0.88;
                        }
                        System.out.printf("The price is %.2flv! Have a nice time!", sum);

                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;
                default:
                    System.out.println("Invalid input!");

            }
        }

    }
}
