package com.mindtree.ApplicationSoftware;

class Software {

	int id; float cost; String name,licenseNumber;
	
	


	public Software() {
		super();
	}


	public Software(int id, float cost, String name, String licenseNumber) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.licenseNumber = licenseNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLicenseNumber() {
		return licenseNumber;
	}


	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}


	@Override
	public String toString() {
		return "Software Details [id=" + id + ", cost=" + cost + ", name=" + name + ", licenseNumber=" + licenseNumber + "]";
	}
	
	
	
	
}
