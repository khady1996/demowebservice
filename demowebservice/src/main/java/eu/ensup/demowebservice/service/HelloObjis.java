package eu.ensup.demowebservice.service;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "eu.ensup.demowebservice.service.IHelloObjis")
@HandlerChain(file = "LogMessageHandler.xml")
public class HelloObjis implements IHelloObjis {

	@Override
	public String ditBonjour(String name) {

		return "Hello, " + name + " !";
	}

}
