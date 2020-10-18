package orcalookup.java.controllers;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LookupController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public HashMap<String, Object> Lookup(String barcode) {

		// TODO: query a database or API to retrieve some data based on barcode value

		// return data as JSON object (property names must match Orca column names)
		HashMap<String, Object> data = new HashMap<>();
		data.put("VIN", barcode);
		data.put("Make", "SUBARU");
		data.put("Model", "Legacy");
		data.put("Manufacturer Name", "FUJI HEAVY INDUSTRIES U.S.A");
		data.put("Vehicle Type", "PASSENGER CAR");
		data.put("Year", 1992);

    	return data;
	}
}