import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1_000, 1_100, 1_200};

        int expectedSum = 7_800;
        int actualSum = service.calculateSumSale(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1_000, 1_100, 1_200};

        int expectedAverSum = 650;
        int actualAverSum = service.averageSumSale(sales);

        Assertions.assertEquals(expectedAverSum, actualAverSum);
    }

    @Test
    public void monthOfMaximumSales() {
        StatsService service = new StatsService();
        long[] sales = {100, 200, 1_200, 400, 500, 600, 700, 800, 900, 1_000, 1_100, 300};

        int expectedNumMax = 3;
        int actualNumMax = service.maximumSaleAmount(sales);

        Assertions.assertEquals(expectedNumMax, actualNumMax);
    }

    @Test
    public void monthsOfMinimumSales() {
        StatsService service = new StatsService();
        long[] sales = {500, 200, 300, 400, 100, 600, 700, 800, 900, 1_000, 1_100, 1_200};

        int expectedNumMin = 5;
        int actualNumMin = service.minimumSaleAmount(sales);

        Assertions.assertEquals(expectedNumMin, actualNumMin);
    }

    @Test
    public void numberOfMonthsOfSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1_000, 1_100, 1_200};

        int expectedLessAverage = 6;
        int actualLessAverage = service.numberOfMinimumSales(sales);

        Assertions.assertEquals(expectedLessAverage, actualLessAverage);
    }

    @Test
    public void numberOfMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1_000, 1_100, 1_200};

        int expectedAboveAverage = 6;
        int actualAboveAverage = service.numberOfMaximumSales(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }


}
