package HW_1;

// Задание 1:
// Вывести числа от 1000 до 1 с шагом -2.

public class Numbers {
    public static void main(String[] args) {
        int currentNumber = 1000;

        while (currentNumber > 1) {
            System.out.print(currentNumber + ", ");
            currentNumber = currentNumber - 2;
        }
    }
}
