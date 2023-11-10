public class Main {
    public static void main(String[] args) {
        System.out.println("Первый вариант");
        int wallet = 100; // начальный счет
        int amount = 1001;// пополнение счета
        System.out.println("Пополнение: " + amount + " рублей");
        int bonus = amount / 100;
        if (amount < 1000) {
            bonus = 0;
        }
        System.out.println("Начислено бонусов: " + bonus);
        int amountwaller = wallet + amount + bonus;
        System.out.println("Кошелек: " + amountwaller);
    }
}
