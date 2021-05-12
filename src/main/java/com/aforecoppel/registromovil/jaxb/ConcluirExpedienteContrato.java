
package com.aforecoppel.registromovil.jaxb;

import mx.com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar.IDSSN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para concluirExpedienteContrato complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="concluirExpedienteContrato"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idssn" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}IDSSN"/&amp;gt;
 *         &amp;lt;element name="cuerpo" type="{http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/}concluirExpedienteEntrada"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concluirExpedienteContrato", propOrder = {
    "idssn",
    "cuerpo"
})
public class ConcluirExpedienteContrato {

    @XmlElement(required = true)
    protected IDSSN idssn;
    @XmlElement(required = true)
    protected ConcluirExpedienteEntrada cuerpo;

    /**
     * Obtiene el valor de la propiedad idssn.
     * 
     * @return
     *     possible object is
     *     {@link IDSSN }
     *     
     */
    public IDSSN getIdssn() {
        return idssn;
    }

    /**
     * Define el valor de la propiedad idssn.
     * 
     * @param value
     *     allowed object is
     *     {@link IDSSN }
     *     
     */
    public void setIdssn(IDSSN value) {
        this.idssn = value;
    }

    /**
     * Obtiene el valor de la propiedad cuerpo.
     * 
     * @return
     *     possible object is
     *     {@link ConcluirExpedienteEntrada }
     *     
     */
    public ConcluirExpedienteEntrada getCuerpo() {
        return cuerpo;
    }

    /**
     * Define el valor de la propiedad cuerpo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcluirExpedienteEntrada }
     *     
     */
    public void setCuerpo(ConcluirExpedienteEntrada value) {
        this.cuerpo = value;
    }

}
