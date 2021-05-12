
package com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Clase Java para SSNROP complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SSNROP"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="codoper" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="codRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="codRespuestaOpr" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="descRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="motivos" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}ArrayOfMotivos" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="codoperCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="tiempoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
@XmlType(name = "SSNROP", propOrder = {
    "codoper",
    "codRespuesta",
    "codRespuestaOpr",
    "descRespuesta",
    "motivos",
    "codoperCliente",
    "tiempoRespuesta",
    "fecha"
})
public class SSNROP {

    @XmlElement(required = true)
    protected String codoper;
    @XmlElement(required = true)
    protected String codRespuesta;
    @XmlElement(required = true)
    protected String codRespuestaOpr;
    @XmlElement(required = true)
    protected String descRespuesta;
    protected ArrayOfMotivos motivos;
    @XmlElement(required = true)
    protected String codoperCliente;
    @XmlElement(required = true)
    protected String tiempoRespuesta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;

    /**
     * Obtiene el valor de la propiedad codoper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodoper() {
        return codoper;
    }

    /**
     * Define el valor de la propiedad codoper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodoper(String value) {
        this.codoper = value;
    }

    /**
     * Obtiene el valor de la propiedad codRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRespuesta() {
        return codRespuesta;
    }

    /**
     * Define el valor de la propiedad codRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRespuesta(String value) {
        this.codRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad codRespuestaOpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRespuestaOpr() {
        return codRespuestaOpr;
    }

    /**
     * Define el valor de la propiedad codRespuestaOpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRespuestaOpr(String value) {
        this.codRespuestaOpr = value;
    }

    /**
     * Obtiene el valor de la propiedad descRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRespuesta() {
        return descRespuesta;
    }

    /**
     * Define el valor de la propiedad descRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRespuesta(String value) {
        this.descRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad motivos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMotivos }
     *     
     */
    public ArrayOfMotivos getMotivos() {
        return motivos;
    }

    /**
     * Define el valor de la propiedad motivos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMotivos }
     *     
     */
    public void setMotivos(ArrayOfMotivos value) {
        this.motivos = value;
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
     * Obtiene el valor de la propiedad tiempoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    /**
     * Define el valor de la propiedad tiempoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoRespuesta(String value) {
        this.tiempoRespuesta = value;
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
