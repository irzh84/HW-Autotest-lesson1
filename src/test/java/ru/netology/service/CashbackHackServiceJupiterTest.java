package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateAmount900() {
        Assertions.assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldCalculateAmount999() {
        Assertions.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldCalculateAmount1000() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldCalculateAmount1001() {
        Assertions.assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldCalculateAmount0() {
        Assertions.assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldCalculateAmount1() {
        Assertions.assertEquals(999, service.remain(1));
    }
}
