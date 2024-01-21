package Lesson;

import java.math.BigDecimal;

public class CalcSum {
    public static void main(String[] args) {
            int currentYear = 2024;
            BigDecimal percent = BigDecimal.valueOf(0.05);
            BigDecimal sum = BigDecimal.valueOf(24L);
            for (int startYear = 1627; startYear < currentYear; startYear++) {
                BigDecimal percentSum = sum.multiply(percent);
                sum = sum.add(percentSum);
                System.out.println("Год: " + startYear + ", Доход:" + percentSum + ", Сумма:" + sum);
            }
        }
    }
