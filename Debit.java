public class Debit implements PaymentStrategy{
    public int pay(Pizza p, int m){
        if (p.cost <= m){
            System.out.println("Pizza successfully ordered! Your balance is: $"+ (m-p.cost));
        } else {
            System.out.println("You do not have enough money to pay for this pizza as you cannot go negative on \n" +
                    "a debit card. Hence, your order declined. Your Total Balance is: $"+m);
        }
        return m - p.cost;
    }
}
