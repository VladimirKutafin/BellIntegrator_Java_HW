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
        int sumFirst = 0;
        int sumSecond = 0;
        if (ticketNumberArr.length%2 == 0){
            for (int i = 0; i < ticketNumberArr.length; i++) {
                if (i<ticketNumberArr.length/2) {
                    sumFirst = sumFirst + Integer.parseInt(String.valueOf(ticketNumberArr[i]));
                }
                else {
                    sumSecond = sumSecond + Integer.parseInt(String.valueOf(ticketNumberArr[i]));
                }
            }
            if (sumFirst == sumSecond) {
                System.out.println("It is a lucky ticket. U are cool man!");
            }
            else {
                System.out.println("Sorry, ticket isnt lucky. U are loser!");
            }
        }
        else {
            System.out.println("U give me odd even number of ticket");
        }
    }

    public static void main(String[] args) {
        System.out.println("Give me number of u ticket:");
        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();
        HappyTicket.checkTicket(ticketNumber);
    }
}
