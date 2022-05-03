public class Main {
    static TaxService taxService = new TaxService();
    public static void main(String[] args) {
        Bill[] payments = new Bill[] {
                new Bill(20254,new IncomeTaxType(),taxService),
                new Bill(105742,new VATaxType(),taxService),
                new Bill(5423574,new ProgressiveTaxType(),taxService)
        };
        for (int i=0; i <payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
