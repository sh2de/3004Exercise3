public class Debit implements PaymentStrategy{
    public int pay(Pizza p, int m){
        return m - p.cost;
    }
}
