public class Main {
    public static void main(String[] args) {

        int x = 379; // На счету у клиента
        int r = 2430; // Сумма пополнения

        int percent;
        if (r >= 1000) {
            percent = r/100;
        } else {
            percent = 0;
        }
        System.out.println((x) + " Рубля/ей - изначально на счету");
        System.out.println((r) + " Рубля/ей - сумма пополнения");
        System.out.println((percent) + " Бонуса/ов начисленно");
        int balance = x + r + percent;
        System.out.println((balance) + " Рубля/ей - итого на счету");
    }
}