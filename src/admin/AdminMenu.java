package admin;

import admin.Admin;
import member.UserInformationDaoImpl;

import java.util.Scanner;

public class AdminMenu {
    public static void main(Admin admin) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                           МЕНЮ АДМИНА
                    ––––––––––––––––––––––––––
                    Пожалуйста, выберите действие:
                    1) Добавить инструкции
                    2) Указать максимальную стоимость
                    3) Указать дату окончания
                    4) Показать список игроков и смешать их
                    5) Показать инструкции
                    6) Показать максимальную стоимость
                    7) Показать дату окончания
                    0) Выйти""");
            int command = sc.nextInt();
            switch (command) {
                case 1 -> Data.addInstruction();
                case 2 -> Admin.setMaxCost();
                case 3 -> Admin.setEndDate();
                case 4 -> {
                    System.out.println(UserInformationDaoImpl.newMemberList.toString());
                    if(UserInformationDaoImpl.newMemberList.isEmpty()){
                        System.out.println("Ошибка! Нет участников");
                    }else{
                        Admin.randomize();
                    }
                }
                case 5 -> Data.getInstruction();
                case 6 -> Admin.getMaxCost();
                case 7 -> Admin.getEndDate();
            }
            if (command == 0) {
                break;
            }
        }
    }
}
