package main;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        try (Scanner guess_service = new Scanner(System.in)) {
            Random numService = new Random();
            int num = numService.nextInt(500);
            System.out.println("Угодай число");
            while(true){
                System.out.print("Введите число:");
                int guess = guess_service.nextInt();
                if(guess > num){
                    System.out.println("Ваше число больше задоного"); 
                }else if(guess < num){
                    System.out.println("Ваше число меньше задоного");
                }else{
                    break;
                }
            }
   System.out.println("Вы угодали число:" + Integer.toString(num));
        }
    }
}