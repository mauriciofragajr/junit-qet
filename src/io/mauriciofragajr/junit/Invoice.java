package io.mauriciofragajr.junit;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private Date date;
    private double total;
    private String clientName;
    private ArrayList<Payment> payments;
    private boolean paid;

    public boolean isPaid() {
        return paid;
    }

    public Invoice(Date date, double total, String clientName) {
        this.date = date;
        this.total = total;
        this.clientName = clientName;
        this.payments = new ArrayList<Payment>();
        this.paid = false;
    }

    public void billProcess(ArrayList<Billet> billets) {
        int sum = 0;
        for (Billet billet: billets) {
            Payment payment = new Payment(billet.getTotalPaid(), billet.getDate(), "Boleto");
            this.payments.add(payment);
            sum += billet.getTotalPaid();
        }
        if (sum >= this.total) paid = true;
    }
}

