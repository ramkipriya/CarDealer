
public class Car {
private String make;
private String model;
private int year;
private double price;

public Car(String make,String model,int year,double price)
{ super();
	this.make=make;
	this.model=model;
	this.year=year;
	this.price=price;
	}

public String getMake() {
	return make;
}

public void setMake(String make) {
	make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	model = model;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	year = year;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	price = price;
}



}