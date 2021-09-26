package server;
import javax.xml.ws.Endpoint;

import webservices.LivreService;

public class ServeurJaxWS {

	public static void main(String[] args) {
		String url = "http://localhost:8686/";
		Endpoint.publish(url, new LivreService());
		System.out.println("Web Service deployed : " + url);
	}
}
