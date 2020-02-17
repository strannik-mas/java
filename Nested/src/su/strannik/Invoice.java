package su.strannik;

import java.util.*;

public class Invoice {
	private String contragent;
	private List<Line> lines = new ArrayList<Line>();
	
	public Invoice(String contragent) {
		super();
		this.contragent = contragent;
	}
	public String getContragent() {
		return contragent;
	}
	public void setContragent(String contragent) {
		this.contragent = contragent;
	}
	public double getTotal() {
		return total;
	}
	private double total;
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		

		sb.append(String.format("%-20s : %.2f\n", getContragent(), getTotal()));
		sb.append("============================================================\n");
		for(Line line : lines)
			sb.append(line.toString()).append('\n');
		
		return sb.toString();
	}
	
	
	public class Line {
		private String good;
		private int quantity;
		private  double price;
		private double summma;
		public Line(String good, int quantity, double price) {
			super();
			this.good = good;
			this.quantity = quantity;
			this.price = price;
			updateSumma(false);
			lines.add(this);
		}
		public String getGood() {
			return good;
		}
		public void setGood(String good) {
			this.good = good;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
			updateSumma(true);
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
			updateSumma(true);
		}
		public double getSummma() {
			return summma;
		}
		
		private void updateSumma(boolean update) {
			if (update) {
				total -= summma;
			}
			summma = price *  quantity;
			total += summma;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("%-20s : %4d %6.2f %7.2f", getGood(), getQuantity(), getPrice(), getSummma());
		}
	}
}
