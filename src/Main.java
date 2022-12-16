import admin.Admin;
import admin.AdminMenu;
import member.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        NewMember newMember1 = new NewMember("Sasha","1234");
        newMember1.setType("Книги");
        NewMember newMember2 = new NewMember("Masha","1234");
        newMember2.setType("Игрушки");
        NewMember newMember3 = new NewMember("Dasha","1234");
        newMember3.setType("Машина");
        NewMember newMember4 = new NewMember("Gena","1234");
        newMember3.setType("Машина");

        UserInformationDaoImpl.newMemberList.add(newMember1);
        UserInformationDaoImpl.newMemberList.add(newMember2);
        UserInformationDaoImpl.newMemberList.add(newMember3);
        UserInformationDaoImpl.newMemberList.add(newMember4);


        while (true){
            System.out.println("""
                    
                    ДОБРО ПОЖАЛОВАТЬ В МЕНЮ ИГРЫ "ТАЙНЫЙ САНТА"
                    –––––––––––––––––––––––––––––––––––––––––––
                    Пожалуйста, выберите действие:
                    1) Войти как Админ
                    2) Войти как Участник игры
                    3) Регистрация нового участника игры
                    0) Выйти из меню""");
            int command = sc.nextInt();
            if (command == 1) {
                Admin admin = new Admin();
                System.out.println("Введите пароль: ");
                String adminPassword = sc.next();
                if (Admin.getAdminPassword().equals(adminPassword)){
                    AdminMenu.main(admin);
                }else {
                    System.out.println("Неверный пароль");
                    break;
                }
            }else if (command == 2) {
                System.out.println("Добро пожаловать в окно авторизации!");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите ваш ник: ");
                String name = scanner.next();
                System.out.println("Введите ваш пароль: ");
                String password = scanner.next();
                if (UserInformationDaoImpl.newMemberList.isEmpty()){
                    System.out.println("пусто");
                }
                for (int i = 0; i < UserInformationDaoImpl.newMemberList.size(); i++) {
                    if (UserInformationDaoImpl.newMemberList.get(i).getName().equals(name)
                            && UserInformationDaoImpl.newMemberList.get(i).getPassword().equals(password) ){
                        System.out.println("Добро пожаловать, " + name + "!");
                        MemberMenu.main(new Member());
                        break;
                    }
                }
            } else if (command == 3) {
                RegistrationMenu.main(new NewMember());
            }else if (command == 0) {
                break;
            }else{
                System.out.println("Выберите номер из меню!!!!!");
                break;
            }
        }
    }
}