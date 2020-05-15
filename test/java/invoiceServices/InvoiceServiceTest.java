package invoiceServices;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_GeneratorShouldReturn_TotalFareForNormalRide() {
        double distance = 2.0;
        int time = 5;
        InvoiceService invoiceGenerator = null;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }
}
