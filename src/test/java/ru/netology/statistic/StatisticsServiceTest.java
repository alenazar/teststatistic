package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long[] incomesInBillions2 = {0, 5};
        long expected2 = 5;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);

        long actual2 = service.findMax(incomesInBillions2);
        assertEquals(expected2, actual2);
    }

}
