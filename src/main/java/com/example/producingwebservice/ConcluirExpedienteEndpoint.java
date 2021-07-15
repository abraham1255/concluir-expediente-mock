package com.example.producingwebservice;

import com.aforecoppel.registromovil.jaxb.ConcluirExpedienteContrato;
import com.aforecoppel.registromovil.jaxb.ConcluirExpedienteRespuesta;
import com.aforecoppel.registromovil.jaxb.ConcluirExpedienteSalida;
import com.aforecoppel.registromovil.jaxb.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import java.util.Date;

@Endpoint
public class ConcluirExpedienteEndpoint {
	private static final String NAMESPACE_URI = "http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/";

	private ConcluirExpedienteService concluirExpedienteService;

	@Value("${sleep.conclusion-expediente}")
	private int sleepConclusionExpediente;
	@Autowired
	public ConcluirExpedienteEndpoint(ConcluirExpedienteService concluirExpedienteService) {
		this.concluirExpedienteService = concluirExpedienteService;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "concluirExpedienteRequest")
	@ResponsePayload
	public JAXBElement<ConcluirExpedienteRespuesta> getConcluirExpedienteRespuesta(@RequestPayload JAXBElement<ConcluirExpedienteContrato> request) throws InterruptedException {
		System.out.println("+++++ LLEGA PETICION +++++++" +new Date());
		Thread.sleep(sleepConclusionExpediente);
		ObjectFactory factory = new ObjectFactory();
		ConcluirExpedienteRespuesta response = new ConcluirExpedienteRespuesta();
		ConcluirExpedienteSalida salida =  new ConcluirExpedienteSalida();
		salida.setResultadoOperacion("01");
		salida.setDiagnosticoRecepcion("020");
		salida.setEntidadOrigen("530");
		response.setObjetoRespuesta(salida);
		System.out.println("++++++++++ ES UN NUEVO CAMBIO ++++++++++" +new Date());
		return factory.createConcluirExpedienteResponse(response);
	}
}
