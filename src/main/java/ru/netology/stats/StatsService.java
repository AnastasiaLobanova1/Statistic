package ru.netology.stats;

public class StatsService {
    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[1];
        }
        return sum;
    }

    public long averageSumInMonth(long[] sales) {
        return sumAllSales(sales) / sales.length;

    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int count = 0;
        long averageSale = averageSumInMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int highAverage(long[] sales) {
        int count = 0;
        long averageSale = averageSumInMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                count++;
            }
        }
        return count;
    }

}
