package co.com.sofka.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class User {
	private int id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;

	@JsonProperty("address")
	private JsonNode address;
	@JsonProperty("company")
	private JsonNode company;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public JsonNode getAddress() {
		return address;
	}

	public void setAddress(JsonNode address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public JsonNode getCompany() {
		return company;
	}

	public void setCompany(JsonNode company) {
		this.company = company;
	}
}
