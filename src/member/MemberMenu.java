package member;

import admin.Admin;
import admin.Data;

import java.util.Scanner;


public class MemberMenu {
    public static void main(Member member) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                           МЕНЮ УЧАСТНИКА
                    ––––––––––––––––––––––––––
                    Пожалуйста, выберите действие:
                           
                    1) ваш получатель
                    2) ваша желаемая категория подарка
                    0) Выйти""");
            int command = sc.nextInt();
            switch (command) {
                case 1 -> Member.ShowReceiver();
                case 2 -> Admin.getMaxCost();
                case 0 -> {
                    break;
                }
            }
            if (command == 0) {
                break;
            }
        }

    }
}