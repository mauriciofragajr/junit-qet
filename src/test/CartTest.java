package test;

import io.mauriciofragajr.junit.Cart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartTest {

    private Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @Test
    public void testGetTotalValue() {
        assertEquals(0, cart.getTotalValue());
    }
}