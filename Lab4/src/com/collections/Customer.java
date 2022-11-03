package com.collections;

import java.util.Objects;

//public class Customer implements Comparable<Customer>{
 
public class Customer {
	public int id;
	public String first_name;
	public String last_name;
	public String email;
	public String dob;
	public String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", dob=" + dob + ", gender=" + gender + "]";
	}
	public Customer(int id, String first_name, String last_name, String email, String dob, String gender) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, email, first_name, gender, id, last_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(last_name, other.last_name);
	}
	
	
	
	
//	@Override
//	public int compareTo(Customer o) {
//		return o.getFirst_name().compareTo(this.getFirst_name());
//	}
//	
	

}
