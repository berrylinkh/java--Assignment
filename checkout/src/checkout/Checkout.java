package checkout;

import java.util.ArrayList;
import java.util.Collection;

public class Checkout {
   private ArrayList<String> items = new ArrayList<String>();
   private ArrayList<Double> prices = new ArrayList<Double>();
   private ArrayList<Integer> quantities = new ArrayList<Integer>();

    public void addItem(String item, double price, int quantity) {
        items.add(item);
        prices.add(price);
        quantities.add(quantity);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public ArrayList<Double> getPrices() {
        return prices;
    }

    public ArrayList<Integer> getQuantity() {
        return quantities;
    }

    public ArrayList<Double> getPricePerItem() {
        ArrayList<Double> totalPricePerItem = new ArrayList<>();
        for(int index = 0; index < prices.size(); index++) {
            double itemTotal = prices.get(index) * quantities.get(index);
            totalPricePerItem.add(itemTotal);
        }
        return totalPricePerItem;
        }

    public double getSubTotalPrice() {
        ArrayList<Double> itemPrices = getPricePerItem();
        double subTotal =00.0;
        for(Double price: itemPrices){
            subTotal += price;
        }
       return subTotal;
    }

    public double getDiscountPrice() {
        double subtotal = getSubTotalPrice();
        double discount = subtotal * 0.10;
        return discount;
    }

    public double getVATAmount() {
        double subtotal = getSubTotalPrice();
        double amountForVAT = subtotal * 7.5/100;
        return amountForVAT;
    }

    public double getTotal() {
        double subtotal = getSubTotalPrice();
        double discount =getDiscountPrice();
        double vat = getVATAmount();
        double totalPrice = (subtotal - discount) + vat;

        return totalPrice;
    }
}
