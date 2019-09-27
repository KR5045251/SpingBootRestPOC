package com.fedex.door.dto;

public class DoorDetails {

	private int doorId;
	
	private int locationId;
	private String opcoType;
	private String doorType;
	public int getDoorId() {
		return doorId;
	}
	public void setDoorId(int doorId) {
		this.doorId = doorId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getOpcoType() {
		return opcoType;
	}
	public void setOpcoType(String opcoType) {
		this.opcoType = opcoType;
	}
	public String getDoorType() {
		return doorType;
	}
	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}
	
	
	
	
}
