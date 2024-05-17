package code.microsystem.model;

public class Car {
	private int Id;
	private String CarName;
	private String Price;
	private String Varient;
	private String SteeringType;
	private String FuelType;
	private String DealerName;
	private String ManufacturingYear;
	public Car() {
		super();
	}
	public Car(int id, String carName, String price, String varient, String steeringType, String fuelType,
			String dealerName, String manufacturingYear) {
		super();
		Id = id;
		CarName = carName;
		Price = price;
		Varient = varient;
		SteeringType = steeringType;
		FuelType = fuelType;
		DealerName = dealerName;
		ManufacturingYear = manufacturingYear;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getVarient() {
		return Varient;
	}
	public void setVarient(String varient) {
		Varient = varient;
	}
	public String getSteeringType() {
		return SteeringType;
	}
	public void setSteeringType(String steeringType) {
		SteeringType = steeringType;
	}
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	public String getDealerName() {
		return DealerName;
	}
	public void setDealerName(String dealerName) {
		DealerName = dealerName;
	}
	public String getManufacturingYear() {
		return ManufacturingYear;
	}
	public void setManufacturingYear(String manufacturingYear) {
		ManufacturingYear = manufacturingYear;
	}
	
	

}
