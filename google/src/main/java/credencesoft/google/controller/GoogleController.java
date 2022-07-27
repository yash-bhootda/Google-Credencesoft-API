package credencesoft.google.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import credencesoft.google.dto.ARITransaction;
import credencesoft.google.service.ARIService;

@RestController
public class GoogleController {
	
	@Autowired
	ARIService AriService;
	
	@GetMapping(path = "/users")
	public String Hello() {
		return "Hello world";
	}
	
	@RequestMapping(value = "/travel/hotels/uploads/property_data", method = RequestMethod.POST, consumes = { "application/xml"})
	public ResponseEntity<?> updateARI(@RequestBody ARITransaction AriTransaction) {
		this.AriService.updateARI(AriTransaction);
		return new ResponseEntity<>(HttpStatus.OK);
}
}
