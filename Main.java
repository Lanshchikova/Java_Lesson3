package geekbrains.ru.Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(guess_number());

    }
        public static int guess_number(){
            Random rand = new Random();
            int rand_variable = rand.nextInt(10);
            for (int i = 0; i < 3 ; i++) {
                System.out.println("Введите число от 0 до 9");
                int entered_variable = scanner.nextInt();
                if (entered_variable < rand_variable && i != 2){
                    System.out.println("Загаданное число больше!");
                } else if (entered_variable > rand_variable && i != 2){
                    System.out.println("Загаданное число меньше!");
                } else if(entered_variable == rand_variable){
                    System.out.println("Вы выиграли!");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    int repeat = scanner.nextInt();
                    while(repeat == 1){
                        System.out.println(guess_number());
                    }while(repeat == 0){
                        System.exit(0);
                    }
                } else if(i == 2 && entered_variable != rand_variable){
                    System.out.println("Вы проиграли!");
                    //break;
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    int repeat = scanner.nextInt();
                    while(repeat == 1){
                        System.out.println(guess_number());
                    }while (repeat == 0){
                        System.exit(0);
                    }
                } else {
                    System.out.println("Введите корректные данные!");
                }
            }
            return rand_variable;
        }
}
