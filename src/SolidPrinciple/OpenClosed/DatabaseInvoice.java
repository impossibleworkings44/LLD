package SolidPrinciple.OpenClosed;

public class DatabaseInvoice implements SavingInvoice{
    @Override
    public void save() {
        System.out.println("Saving invoice to DB");
    }
}
