public class Main {
    public static void main(String[] args) {

        int balance = 379; // На счету у клиента
        int refill = 2430; // Сумма пополнения

        int percent;
        if (refill >= 1000) {
            percent = refill / 100;
        } else {
            percent = 0;
        }
        System.out.println((balance) + " Рубля/ей - изначально на счету");
        System.out.println((refill) + " Рубля/ей - сумма пополнения");
        System.out.println((percent) + " Бонуса/ов начисленно");
        int total = balance + refill + percent;
        System.out.println((total) + " Рубля/ей - итого на счету");
    }
}