package in.kanha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.kanha.exception.UserNotFoundException;

@RestController
public class UserRest {

	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId") Integer userId) throws Exception
	{
		if(userId == 100)
		{
			return "kanha";
		}else if(userId == 200 )
		{
			return "satya";
		}
		else throw new UserNotFoundException("User not found");
	}
}
