package Java.day39_inheritance_review_access_modifiers;

public class vehicle {
	
	private String name;
	private int size;
	private int currentVelocity;
	private int currentDirection;
	
	/*
	public vehicle() {
		this("BMW",3,60,50);
	}
	*/
	
	public vehicle(String name,int size) {
		this.name=name;
		this.size=size;
		this.currentVelocity=0;
		this.currentDirection=0;
	}
	
	public vehicle(String name, int size, int currentVelocity, int currentDriection) {
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.currentDirection = currentDriection;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer():Steering at " + currentDirection + " degrees.");
	}
	
	public void move(int velocity,int direction) {
		this.currentDirection=direction;
		this.currentVelocity=velocity;
		System.out.println("Vehicle.moce():Moving at " + currentVelocity + " in direction " + currentDirection);
	}
	
	public void stop() {
		this.currentVelocity=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	

	
	

}
