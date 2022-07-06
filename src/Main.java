public class Main {

    public static void main(String[] args) {

        int balance = 100; // баланс клиента
        int payment = 1100; // пополнение счета
        int rublesPerBonus = 100; // 1 бонусный рубль за 100р пополнения
        int bonus; // полученные бонусы при платеже свыше 1000р
        if (payment > 1000) {
            bonus = payment / rublesPerBonus;
        } else {
            bonus = 0;
        }
        int result = balance + payment + bonus; // итоговый счет

        System.out.printf(bonus + "р бонусов");
        System.out.printf(result + "р итоговый счет");




    }
}
