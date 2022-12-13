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

            switch (command){
                case 1:
                    Admin admin = new Admin();
                    System.out.println("Введите пароль: ");
                    String adminPassword = sc.next();
                    if (Admin.getAdminPassword().equals(adminPassword)){
                        AdminMenu.main(admin);
                    }else {
                        System.out.println("Неправильный пароль!!!!");
                        break;
                    }
                case 2:
                    System.out.println("staff");
                    System.out.println("surName");
                    String surName = sc.next();
                    System.out.println("name");
                    String  name = sc.next();
                    System.out.println("age");
                    int age  = sc.nextInt();
                    System.out.println("password");
                    String password = sc.next();
                    Staff staff = new Staff(surName,name,age,Role.STAFF,password);
                    StaffMenu.main(staff);
                case 0:return;
            }
        }
    }
}