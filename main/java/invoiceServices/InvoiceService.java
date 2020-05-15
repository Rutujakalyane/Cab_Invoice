package invoiceServices;

public class InvoiceService {
    private static final double NORMAL_MINIMUM_COST_PER_KILOMETER = 10;
    private static final int NORMAL_COST_PER_MIN = 1;

    public double calculateFare(double distance, int time) {
        return distance * NORMAL_MINIMUM_COST_PER_KILOMETER + time * NORMAL_COST_PER_MIN;

    }
    }
