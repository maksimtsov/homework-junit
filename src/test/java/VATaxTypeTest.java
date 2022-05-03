import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VATaxTypeTest {
    VATaxType vaTaxType = new VATaxType();

    @Test
    public void vaTaxTypeTest() {
        double amount = 1000000.00;
        double expected = 180000.00;

        double result = vaTaxType.calculateTaxFor(amount);

        Assertions.assertEquals(expected, result);

    }
}
