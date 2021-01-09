package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100)/1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110)/1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manheight = 170;
        short womanheight = 160;
        double man = Fit.manWeight(manheight);
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Man 170 is " + man);
        System.out.println("Man 160 is " + woman);
    }

}

//1. Создайте класс ru.job4j.calculator.FitTest.
//2. Создайте в нем тест-методы для проверки идеального веса для мужчины и женщины.
//3. Загрузите код в репозиторий. Оставьте ссылку на коммит.