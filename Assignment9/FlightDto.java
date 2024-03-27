package Assignment9;

class FlightDto {
	private static String airline = "boeing";
	private int flNo;
	private short seatingCapacity;
	private static byte flightTyre = 3;
	private static byte wings = 2;
	private String depatureTime;
	private String arraivalTime;
	private short numberOfPilot;

	public static String getAirline() {
		return airline;
	}

	public int getFlNo() {
		return flNo;
	}

	public void setFlNo(int flNo) {
		this.flNo = flNo;
	}

	public short getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(short seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public static byte getFlightTyre() {
		return flightTyre;
	}

	public static byte getWings() {
		return wings;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public String getArraivalTime() {
		return arraivalTime;
	}

	public void setArraivalTime(String arraivalTime) {
		this.arraivalTime = arraivalTime;
	}

	public short getNumberOfPilot() {
		return numberOfPilot;
	}

	public void setNumberOfPilot(short numberOfPilot) {
		this.numberOfPilot = numberOfPilot;
	}

	public void getDetails() {
		System.out.println("\nFlight Details :\n");
		System.out.println("Flight Airline is :" + getAirline() + "   " + "\nFlight Number is :" + getFlNo());
		System.out.println("\nFlight SeatingCapacity is :" + getSeatingCapacity() + "   "
				+ "\nFlight numberOf pilot is :" + getNumberOfPilot());
		System.out.println("\nFlight Flight tyre is :" + getFlightTyre() + "   " + "\nFlight wings is :" + getWings());
		System.out.println("\nFlight Depature Time is :" + getDepatureTime() + "   " + "\nFlight ArraivalTime is :"
				+ getArraivalTime());
	}
}
