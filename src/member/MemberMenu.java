package member;

import admin.Admin;
import admin.Data;
import java.util.Scanner;


public class MemberMenu {
    public static void main(Member member) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           МЕНЮ УЧАСТНИКА
                    ––––––––––––––––––––––––––
                    Пожалуйста, выберите действие:
                    1) Логин
                    2) пароль
                    3) ваш получатель
                    4) ваша желаемая категория подарка
                    0) Выйти""");
        int command = sc.nextInt();
        switch (command) {
            case 1 -> Data.addInstruction();
            case 2 -> Admin.setMaxCost();
            case 3 -> Member.ShowReceiver();
            case 4 -> {
                if(UserInformationDaoImpl.newMemberList.isEmpty()){
                    System.out.println("Ошибка! Нет участников");
                }else if (UserInformationDaoImpl.newMemberList.size() % 2 != 0){
                    System.out.println("Нечётное количество участников!");
                    System.out.println("Общее количество участников: " + UserInformationDaoImpl.newMemberList.size());
                }else{
                    Admin.randomize();
                }
            }
            case 0 -> {
                return;
            }
        }
    }
}