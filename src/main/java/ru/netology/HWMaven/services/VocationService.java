package ru.netology.HWMaven.services;
public class VocationService {
    public int calculate(int income, int expenses, int threshold) {
        int countMonth = 0;
        int money = 0;
        for (int Month = 0; Month < 12; Month++) {
            if (money >= threshold) {
                countMonth++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return countMonth;
    }
}