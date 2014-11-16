public class CurrencyRunner {

	public static void main(String[] args) {
		Currency currency = new Currency();
		Coins coins = new Coins();
		Bills bills = new Bills();
		Penny penny = new Penny();
		Quarter quarter = new Quarter();
		OneDollarBill onedollarbill = new OneDollarBill();
		OneHundredDollarBill onehundreddollarbill = new OneHundredDollarBill();

		currency.weight();
		currency.size();

		coins.weight();
		coins.size();
		coins.flip();

		bills.weight();
		bills.size();
		bills.fold();

		penny.weight();
		penny.size();
		penny.flip();
		penny.diameter();
		penny.value();
		penny.canMake();

		quarter.weight();
		quarter.size();
		quarter.flip();
		quarter.diameter();
		quarter.value();
		quarter.makeChange();

		onedollarbill.weight();
		onedollarbill.size();
		onedollarbill.fold();
		onedollarbill.area();
		onedollarbill.value();
		onedollarbill.canMake();

		onehundreddollarbill.weight();
		onehundreddollarbill.size();
		onehundreddollarbill.fold();
		onehundreddollarbill.area();
		onehundreddollarbill.value();
		onehundreddollarbill.makeChange();

	}

}
