package weekAssess.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Oct 21, 2021
 */
@Entity
public class House {
	@Id
	@GeneratedValue
	private long id;
	private String address;
	private String color;
	private int price;
	
	public House() {
		super();
	}
	
	public House(String address) {
		super();
		this.address = address;
	}
	
	public House(String address, String color, int price) {
		super();
		this.address = address;
		this.color = color;
		this.price = price;
	}
	
	public House(int id, String address, String color, int price) {
		super();
		this.id = id;
		this.address = address;
		this.color = color;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", address=" + address + ", color=" + color + ", price=" + price + "]";
	}

}
