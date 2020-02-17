package su.strannik;

public class Program {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("strannik");
		BankAccount acc2 = new BankAccount("otshelnik", 1000.0);
		
		acc1.setSumma(1200.5);
		System.out.println(acc1);
		acc1.withdraw(2000.0);
		System.out.println(acc1);
		BankAccount.transfer(acc1, acc2, 500.0);
		System.out.println(acc1);
		System.out.println(acc2);

	}

}
