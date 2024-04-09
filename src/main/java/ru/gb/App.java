package ru.gb;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        double statistic;
        int iterations = 1000;

        for (int i = 0; i < iterations; i++) {
            new Game(3);
        }

        statistic = Game.countPlayerWin/iterations;
        System.out.println("Вероятность победы: " + statistic);

    }

}
