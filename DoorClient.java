package com.fedex.door.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import com.fedex.door.dto.DoorDetails;

@Component
public class DoorClient {

	@Autowired
	private RestOperations restOperation;

	private final String url;

	@Autowired
	public DoorClient(@Value("${door.service.url}")final String url) {
		this.url = url;
	}

	public DoorDetails getDooorDetails(final int doorId) {

		return restOperation.getForObject(url, DoorDetails.class, doorId);

	}

}
