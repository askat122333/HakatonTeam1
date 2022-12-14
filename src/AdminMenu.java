import java.util.Scanner;

public class AdminMenu {
    public static void main(Admin admin){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Это меню админа , здесь можно добавить инструкции к игре и ее правилам\n" +
                   "Выберите номер из меню :\n"+
                   "1) Добавить инструкции\n" +
                   "2) Указать максимальную стоимость\n"+
                   "3) Указать дату окончания\n"+
                   "4) Распределить игроков\n"+
                   "5) Показать инструкции\n"+
                   "6) Показать максимальную стоимость\n"+
                   "7) Показать дату окончания\n"+
                   "0) выйти");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    Data.addInstruction();
                    break;
                case 2:
                    Admin.setMaxCost();
                    break;
                case 3:
                    Admin.setEndDate();
                    break;
                case 4:
                    Admin.randomize();
                    break;
                case 5:
                    Data.getInstruction();
                    break;
                case 6:
                    Admin.getMaxCost();
                    break;
                case 7:
                    Admin.getEndDate();
                    break;
            }
            if (command == 0 ){
                break;
            }
        }
    }
}
