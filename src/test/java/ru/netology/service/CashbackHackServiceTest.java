package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();
    @Test
    public void shouldCalculateHowMuchBuy() {
        int actual = cashbackHackService.remain(300);
        int expected = 700;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateHowMuchBuy2() {
        //В этом тесте ошибка
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculateHowMuchBuy3() {
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculateHowMuchBuy4() {
        int actual = cashbackHackService.remain(1800);
        int expected = 200;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculateHowMuchBuy5() {
        int actual = cashbackHackService.remain(744);
        int expected = 256;
        assertEquals(expected,actual);
    }

}