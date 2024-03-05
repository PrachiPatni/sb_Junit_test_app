package in.prachi.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.GetMapping;

import in.prachi.service.MsgService;

@WebMvcTest(controllers=MsgRestController.class)
public class MsgRestControllerTest {

	@MockBean
	private MsgService service;
	@Autowired
	private  MockMvc mockMvc;
	@Test
	public void testGreetMsg() throws Exception {
		when(service.getGreetMsg()).thenReturn("Dummy text");
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(req).andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		assertEquals(200,status);
	}
		
		@GetMapping("/welcome")
		public String welcomeMsg() {
			System.out.println(service.getClass().getName());//that variable is holding which class object we can print it
			String welcomeMsg = service.getWelcomeMsg();
			
			welcomeMsg = welcomeMsg.toUpperCase();
			
			return welcomeMsg;
	}
	@Test
	public void testWelcomeMsg() throws Exception {
		//define mock object behavior
		when(service.getWelcomeMsg()).thenReturn("Dummy data...");
		//
		
		
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/welcome");
		MvcResult result = mockMvc.perform(req).andReturn();//send request 
		MockHttpServletResponse response = result.getResponse(); //get response
		int status = response.getStatus();
		assertEquals(200,status);
		
		                    
	}
}
