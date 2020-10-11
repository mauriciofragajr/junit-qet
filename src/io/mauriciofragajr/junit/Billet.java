package io.mauriciofragajr.junit;

import java.util.Date;

public class Billet {
    private String code;
    private Date date;
    private double totalPaid;

    public Billet (String code, Date date, double totalPaid) {
        this.code = code;
        this.date = date;
        this.totalPaid = totalPaid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }
}
