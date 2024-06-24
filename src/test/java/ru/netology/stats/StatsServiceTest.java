package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumAllSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = statsService.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSumInMonth() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = statsService.averageSumInMonth(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = statsService.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = statsService.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testBelowAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = statsService.belowAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = statsService.highAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

}
