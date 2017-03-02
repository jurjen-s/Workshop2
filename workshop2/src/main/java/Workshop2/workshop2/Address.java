package Workshop2.workshop2;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table (name = "address_details")
public class Address {
		
	private int addressId;
	private String street;
	private String zip;
	private String city ;
	private String country;
	private int houseNumber;
	
	
	public Address(){
		this(0,null,null,null,null,0);
	}
	
	
	public Address(int addressId, String street, String zip, String city, String country, int houseNumber){
		this.addressId=addressId;
		this.street = street;
		this.zip = zip;
		this.city = city ;
		this.country = country;
		this.houseNumber = houseNumber;
	}
	
	public int getID(){return addressId;}
	public void setID(int addressId){this.addressId= addressId;}
	
	public String getStreet(){return street;}
	public void setStreet(String street){this.street = street;}
	
	public String getZip(){return zip;}
	public void setZip(String zip){this.zip = zip;}
	
	public String getCity(){return city;}
	public void setCity(String city){this.city = city;}
	
	public String getCountry(){return country;}
	public void setCountry(String country){this.country = country;}
	
	public int getHouseNumber(){return houseNumber;}
	public void setHouseNumber(int houseNumber){this.houseNumber = houseNumber;}
	
}
