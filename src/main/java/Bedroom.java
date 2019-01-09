import java.util.ArrayList;

public class Bedroom {

	private int roomNumber;
	private int capacity;
	private float nightlyRate;
	private String type;
	private ArrayList<Guest> guests;

	public Bedroom(int roomNumber, int capacity, float nightlyRate, String type) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.nightlyRate = nightlyRate;
		this.type = type;
		this.guests = new ArrayList<>();
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public float getNightlyRate() {
		return nightlyRate;
	}

	public String getType() {
		return type;
	}

	public ArrayList<Guest> getGuests() {
		return guests;
	}
}
