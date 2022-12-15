import member.Member;
import member.MemberMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (true){
            System.out.println("""
                    ДОБРО ПОЖАЛОВАТЬ В МЕНЮ ИГРЫ "ТАЙНЫЙ САНТА"
                    –––––––––––––––––––––––––––––––––––––––––––
                    Пожалуйста, выберите действие:
                    1) Войти в как Админ
                    2) Войти как участник
                    0) Выйти из меню""");
            int command = sc.nextInt();
            if (command == 1) {
                Admin admin = new Admin();
                System.out.println("Введите пароль: ");
                String adminPassword = sc.next();
                if (Admin.getAdminPassword().equals(adminPassword)){
                    AdminMenu.main(admin);
                }else {
                    System.out.println("Неправильный пароль!!!!");
                    break;
                }
            }else if (command == 2) {
                MemberMenu.main(new Member());
            } else if (command == 0) {
                break;
            }
        }
    }
}