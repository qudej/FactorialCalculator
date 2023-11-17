import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число для расчета:");
        int value = new Scanner(System.in).nextInt();
        int result = 1;
        if (value > 12) {
            System.out.println("Факториал может быть посчитан только для чисел не более 12");
        } else {
            for (int i = 1; i <= value; i = i + 1) {
                result = result * i;
            }
            System.out.println("Ответ: " + result);
        }
    }
}