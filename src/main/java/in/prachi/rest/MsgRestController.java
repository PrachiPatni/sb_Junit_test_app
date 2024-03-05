package in.prachi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.prachi.service.MsgService;

@RestController
public class MsgRestController {

	@Autowired
	
	private MsgService service;
	@GetMapping("/welcome")
	public String welcomeMsg() {
		System.out.println(service.getClass().getName());//that variable is holding which class object we can print it
		String welcomeMsg = service.getWelcomeMsg();
		
		welcomeMsg = welcomeMsg.toUpperCase();
		
		return welcomeMsg;
	}
	@GetMapping("/greet")
	public String greetMsg() {
		System.out.println(service.getClass().getName());//that variable is holding which class object we can print it
		String greetMsg = service.getGreetMsg();
		
		greetMsg = greetMsg.toUpperCase();
		
		return greetMsg;
	
}
}
