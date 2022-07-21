package HW_1;

// Задание 2:
// На вход дано шестизначное число (номер билета),
// проверить, что билет является счастливым
// (сумма первых трёх цифры равна сумме последних трёх цифр).

import java.util.Scanner;

public class HappyTicket {
    private int ticketNumber = 0;

    public HappyTicket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public static void checkTicket(int ticketNumber) {
        String ticketNumberStr = Integer.toString(ticketNumber);
        char[] ticketNumberArr = ticketNumberStr.toCharArray();
        int sumFirstHalfOfTicket = Integer.parseInt(String.valueOf(ticketNumberArr[0])) + Integer.parseInt(String.valueOf(ticketNumberArr[1])) + Integer.parseInt(String.valueOf(ticketNumberArr[2]));
        int sumSecondHalfOfTicket = Integer.parseInt(String.valueOf(ticketNumberArr[3])) + Integer.parseInt(String.valueOf(ticketNumberArr[4])) + Integer.parseInt(String.valueOf(ticketNumberArr[5]));
        if (sumFirstHalfOfTicket == sumSecondHalfOfTicket) {
            System.out.println("It is a lucky ticket. U are cool man!");
        }
        else {
            System.out.println("Sorry, u are loser!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Give me number of u ticket:");
        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();
        HappyTicket.checkTicket(ticketNumber);
    }
}
