import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeTaxTypeTest {
    IncomeTaxType incomeTaxType = new IncomeTaxType();

    @Test
    public void incomeTaxTypeTest() {
        double amount = 1000000.00;
        double expected = 130000.00;

        double result = incomeTaxType.calculateTaxFor(amount);

        Assertions.assertEquals(expected, result);

    }
}
