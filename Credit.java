public class Credit implements PaymentStrategy{
    public int pay(Pizza p, int m){
        if (p.cost <= m){
            System.out.println("Pizza successfully ordered! Your balance is: $"+ (m-p.cost));
        } else {
            System.out.println("Pizza successfully ordered! Please keep in mind that you owe more money than \n" +
                    "how much you have in the bank. You have a balance of: $"+ (m-p.cost));
        }
        return m - p.cost;
    }
}
