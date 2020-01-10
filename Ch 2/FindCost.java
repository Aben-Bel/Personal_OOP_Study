public class FindCost {
	public static void main(String[] args) {
		double price, tax;
		price = 500;
		tax = 17.5;
		price = price * (1 + tax/100);

		System.out.println("The Cost of a Product after a slaes tax has been added: " + price);
	}
}