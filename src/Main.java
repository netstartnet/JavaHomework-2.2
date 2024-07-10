public class Main {
    public static void main(String[] args) {
        int customersBalance = 77;
        int bonusScale = 100;
        int refillAmount = 2326;
        int bonus;

        if (refillAmount >= 1000){
            bonus = refillAmount / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount = customersBalance + refillAmount + bonus;

        //System.out.println("Вы пополнили счёт на - " + refillAmount + " руб." + " Ваш бонус составил - " + bonus + " руб." + " Ваш баланс: " + totalAccount + " руб.");
    }
}