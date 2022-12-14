package employee;

import java.util.Scanner;


public class EmployeeMenu {
    public static void main(Employee employee) {


            UserInformationDao uid = new UserInformationDaoImpl();
            System.out.println("Добро пожаловать в окно регистрации!");

            Scanner in = new Scanner(System.in);


            System.out.println("Введите ваш ник: ");
            String name = in.next();
            System.out.println("Введите ваш пароль: ");
            String password = in.next();
            Employee employee1 = new Employee(name, password);


            uid.regist(employee1);

            uid.makeANote("C:\\java\\loh\\text.txt");
            System.out.println("Регистрация прошла успешно!");
            System.out.println("_______________________");
            System.out.println("АНКЕТА");
            System.out.println("_______________________");
            System.out.println("Ваш Санта хочет узнать категорию вашего желаемого подарка! Желаете выбрать категорию? :)");
            System.out.println("1) Да, я хочу выбрать категорию подарка");
            System.out.println("2) Нет, я хочу получить сюрприз");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Санта хочет узнать вашу категорию товаров");
                System.out.println("1) Техника");
                System.out.println("2) Запоминающиеся");
                System.out.println("3) Книги");
                System.out.println("4) Цветы");
                System.out.println("5) Еда");
                System.out.println("6) Игрушки");
                String number = in.next();
                switch (number){
                    case "1":
                        String type1 = "Teхника";
                        employee1.setType(type1);
                        System.out.println("Вы выбрали технику");
                        uid.makeANote("C:\\Users\\User\\IdeaProjects\\loh\\text.txt");

                        break;
                    case "2":
                        String type2 = "Запоминающиеся";
                        employee1.setType(type2);
                        System.out.println("Вы выбрали запоминающиеся подарки");
                        uid.makeANote("C:\\Users\\User\\IdeaProjects\\loh\\text.txt");
                        break;
                    case "3":
                        String type3 = "Книги";
                        employee1.setType(type3);
                        System.out.println("Вы выбрали книги");
                        uid.makeANote("C:\\Users\\User\\IdeaProjects\\loh\\text.txt");
                        break;
                    case "4":
                        String type4 = "Цветы";
                        employee1.setType(type4);
                        System.out.println("Вы выбрали цветы");
                        uid.makeANote("C:\\Users\\User\\IdeaProjects\\loh\\text.txt");
                        break;
                    case "5":
                        String type5 = "Еда";
                        employee1.setType(type5);
                        System.out.println("Вы выбрали вкусную еду");
                        uid.makeANote("C:\\Users\\User\\IdeaProjects\\loh\\text.txt");
                        break;
                    case "6":
                        String type6 = "Игрушки";
                        employee1.setType(type6);
                        System.out.println("Вы выбрали игрушки");
                        uid.makeANote("C:\\java\\loh\\text.txt");
                        break;

                }
            } else if (command == 2) {
                System.out.println("Круто!");
            }


        }

}