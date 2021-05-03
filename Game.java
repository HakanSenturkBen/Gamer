
public class Game {
	private int id;
	private String name;
	private int unitPrice;
	private double discountRate;
	private double netPrice;
	
	public Game() {
		
	}
	public Game(int id, String name, int unitPrice, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getNetPrice() {
		return this.unitPrice-(this.unitPrice*this.discountRate/100);
	}
	
	@Override
	public String toString() {
		return " " + name +" Oyunu " + this.getNetPrice()+"TL fiyatla" ;
	}
	

}
