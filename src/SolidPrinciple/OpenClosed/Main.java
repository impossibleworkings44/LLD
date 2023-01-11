package SolidPrinciple.OpenClosed;

public class Main {
    public static void main(String[] args) {
        FileInvoice f = new FileInvoice();
        DatabaseInvoice db = new DatabaseInvoice();
        f.save();
        db.save();
    }
}

