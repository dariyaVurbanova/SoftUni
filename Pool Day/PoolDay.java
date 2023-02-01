package exam1;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double people = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double poolBed = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double sumTax = people * tax;
        double countBed = Math.ceil(people*0.75)*poolBed ;
        double countUmbrellas = (Math.ceil(people / 2)) * umbrella;
        double sum = sumTax + countBed + countUmbrellas;
        System.out.printf("%.2f lv.", sum);
    }
}
