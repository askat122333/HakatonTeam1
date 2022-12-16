package admin;

import member.NewMember;
import member.UserInformationDaoImpl;

import java.time.LocalDateTime;
import java.util.*;

public class Admin extends AbstractStaff {
    private static String login = "Admin1122";
    private static String adminPassword = "123";
    private static LocalDateTime date;
    private static int maxCost;

    public Admin(String surName, String name, int age, Role role) {
        super(surName, name, age, role);
    }

    public static String getLogin() {
        return login;
    }

    public static String getAdminPassword() {
        return adminPassword;
    }

    public Admin() {
    }


    public static String addInstructions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавьте инструкции:");
        String text = scanner.nextLine();
        return text;
    }

    public static void setEndDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите год:");
        int year = scanner.nextInt();
        System.out.println("Выберите месяц:");
        int month = scanner.nextInt();
        System.out.println("Выберите день:");
        int day = scanner.nextInt();
        System.out.println("Выберите время (час):");
        int time = scanner.nextInt();
        System.out.println("Выберите время (минут):");
        int minute = scanner.nextInt();
        date = LocalDateTime.of(year, month,day, time,minute);
    }

    public static void getEndDate() {
        System.out.println(date);
    }

    public static void setMaxCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Установите максимальную стоимость подарка: ");
        int count = scanner.nextInt();
        maxCost = count;
    }

    public static void getMaxCost() {
        System.out.println(maxCost);
    }

    public static void randomize() {
        var memberList = UserInformationDaoImpl.newMemberList;

        List<String> employeesNames = new ArrayList<>();
        for (NewMember newMember : memberList) {
            employeesNames.add(newMember.getName());
        }

        List<String> santaList = new ArrayList<>();
        Map<String, String> names = new HashMap<>();
        for (int i = 0; i < employeesNames.size(); ++i) {
            santaList.add((employeesNames.get(i)));
        }

        List<String> guests = new ArrayList<>(santaList);
        Collections.shuffle(guests);

        for (int i = 0; i < santaList.size(); i++) {
            if (santaList.get(i) == guests.get(i)) {
                if (i + 1 < santaList.size()) {
                    String receiver = guests.get(i + 1);
                    guests.set(i + 1, guests.get(i));
                    guests.set(i, receiver);
                } else {
                    String receiver = guests.get(1);
                    guests.set(1, guests.get(i));
                    guests.set(i, receiver);
                }
            }
        }
        for (int j = 0; j < santaList.size(); j++)
            names.put(santaList.get(j), guests.get(j));
        for (Map.Entry<String, String> item : names.entrySet()) {
            System.out.println(item.getKey() + " дарит подарок -> " + item.getValue());
            System.out.println();
            Data.setMembers(names);
        }
    }
}

