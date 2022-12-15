import java.util.Scanner;

public class AdminMenu {
    public static void main(Admin admin){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                           МЕНЮ АДМИНА
                    ––––––––––––––––––––––––––
                    Пожалуйста, выберите действие:
                    1) Добавить инструкции
                    2) Указать максимальную стоимость
                    3) Указать дату окончания
                    4) Распределить игроков
                    5) Показать инструкции
                    6) Показать максимальную стоимость
                    7) Показать дату окончания
                    0) Выйти""");
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
