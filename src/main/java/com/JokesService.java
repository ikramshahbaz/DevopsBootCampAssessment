package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokesService {
	
	@GetMapping("/ChuckNooris1")
	public String Joke1() {
		return "Chuck Norris doesn’t read books. He stares them down until he gets the information he wants.";
	}
	
	
	@GetMapping("/ChuckNooris2")
	public String Joke2() {
		return "Chuck Norris has a mug of nails instead of coffee in the morning.";
	}

}
