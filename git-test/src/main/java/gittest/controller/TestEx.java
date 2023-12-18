package gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestEx {
	


	@GetMapping("/hello")
	public String msg()
	{
		return "wel come to git";
	}

}
