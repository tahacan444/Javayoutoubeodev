package Entites;

import java.util.Calendar;
import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
 
	private int id;
	private String FirstName;
	private String LastName;
	private int DateOfBirth;
	private long NationalyId;
	public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalyId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalyId = nationalyId;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public long getNationalyId() {
		return NationalyId;
	}
	public void setNationalyId(long nationalyId) {
		NationalyId = nationalyId;
	}

	
	
	
	
}
