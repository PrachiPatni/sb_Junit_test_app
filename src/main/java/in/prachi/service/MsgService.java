package in.prachi.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		String msg= "Hello Prachi Patni";
		return msg;
	}
	public String getGreetMsg() {
		String msg="Good Evening!!!";
		return msg;
	}
}
