package io.mauriciofragajr.junit;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    private ArrayList items;

    public Cart() {
        items = new ArrayList();
    }

    public double getTotalValue() {
        double totalValue = 0.0;

        for (Iterator i = items.iterator(); i.hasNext();) {
            Product item = (Product) i.next();
            totalValue += item.getPrice();
        }

        return totalValue;
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void removeItem(Product item) throws ProductNotFoundException {
        if (!items.remove(item)) {
            throw new ProductNotFoundException();
        }
    }

    public int getCountItems() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

}
