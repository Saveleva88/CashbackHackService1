package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
        CashbackHackService cashbackHackService = new CashbackHackService();
        @Test
        public void shouldCalculateHowMuchBuy() {
            int actual = cashbackHackService.remain(100);
            int expected = 900;
            assertEquals(actual,expected);
        }
        @Test
        public void shouldCalculateHowMuchBuy2() {
            //В этом тесте ошибка
            int actual = cashbackHackService.remain(1000);
            int expected = 0;
            assertEquals(actual,expected);
        }
        @Test
        public void shouldCalculateHowMuchBuy3() {
            int actual = cashbackHackService.remain(0);
            int expected = 1000;
            assertEquals(actual,expected);
        }
        @Test
        public void shouldCalculateHowMuchBuy4() {
            int actual = cashbackHackService.remain(1300);
            int expected = 700;
            assertEquals(actual,expected);
        }
        @Test
        public void shouldCalculateHowMuchBuy5() {
            int actual = cashbackHackService.remain(955);
            int expected = 45;
            assertEquals(actual,expected);
        }

    }