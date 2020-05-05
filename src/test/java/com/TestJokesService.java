package com;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestJokesService {
	
	@Test
	public void testMessage() {
		JokesService messageService = new JokesService();
		System.out.println("hello");
		Assertions.assertEquals(messageService.Joke1(), "Chuck Norris doesn’t read books. He stares them down until he gets the information he wants.");
	}
	
	@Test
	public void testWelcome() {
		JokesService ms = new JokesService();
		Assertions.assertEquals("Chuck Norris has a mug of nails instead of coffee in the morning.", ms.Joke2());
	}
	
}
