
public class pizzaStrategy1 implements pizzaStrategy
{

	@Override
	public boolean order(Pizza p) {

		// Veggie pizza

		p.toppings.add("Mushrooms");
		p.toppings.add("Onions");
		p.toppings.add("Green Peppers");
		p.toppings.add("Black Olives");

		p.table.served.add(p);

		return true;
	}

}
