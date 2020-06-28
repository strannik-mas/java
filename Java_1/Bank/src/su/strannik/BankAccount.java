package su.strannik;

public class BankAccount {
	private String owner;
	private Double summa;
	
	public BankAccount (String ow) {
		owner = ow;
	}
	
	public BankAccount (String ow, Double sum) {
		owner = ow;
		summa = sum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Double getSumma() {
		return summa;
	}

	public void setSumma(Double summa) {
		this.summa = summa;
	}
	
	public void deposite(Double sum) {
		summa += sum;
	}
	
	public boolean withdraw(Double sum) {
		if (summa > sum) {
			summa -= sum;
			return true;
		}
		return false;	
	}
	
	public static boolean transfer(BankAccount sourceAccount, BankAccount targetAccount, Double sum) {
		if (sourceAccount.withdraw(sum)) {
			targetAccount.deposite(sum);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("BankAccount (owner: %s, summa: %g)\n", owner, summa);
	}
}
