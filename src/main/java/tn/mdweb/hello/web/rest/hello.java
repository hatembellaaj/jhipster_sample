package tn.mdweb.hello.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class hello {

	
	@GetMapping("/hello")
	public String gethello() {

		return "I said hello ...... :) " ;
	}	
	
	
}
