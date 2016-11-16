
public class UsedCar extends Car {
	private int mile;

	public UsedCar(String make, String model, int year, double price, int mile) {
		super(make, model, year, price);
		this.mile = mile;
	}

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}

	
}
