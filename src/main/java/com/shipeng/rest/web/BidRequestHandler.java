package com.shipeng.rest.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/bid")
public class BidRequestHandler {
	
	private Boolean sameDeviceTargetingEnabled;
	
	public void init() {
	}
	
	@GET
	public Response printHello() {
		String result = "hello, shipeng, " + sameDeviceTargetingEnabled;
		return Response.status(200).entity(result).build();
	}
	
	// DI setter
	public void setSameDeviceTargetingEnabled(Boolean flag) {
		this.sameDeviceTargetingEnabled = flag;
	}
	
}
