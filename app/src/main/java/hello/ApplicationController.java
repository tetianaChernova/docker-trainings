package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/")
public class ApplicationController {
	
	@Value("${environment_name}")
	private String environmentName;
	
	@GetMapping
	public String home() {
		return "We are in " + environmentName + " environment";
	}
}
