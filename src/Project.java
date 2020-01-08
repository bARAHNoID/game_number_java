
import java.util.Random;
import  java.util.Scanner;


class Project {
    public static void main(String[] args) {
        Random x = new Random();
        Scanner sc =new Scanner (System.in);
        do {
            int count = 0;  //попытки
            int guess = -1;  // число угадывания
            int number = x.nextInt(50);  //рандомное число загаданное компьютером всегда ОТ 0 до заданного параметра

            //удалить +number чтобы не показывало ответ

            while (count < 3 && guess != number) {
                System.out.println("ВВЕДИТЕ ЧИСЛО ..." + number);
                guess = sc.nextInt();
                if (number != guess) {
                    if (guess <= -1) {
                        System.out.println("НЕДОПУСТИМОЕ ЧИСЛО , ВВОДИТЕ ОТ 0 ДО 50...");
                    } else if (guess >= 51) {
                        System.out.println("НЕДОПУСТИМОЕ ЧИСЛО , ВВОДИТЕ ОТ 0 ДО 50...");
                    } else {
                        System.out.println("ВАШЕ ЧИСЛО " + ((guess > number) ? "БОЛЬШЕ ЗАГАДАННОГО" : "МЕНЬШЕ ЗАГАДАННОГО"));
                        count++;
                    }
                }
            }
            System.out.println("ВЫ " + ((guess == number) ? "ВЫИГРАЛИ! =)" : "ПРОИГРАЛИ =("));
            System.out.println("ПОВТОРИМ ИГРУ??? ДА - 1 , НЕТ - 0");
        }
        while (sc.next().equals("1"));
    }
}
