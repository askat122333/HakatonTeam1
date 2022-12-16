package member;

import java.util.Scanner;


public class RegistrationMenu {
    public static void main(NewMember newMember) {


        UserInformationDao uid = new UserInformationDaoImpl();
        System.out.println("Добро пожаловать в окно регистрации!");

        Scanner in = new Scanner(System.in);


        System.out.println("Введите ваш ник: ");
        String name = in.next();
        System.out.println("Введите ваш пароль: ");
        String password = in.next();
        NewMember newMember1 = new NewMember(name, password);


        uid.regist(newMember1);

        uid.makeANote("listOfMembers.txt");
        System.out.println("Регистрация прошла успешно!");
        System.out.println("––––––––––––––––––––––––––––");
        System.out.println("АНКЕТА");
        System.out.println("––––––––––––––––––––––––––––");
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
            switch (number) {
                case "1":
                    String type1 = "Teхника";
                    newMember1.setType(type1);
                    System.out.println("Вы выбрали технику");
                    uid.makeANote("listOfMembers.txt");

                    break;
                case "2":
                    String type2 = "Запоминающиеся";
                    newMember1.setType(type2);
                    System.out.println("Вы выбрали запоминающиеся подарки");
                    uid.makeANote("listOfMembers.txt");
                    break;
                case "3":
                    String type3 = "Книги";
                    newMember1.setType(type3);
                    System.out.println("Вы выбрали книги");
                    uid.makeANote("listOfMembers.txt");
                    break;
                case "4":
                    String type4 = "Цветы";
                    newMember1.setType(type4);
                    System.out.println("Вы выбрали цветы");
                    uid.makeANote("listOfMembers.txt");

                    break;
                case "5":
                    String type5 = "Еда";
                    newMember1.setType(type5);
                    System.out.println("Вы выбрали вкусную еду");
                    uid.makeANote("listOfMembers.txt");
                    break;
                case "6":
                    String type6 = "Игрушки";
                    newMember1.setType(type6);
                    System.out.println("Вы выбрали игрушки");
                    uid.makeANote("listOfMembers.txt");
                    break;

            }
        } else if (command == 2) {
            newMember1.setType("сюрпроиз");
            System.out.println("Круто!");
        }


    }

}