package eu.ensup.demowebservice.service;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface IHelloObjis {
	@WebResult(partName = "reponse")
	public String ditBonjour(String name);
}
