package com.mindtree.actors;

class Actor {
	
	int actorId,movieCount,age;
	String name,gender;
	
	
	
	
	public Actor() {
		super();
	}
	public Actor(int actorId, int movieCount, int age, String name, String gender) {
		super();
		this.actorId = actorId;
		this.movieCount = movieCount;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public int getMovieCount() {
		return movieCount;
	}
	public void setMovieCount(int movieCount) {
		this.movieCount = movieCount;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Actor Details [actorId=" + actorId + ", movieCount=" + movieCount + ", age=" + age + ", name=" + name
				+ ", gender=" + gender + "]";
	}
	
	

}
