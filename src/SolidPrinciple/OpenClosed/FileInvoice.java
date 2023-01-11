package SolidPrinciple.OpenClosed;

public class FileInvoice implements SavingInvoice {
    @Override
    public void save() {
        System.out.println("Saving invoice as File.pdf");
    }
}
