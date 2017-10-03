package clase2.ejemplo2;

import javax.xml.ws.Service;

public class Client {

	public static void main(String[] args) {

		//Usando Interfaz Service - modo genérico
		Service service = new TimeServerImplService(); //Se instancia el serivico creado automaticamente
		TimeServer eif = service.getPort(TimeServer.class);// Se instancia el port con la interface Server creado automaticamente
		
		System.out.println(eif.getTimeServiceAsLong());
		System.out.println(eif.getTimeServiceAsString());
		
		
		//Usando implementación específica
		TimeServerImplService service2 = new TimeServerImplService();
		TimeServer eif2 = service2.getTimeServerImplPort();
		
		System.out.println(eif2.getTimeServiceAsLong());
		System.out.println(eif2.getTimeServiceAsString());
	
	}		
}
