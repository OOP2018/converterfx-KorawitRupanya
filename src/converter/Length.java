package converter;

public enum Length {

	Mile(1609.344),
	Kiometer(1000.0),
	Centimeter(0.0100),
	Foot(0.30480),
	Wa(2.00000),
	AU(149597870700L),
	Meter(1.0);
	
	private final double value;
	
	private Length(double value) { this.value = value;}
		
	public double getValue() {return this.value;}
}