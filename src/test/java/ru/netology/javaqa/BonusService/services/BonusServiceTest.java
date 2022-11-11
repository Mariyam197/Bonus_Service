package ru.netology.javaqa.BonusService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateBonus(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}