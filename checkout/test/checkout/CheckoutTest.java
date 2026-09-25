package checkout;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CheckoutTest {
    private Checkout checKout;

    @BeforeEach
    public void checkout() {
        checKout=new Checkout();
    }

    @Test
    public void testThatItemsAreAdded(){
        checKout.addItem("laptop", 2500.0, 2);
        assertEquals(1, checKout.getItems().size());
        assertEquals(1,checKout.getPrices().size());
        assertEquals(1,checKout.getQuantity().size());
    }
    @Test
    public void testThatMultipleItemsAreAdded(){
        checKout.addItem("laptop", 2500.0, 2);
        checKout.addItem("car", 3000.0, 2);
        assertEquals(2, checKout.getItems().size());
        assertEquals(2,checKout.getPrices().size());
        assertEquals(2,checKout.getQuantity().size());
    }
    @Test
    public void testThatPricePerItemIsCalculated(){
        checKout.addItem("laptop", 2500.0, 2);
        assertEquals(1, checKout.getItems().size());
        assertEquals(1,checKout.getPrices().size());
        assertEquals(1,checKout.getQuantity().size());
        ArrayList<Double> actual = checKout.getPricePerItem();
        assertEquals(5000.0, actual.get(0));
    }
    @Test
    public void testThatMultiplePricePerItemIsCalculated(){
        checKout.addItem("laptop", 2500.0, 2);
        checKout.addItem("car", 3000.0, 2);
        assertEquals(2, checKout.getItems().size());
        assertEquals(2,checKout.getPrices().size());
        assertEquals(2,checKout.getQuantity().size());
        ArrayList<Double> actual = checKout.getPricePerItem();
        assertEquals(5000.0, actual.get(0));
        assertEquals(6000.0, actual.get(1));
    }
    @Test
    public void testThatTotalPriceIsCalculated(){
        checKout.addItem("laptop", 2500.0, 2);
        checKout.addItem("car", 3000.0, 2);
        assertEquals(2, checKout.getItems().size());
        assertEquals(2,checKout.getPrices().size());
        assertEquals(2,checKout.getQuantity().size());
        assertEquals(11000.0, checKout.getSubTotalPrice());
    }
    @Test
    public void testThatDiscountIsCalculated(){
        checKout.addItem("laptop", 2500.0, 2);
        checKout.addItem("car", 3000.0, 2);
        assertEquals(2, checKout.getItems().size());
        assertEquals(2,checKout.getPrices().size());
        assertEquals(2,checKout.getQuantity().size());
        assertEquals(1100.0, checKout.getDiscountPrice());
    }
    @Test
    public void testThatVATIsCalculated(){
        checKout.addItem("laptop", 2500.0, 2);
        checKout.addItem("car", 3000.0, 2);
        assertEquals(2, checKout.getItems().size());
        assertEquals(2,checKout.getPrices().size());
        assertEquals(2,checKout.getQuantity().size());
        assertEquals(825.0, checKout.getVATAmount());
    }
    @Test
    public void testThatTotalPriceAfterDiscountIsCalculated(){
        checKout.addItem("laptop", 2500.0, 2);
        checKout.addItem("car", 3000.0, 2);
        assertEquals(2, checKout.getItems().size());
        assertEquals(2,checKout.getPrices().size());
        assertEquals(2,checKout.getQuantity().size());
        assertEquals(10725.0, checKout.getTotal());
    }
}
