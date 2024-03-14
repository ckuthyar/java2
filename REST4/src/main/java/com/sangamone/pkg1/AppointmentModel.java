package com.sangamone.pkg1;

public class AppointmentModel {
	private String name,location,email;
	AppointmentModel(String name, String location, String email){
		this.name=name;
		this.location=location;
		this.email=email;
	}
	public String[] getData(){
		String[] arr1=new String[3];
		arr1[0]=name;
		arr1[1]=location;
		arr1[2]=email;
		return arr1;
	}

}
