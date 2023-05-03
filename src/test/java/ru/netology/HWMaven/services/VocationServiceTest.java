package ru.netology.HWMaven.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VocationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Vocation.csv")
    public void testCalculateVocation (int income, int expenses, int threshold, int expected) {
        VocationService service = new VocationService();

      //  int income = 10_000;
      //  int expenses = 3_000;
      //  int threshold = 20_000;
      //  int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

   // @Test
   // public void testCalculateVocationExample2 () {
   //     VocationService service = new VocationService();
   //     int income = 100_000;
   //     int expenses = 60_000;
   //     int threshold = 150_000;
   //      int expected = 2;
   //     int actual = service.calculate(income, expenses, threshold);

    //    Assertions.assertEquals(expected, actual);
    //}
}
