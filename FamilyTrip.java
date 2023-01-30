package exam1;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double budget= Double.parseDouble(scanner.nextLine());
        double nights= Double.parseDouble(scanner.nextLine());
        double pricefornight= Double.parseDouble(scanner.nextLine());
        double percent= Double.parseDouble(scanner.nextLine());


        if(nights>=8){
            pricefornight= pricefornight*0.95;
        }
        double sumallnights=pricefornight*nights;
        double moreexpenses= percent/100 *budget;

        double wholesum=sumallnights+moreexpenses;
        if(wholesum<=budget){
            double moneyleft= budget-wholesum;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", moneyleft);
        }else {
            double moneyneeded= wholesum-budget;
            System.out.printf("%.2f leva needed.", moneyneeded);
        }

    }
}
