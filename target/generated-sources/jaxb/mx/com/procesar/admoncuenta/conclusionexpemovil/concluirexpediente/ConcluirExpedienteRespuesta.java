//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.12 a las 12:09:52 PM CDT 
//


package mx.com.procesar.admoncuenta.conclusionexpemovil.concluirexpediente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para concluirExpedienteRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="concluirExpedienteRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objetoRespuesta" type="{http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/}concluirExpedienteSalida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concluirExpedienteRespuesta", propOrder = {
    "objetoRespuesta"
})
public class ConcluirExpedienteRespuesta {

    @XmlElement(required = true)
    protected ConcluirExpedienteSalida objetoRespuesta;

    /**
     * Obtiene el valor de la propiedad objetoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link ConcluirExpedienteSalida }
     *     
     */
    public ConcluirExpedienteSalida getObjetoRespuesta() {
        return objetoRespuesta;
    }

    /**
     * Define el valor de la propiedad objetoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcluirExpedienteSalida }
     *     
     */
    public void setObjetoRespuesta(ConcluirExpedienteSalida value) {
        this.objetoRespuesta = value;
    }

}
