package clase2.ejemplo2;

import javax.xml.ws.Service;

public class Client {

	public static void main(String[] args) {

		Service service = new TimeServerImplService(); //Se instancia el serivico creado automaticamente
		TimeServer eif = service.getPort(TimeServer.class);// Se instancia el port con la interface Server creado automaticamente
		System.out.println(eif.getTimeServiceAsLong());
		System.out.println(eif.getTimeServiceAsString());
	}

}
