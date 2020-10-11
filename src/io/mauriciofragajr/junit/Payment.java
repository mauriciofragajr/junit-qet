package io.mauriciofragajr.junit;

import java.util.Date;

public class Payment {
    private double totalPaid;
    private Date date;
    private String type;

    public Payment(double totalPaid, Date date, String type) {
        this.totalPaid = totalPaid;
        this.date = date;
        this.type = type;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
