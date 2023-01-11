package SolidPrinciple.SingleResponsibility;

public class PrintInvoice {
    private Invoice invoice;
    PrintInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    void printReceipt() {
        System.out.println("[Printing Invoice details] :: cost "+this.invoice.calculateTotal()+" extra....");
    }
}
