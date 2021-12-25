package com.metanit;

/*
    4.
      Смешано V1 литров воды температуры t1 с V2 литрами воды температуры t2.
      Составить программу вычисления объема и температуры образованной смеси.
 */

import java.util.Locale;
import java.util.Scanner;

class Mixture {
    double v1, v2; // Объём смесей
    double t1, t2; // Температура смесей

    Mixture(double volume1, double volume2, double temperature1, double temperature2) {

        v1 = volume1;
        v2 = volume2;

        t1 = temperature1;
        t2 = temperature2;

    } // Конструктор который задаёт значения введеные пользователем

    double overVolume() {
        return v1 + v2;
    } // Метод для нахождения всего объёма смеси

    double overTemperature() {
        return (t1 * v1 + t2 * v2) / (v1 + v2);
    } // Метод для нахождения температуры образовавшейся смеси


}

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double v1, v2;
        double t1, t2;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите объём первой смеси: ");
        v1 = input.nextDouble();

        System.out.print("Введите объём второй смеси: ");
        v2 = input.nextDouble();

        System.out.print("Введите температуру первой смеси: ");
        t1 = input.nextDouble();

        System.out.print("Введите температуру второй смеси: ");
        t2 = input.nextDouble();

        Mixture Substance = new Mixture(v1, v2, t1, t2);
        System.out.println("Общий объём смеси: " + Substance.overVolume());
        System.out.println("Общая температура смеси: " + Substance.overTemperature());


    }
}
