package HotelManagement;

public class Guest extends Client{
	
	private String cardNumber;
	private Room room;
	
	public Guest() {
		super();
	}

	public Guest(int idClient, String firstName, String lastName, String email, String phone, String cardNumber,Room room) {
		super(idClient, firstName, lastName, email, phone);
		this.cardNumber = cardNumber;
		this.room = room;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	

}
