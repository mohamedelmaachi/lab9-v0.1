package cs425.studentsMgmt.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	@GetMapping(value= {"/","/home","/index"})
	public String studentHomePage() {
		return "home/index";
	}

}
