
package com.aforecoppel.registromovil.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para concluirExpedienteRespuesta complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="concluirExpedienteRespuesta"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="objetoRespuesta" type="{http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/}concluirExpedienteSalida"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
