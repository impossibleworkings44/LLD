package SolidPrinciple.SingleResponsibility;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = (marker.price * this.quantity);
        return price;
    }

    /*
     //Single Responsibilty method should have only 1 reason to change
     public int printInvoice() {}
    */
}
