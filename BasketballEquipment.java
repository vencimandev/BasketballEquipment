package Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AnnualFeePerYear = Integer.parseInt(scanner.nextLine());

        // Баскетболни кецове - Цената им е 40% по-малка от таксата за една година
        // Баскетболен екип - Цената му е 20% по-малка от баскетболните кецове
        // Баскетболна топка - Цената е 1/4 по-малка от цената на баскетболния екип
        // Баскетболни аксесоари - Цената им е 1/5 от цената на баскетболната топка

        double SneakersPrice = AnnualFeePerYear - AnnualFeePerYear * 0.40;
        double Sportswear = SneakersPrice * 0.80;
        double BasketBall = Sportswear * 0.25;
        double AccesoariesForBasket = BasketBall * 0.20;
        double totalSum = AnnualFeePerYear + SneakersPrice + Sportswear + BasketBall + AccesoariesForBasket;
        System.out.println(totalSum); }
    }