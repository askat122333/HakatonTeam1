import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (true){
            System.out.println("Меню для игры в тайного санту\n"+
                    "1) Войти в как Админ\n"+
                    "2) Войти как участник\n"+
                    "0) Выйти");
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

            } else if (command == 0) {
                break;
            }
        }
    }
}