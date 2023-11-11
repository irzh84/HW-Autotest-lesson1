package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateAmount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(expected, actual);
    }
}


