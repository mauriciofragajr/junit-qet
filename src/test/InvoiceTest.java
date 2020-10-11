package test;

import io.mauriciofragajr.junit.Billet;
import io.mauriciofragajr.junit.Invoice;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    Invoice invoice;

    @Description("Fatura de 1500 com 3 boletos precisa estar paga no final")
    @Test
    void invoicePaid() {
        this.invoice = new Invoice(new Date(), 1500, "Vânia");
        ArrayList<Billet> billets = new ArrayList<Billet>();
        billets.add(new Billet("123", new Date(), 500));
        billets.add(new Billet("456", new Date(), 400));
        billets.add(new Billet("789", new Date(), 600));
        this.invoice.billProcess(billets);
        assertEquals(true, this.invoice.isPaid());
    }

    @Description("Fatura de 1500 com 3 boletos precisa estar paga no final")
    @Test
    void invoicePaidDifferentValues() {
        this.invoice = new Invoice(new Date(), 1500, "Mauricio");
        ArrayList<Billet> billets = new ArrayList<Billet>();
        billets.add(new Billet("123", new Date(), 1000));
        billets.add(new Billet("456", new Date(), 500));
        billets.add(new Billet("789", new Date(), 250));
        this.invoice.billProcess(billets);
        assertEquals(true, this.invoice.isPaid());
    }

    @Description("Fatura de 2000 com 2 boletos precisa não estar paga no final")
    @Test
    void invoiceUnpaid() {
        this.invoice = new Invoice(new Date(), 2000, "Daiana");
        ArrayList<Billet> billets = new ArrayList<Billet>();
        billets.add(new Billet("123", new Date(), 500));
        billets.add(new Billet("456", new Date(), 400));
        this.invoice.billProcess(billets);
        assertEquals(false, this.invoice.isPaid());
    }

}