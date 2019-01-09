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

	public boolean isOccupied() {
		return this.guests.size() > 0;
	}

	public int addGuestsToRoom(ArrayList<Guest> guestList) {
		int added = 0;
		if (guestList.size()<=this.capacity && !isOccupied()) {
			for (Guest guest : guestList) {
				this.guests.add(guest);
				added += 1;
			}
		}
		return added;
	}

	public ArrayList<Guest> removeGuestsFromRoom() {
		ArrayList<Guest> leavingGuests = new ArrayList<>(this.guests);
		this.guests.clear();
		return leavingGuests;
	}
}
