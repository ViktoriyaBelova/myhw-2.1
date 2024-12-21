public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счет
        int deposit = 1100; // пополнение счета

        int bonus;
        System.out.printf("Ваш счет составляет: " + account + "руб.");
        System.out.println("Вы пополнили счет на: " + deposit + "руб.");

        if (deposit > 999) {
            bonus = deposit / 100;
        } else  {
            bonus = 0;
        }
        int balance = deposit + account + bonus;
        System.out.println("Итоговы счет:" + balance + "руб.");
        System.out.println("Ваш бонус:" + bonus + "руб.");

    }
}