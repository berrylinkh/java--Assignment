package checkout;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
public class CheckoutMain {
    public static void main (String[]args) {
        Checkout system = new Checkout();
        Scanner inputCollector = new Scanner (System.in);

        System.out.println("Enter cashier name: ");
        String cashierName = inputCollector.nextLine();
        System.out.println("Enter customer's name: ");
        String customerName = inputCollector.nextLine();
        LocalDateTime currentTime = LocalDateTime.now();

        int cashierInput = 1;
        while(cashierInput!=0) {
            System.out.println("What did the user buy: ");
            String itemPurchase = inputCollector.nextLine();

            System.out.println("How many quantity: ");
            int itemQuantity = inputCollector.nextInt();

            System.out.println("How much per unit: ");
            double itemAmount = inputCollector.nextDouble();
            system.addItem(itemPurchase,itemAmount,itemQuantity);

            inputCollector.nextLine();

            System.out.println("Do you want to add more item Yes/No: ");
            String buyMOre = inputCollector.nextLine().toUpperCase();

            if(buyMOre.equals("NO")){
                cashierInput = 0;
            }
        }
        System.out.println("Welcome to Semicolon Store (Main Branch)");
        System.out.println("LOCATION: 312 Herbert Macaulay Street Way,Sabo Yaba,Lagos.");
        System.out.println ("TELEPHONE: 08069822184");
        System.out.println ("DATE: "+currentTime);
        System.out.println ("CASHIER NAME: "+cashierName);
        System.out.println ("CUSTOMER'S NAME: "+customerName);

        System.out.println("===================================================");
        System.out.printf("%14s %8s %8s %14s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------");
        ArrayList<String> itemList = system.getItems();
        ArrayList<Integer> quantities = system.getQuantity();
        ArrayList<Double> prices = system.getPrices();
        ArrayList<Double> totalPerItem = system.getPricePerItem();
        for (int index =0; index < itemList.size(); index++) {
            System.out.printf("%14s %7d %10.1f %9.1f\n", itemList.get(index), quantities.get(index), prices.get(index), totalPerItem.get(index));
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("    \tSub Total: %.1f\n", system.getSubTotalPrice());
        System.out.printf("    \tDiscount: %.1f\n", system.getDiscountPrice());
        System.out.printf("    \tVAT @ 7.5 Total: %.1f\n", system.getVATAmount());
        System.out.println("===================================================");
        System.out.printf("    \ttotal Bil: %.1f\n", system.getTotal());
        System.out.println("===================================================");
        System.out.printf("  \tTHIS IS NOT AN RECEIPT, KINDLY PAY %.1f\n", system.getTotal());
        System.out.println("===================================================");
        System.out.println("------------------>>>INVOICE<<<-------------------");


        System.out.println("Enter amount paid: ");
        double amountPaid = inputCollector.nextDouble();
        double total = system.getTotal();
        double balance = amountPaid - total;
        System.out.println("Welcome to Semicolon Store (Main Branch)");
        System.out.println("LOCATION: 312 Herbert Macaulay Street Way,Sabo Yaba,Lagos.");
        System.out.println ("TELEPHONE: 08069822184");
        System.out.println ("DATE: "+currentTime);
        System.out.println ("CASHIER NAME: "+cashierName);
        System.out.println ("CUSTOMER'S NAME: "+customerName);

        System.out.println("===================================================");
        System.out.printf("%14s %8s %8s %14s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------");
        for (int index =0; index < itemList.size(); index++) {
            System.out.printf("%14s %7d %10.1f %9.1f\n", itemList.get(index), quantities.get(index), prices.get(index), totalPerItem.get(index));
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("    \tSub Total: %.1f\n", system.getSubTotalPrice());
        System.out.printf("    \tDiscount: %.1f\n", system.getDiscountPrice());
        System.out.printf("    \tVAT @ 7.5 Total: %.1f\n", system.getVATAmount());
        System.out.println("===================================================");
        System.out.printf("    \ttotal Bil: %.1f\n", system.getTotal());
        System.out.printf("    \tAmount Paid: %.1f\n",amountPaid);
        System.out.printf("    \tBalance: %.1f\n", balance);
        System.out.println("===================================================");
        System.out.println("    \tTHANK YOU FOR YOUR PATRONAGE");
        System.out.println("===================================================");
        System.out.println("-------------->>>PAYMENT RECEIPT<<<----------------");
    }
}
