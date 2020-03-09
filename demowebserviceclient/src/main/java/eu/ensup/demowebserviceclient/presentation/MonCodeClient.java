package eu.ensup.demowebserviceclient.presentation;

import client.HelloObjisService;
import client.IHelloObjis;

/**
 * Hello world!
 *
 */
public class MonCodeClient {
	public static void main(String[] args) {

		// 1. instanciation du service (généré par wsimport)
		HelloObjisService monservice = new HelloObjisService();

		// 2. récupération du client (généré par wsimport)
		IHelloObjis port = monservice.getHelloObjisPort();

		// 3. appel d'une opération du service
		String resultat = port.ditBonjour("Objis");

		System.out.println(resultat);
	}
}
