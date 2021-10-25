package co.com.sofka.models;

import java.util.List;

public class Users {
	private List<User> albuns;

	public void setAlbuns(List<User> users){
		this.albuns = users;
	}

	public List<User> getData(){
		return albuns;
	}
}