import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgressiveTaxTypeTest {
    ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();

    @Test
    public void progressiveTaxTypeTest(){
        double amount = 1000000.00;
        double expected = 150000.00;

        double result = progressiveTaxType.calculateTaxFor(amount);

        Assertions.assertEquals(expected, result);

    }
}
