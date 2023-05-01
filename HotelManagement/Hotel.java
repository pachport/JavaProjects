package HotelManagement;

import java.util.List;

public class Hotel {

	private int idHotel;
	private String name;
	private String country;
	private String city;
	private String address;
	private String phone;
	private List<Room> rooms;
	private List<ParkingLot> parkinglots;
	private List<SwimmingPool> swimmingpools;
	private List<ConferenceRoom> conferencesrooms;
	// private List<Restaurant> restaurants;

	public Hotel() {
		
	}
	public Hotel(int idHotel, String name, String country, String city, String address, String phone, List<Room> rooms, List<ParkingLot> parkinglots, List<SwimmingPool> swimmingpools, List<ConferenceRoom> conferencesrooms) {
		this.idHotel = idHotel;
		this.name = name;
		this.country = country;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.rooms = rooms;
		this.parkinglots = parkinglots;
		this.swimmingpools = swimmingpools;
		this.conferencesrooms = conferencesrooms;
	}
	public int getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void addRoom(Room room) {
		this.rooms.add(room);
	}
	
	public List<ParkingLot> getParkinglots() {
		return parkinglots;
	}
	public void setParkinglots(List<ParkingLot> parkinglots) {
		this.parkinglots = parkinglots;
	}
	public List<SwimmingPool> getSwimmingpools() {
		return swimmingpools;
	}
	public void setSwimmingpools(List<SwimmingPool> swimmingpools) {
		this.swimmingpools = swimmingpools;
	}
	public List<ConferenceRoom> getConferencesrooms() {
		return conferencesrooms;
	}
	public void setConferencesrooms(List<ConferenceRoom> conferencesrooms) {
		this.conferencesrooms = conferencesrooms;
	}
	
	
	
}
