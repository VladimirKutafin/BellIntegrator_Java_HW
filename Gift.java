package HW_1;

// Задание 3:
// На вход программы подаётся 4 числа: вес подарка, вес апельсина, вес яблока, вес груши.
// Каждый подарок состоит из произвольного набора апельсинов, яблок и груш,
// необходимо вывести количество способов составить подарок с заданными весом.

import java.util.Scanner;

public class Gift {
    private double giftWeight = 0;
    private double orangeWeight = 0;
    private double appleWeight = 0;
    private double pearWeight = 0;

    public static double [] thingsWeightArr;
    public static double [] immersionDepthArr;
    public static int sum = 0;

    public Gift(double giftWeight, double orangeWeight, double appleWeight, double pearWeight) {
        this.giftWeight = giftWeight;
        this.orangeWeight = orangeWeight;
        this.appleWeight = appleWeight;
        this.pearWeight = pearWeight;
    }

    public Gift() {}

    public void setGiftWeight(double giftWeight) {
        this.giftWeight = giftWeight;
    }

    public void setOrangeWeight(double orangeWeight) {
        this.orangeWeight = orangeWeight;
    }

    public void setAppleWeight(double appleWeight) {
        this.appleWeight = appleWeight;
    }

    public void setPearWeight(double pearWeight) {
        this.pearWeight = pearWeight;
    }

    public double getGiftWeight() {
        return giftWeight;
    }

    public double getOrangeWeight() {
        return orangeWeight;
    }

    public double getAppleWeight() {
        return appleWeight;
    }

    public double getPearWeight() {
        return pearWeight;
    }

    public static double min(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int maxNumbersOfWays(double giftWeight, int j, int k) {
        if (giftWeight==0) {
            for(int i=0; i<k; i++) {
                System.out.print(immersionDepthArr[i]+" ");
            }
            sum=sum + 1;
            System.out.println("\n");
        }
        else if (giftWeight > 0) {
            for(int i=j; i<3; i++) {
                immersionDepthArr[k]=thingsWeightArr[i]; maxNumbersOfWays(giftWeight-thingsWeightArr[i],i,k+1);
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        Gift gift = new Gift();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write weight of things in format:    <weight of gift> <weight of orange> <weight of apple> <weight of pear>");
        String allThingsWeightString = scanner.nextLine();
        String [] allThingsWeightArr = allThingsWeightString.split(" ");

        gift.setGiftWeight(Double.valueOf(allThingsWeightArr[0]));
        gift.setOrangeWeight(Double.valueOf(allThingsWeightArr[1]));
        gift.setAppleWeight(Double.valueOf(allThingsWeightArr[2]));
        gift.setPearWeight(Double.valueOf(allThingsWeightArr[3]));

        Double thingWithSmallestWeight = Gift.min(gift.getOrangeWeight(), gift.getAppleWeight(), gift.getPearWeight());
        int immersionDepth = (int)(Math.floor(gift.getGiftWeight()/thingWithSmallestWeight));

        immersionDepthArr = new double[immersionDepth];
        thingsWeightArr = new double[] {gift.getOrangeWeight(), gift.getAppleWeight(), gift.getPearWeight()};

        int sum = maxNumbersOfWays(gift.getGiftWeight(),0,0);

        System.out.println("Numbers of options for creating a gift:   " + sum);
    }
}
