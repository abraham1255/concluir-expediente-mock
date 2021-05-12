
package com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Clase Java para IDSSN complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IDSSN"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idSistema"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="2147483647"/&amp;gt;
 *               &amp;lt;pattern value="(0|([1-9][0-9]*))"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="idEbusiness"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="2147483647"/&amp;gt;
 *               &amp;lt;pattern value="(0|([1-9][0-9]*))"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="idPortafolio"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="2147483647"/&amp;gt;
 *               &amp;lt;pattern value="(0|([1-9][0-9]*))"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="idServicio"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="2147483647"/&amp;gt;
 *               &amp;lt;pattern value="(0|([1-9][0-9]*))"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="idCliente"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="2147483647"/&amp;gt;
 *               &amp;lt;pattern value="(0|([1-9][0-9]*))"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="idCanal"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="2147483647"/&amp;gt;
 *               &amp;lt;pattern value="(0|([1-9][0-9]*))"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="codoperCliente"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="50"/&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;pattern value="[a-zA-Z0-9\|\-&#064;\.\\_]*"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDSSN", propOrder = {
    "idSistema",
    "idEbusiness",
    "idPortafolio",
    "idServicio",
    "idCliente",
    "idCanal",
    "codoperCliente",
    "fecha"
})
public class IDSSN {

    protected int idSistema;
    protected int idEbusiness;
    protected int idPortafolio;
    protected int idServicio;
    protected int idCliente;
    protected int idCanal;
    @XmlElement(required = true)
    protected String codoperCliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;

    /**
     * Obtiene el valor de la propiedad idSistema.
     * 
     */
    public int getIdSistema() {
        return idSistema;
    }

    /**
     * Define el valor de la propiedad idSistema.
     * 
     */
    public void setIdSistema(int value) {
        this.idSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad idEbusiness.
     * 
     */
    public int getIdEbusiness() {
        return idEbusiness;
    }

    /**
     * Define el valor de la propiedad idEbusiness.
     * 
     */
    public void setIdEbusiness(int value) {
        this.idEbusiness = value;
    }

    /**
     * Obtiene el valor de la propiedad idPortafolio.
     * 
     */
    public int getIdPortafolio() {
        return idPortafolio;
    }

    /**
     * Define el valor de la propiedad idPortafolio.
     * 
     */
    public void setIdPortafolio(int value) {
        this.idPortafolio = value;
    }

    /**
     * Obtiene el valor de la propiedad idServicio.
     * 
     */
    public int getIdServicio() {
        return idServicio;
    }

    /**
     * Define el valor de la propiedad idServicio.
     * 
     */
    public void setIdServicio(int value) {
        this.idServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idCanal.
     * 
     */
    public int getIdCanal() {
        return idCanal;
    }

    /**
     * Define el valor de la propiedad idCanal.
     * 
     */
    public void setIdCanal(int value) {
        this.idCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad codoperCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodoperCliente() {
        return codoperCliente;
    }

    /**
     * Define el valor de la propiedad codoperCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodoperCliente(String value) {
        this.codoperCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

}
