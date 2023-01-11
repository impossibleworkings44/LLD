package SolidPrinciple.SingleResponsibility;
public class Main {
    public static void main(String[] args) {
        Marker m = new Marker("Apsara", "Black", 1999, 20);
        //calculate TotalCost
        Invoice i1 = new Invoice(m, 10);
        //printInvoice details for marker
        PrintInvoice p1 = new PrintInvoice(i1);
        int totalPrice = i1.calculateTotal();
        System.out.println("Invoice Details :: $"+totalPrice);
        p1.printReceipt();
    }
}
