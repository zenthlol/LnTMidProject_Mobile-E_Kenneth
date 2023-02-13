
public abstract class Data {
	
	
	public String type, brand, name, license, sType;
	Integer sAttribute;
	public Integer topSpeed, gasCapacity, wheel;

	public Data(String type, String brand, String name, String license, 
				Integer topSpeed, Integer gasCapacity, Integer wheel,
				String sType, Integer Attribute) {
		
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCapacity = gasCapacity;
		this.wheel = wheel;
		this.sType = sType;
		this.sAttribute = sAttribute;
	}
	

}
