package eu.ensup.demowebservice.presentation;

import javax.xml.ws.Endpoint;

import eu.ensup.demowebservice.service.HelloObjis;

/**
 * Hello world!
 *
 */
public class HelloObjisPublisher {
//	Pour les tests Clients :
//	public static final String uri = "http://192.168.43.183:8888/hello";
	public static final String uri = "http://localhost:8888/hello";

	public static void main(String[] args) {
		// pour creer une interface de l'implémentation

		HelloObjis implementor = new HelloObjis();

		// pour rendre disponible l'instance
		Endpoint endpoint = Endpoint.publish(HelloObjisPublisher.uri, implementor);

		// pour tester la disponibilité du endpoint

		boolean status = endpoint.isPublished();
		System.out.println("Web Service disponible ? : " + status);
	}
}
