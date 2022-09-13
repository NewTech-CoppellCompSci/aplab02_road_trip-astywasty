package lab;

public class RoadTripLog {
	
	private String tripName;
	private double distance;
	private double fuel;
	
	public RoadTripLog(String t) {
		tripName = t;
		distance = 0;
		fuel = 0;
	}
	
	public void addDistance (double newDistance) {
		distance += newDistance;
	}
	
	public void addFuel (double newFuel) {
		fuel += newFuel;
	}
	
	public double getTotalDistance() {
		return distance;
	}
	
	public double getTotalFuel() {
		return fuel;
	}
	
	public String getMPG() {

		return String.format("%.1f", distance / fuel);
	}
	
	public String toString() {
		return "Trip: " + tripName +
		        "\nDistance:  " + distance +
		        "\nFuel Used: " + fuel +
		        "\nMPG:       " + getMPG();
	}
}
