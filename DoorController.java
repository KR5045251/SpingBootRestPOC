package com.fedex.door.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fedex.door.dto.DoorDetails;

@RestController
@RequestMapping(DoorController.DOOR_BASE_URI)
public class DoorController {

	public static final String DOOR_BASE_URI = "svc/v1/doorDetails";

	@RequestMapping(value = "{doorID}")
	public DoorDetails getDooorDetails(@PathVariable final int doorId) {

		DoorDetails doordetails = new DoorDetails();

		doordetails.setOpcoType("FXD");
		doordetails.setLocationId(153);
		doordetails.setDoorType("LOAD");

		return doordetails;

	}

}
