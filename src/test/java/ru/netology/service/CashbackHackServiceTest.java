package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateAmount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateAmount100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}