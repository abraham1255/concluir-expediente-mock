//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.12 a las 12:09:52 PM CDT 
//


package mx.com.procesar.admoncuenta.conclusionexpemovil.concluirexpediente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.procesar.admoncuenta.conclusionexpemovil.concluirexpediente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConcluirExpedienteRequest_QNAME = new QName("http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/", "concluirExpedienteRequest");
    private final static QName _ConcluirExpedienteResponse_QNAME = new QName("http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/", "concluirExpedienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.procesar.admoncuenta.conclusionexpemovil.concluirexpediente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConcluirExpedienteContrato }
     * 
     */
    public ConcluirExpedienteContrato createConcluirExpedienteContrato() {
        return new ConcluirExpedienteContrato();
    }

    /**
     * Create an instance of {@link ConcluirExpedienteRespuesta }
     * 
     */
    public ConcluirExpedienteRespuesta createConcluirExpedienteRespuesta() {
        return new ConcluirExpedienteRespuesta();
    }

    /**
     * Create an instance of {@link ConcluirExpedienteEntrada }
     * 
     */
    public ConcluirExpedienteEntrada createConcluirExpedienteEntrada() {
        return new ConcluirExpedienteEntrada();
    }

    /**
     * Create an instance of {@link ConcluirExpedienteSalida }
     * 
     */
    public ConcluirExpedienteSalida createConcluirExpedienteSalida() {
        return new ConcluirExpedienteSalida();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcluirExpedienteContrato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConcluirExpedienteContrato }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/", name = "concluirExpedienteRequest")
    public JAXBElement<ConcluirExpedienteContrato> createConcluirExpedienteRequest(ConcluirExpedienteContrato value) {
        return new JAXBElement<ConcluirExpedienteContrato>(_ConcluirExpedienteRequest_QNAME, ConcluirExpedienteContrato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcluirExpedienteRespuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConcluirExpedienteRespuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/", name = "concluirExpedienteResponse")
    public JAXBElement<ConcluirExpedienteRespuesta> createConcluirExpedienteResponse(ConcluirExpedienteRespuesta value) {
        return new JAXBElement<ConcluirExpedienteRespuesta>(_ConcluirExpedienteResponse_QNAME, ConcluirExpedienteRespuesta.class, null, value);
    }

}
