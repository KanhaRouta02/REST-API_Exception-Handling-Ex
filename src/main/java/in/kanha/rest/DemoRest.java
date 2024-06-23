package in.kanha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {

	@GetMapping("/welcome")
	public String msg()
	{
		int i = 10 / 0;
		return "good morning";
	}
}
