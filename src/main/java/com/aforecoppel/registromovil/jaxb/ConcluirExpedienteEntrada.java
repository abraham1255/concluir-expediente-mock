
package com.aforecoppel.registromovil.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * &lt;p&gt;Clase Java para concluirExpedienteEntrada complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="concluirExpedienteEntrada"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="cveAfore" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}cveAfore"/&amp;gt;
 *         &amp;lt;element name="idNegocio" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}nss" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="curp" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}curp"/&amp;gt;
 *         &amp;lt;element name="apellidoPaterno" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_40" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="apellidoMaterno" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_40" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nombreTrabajador" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_40" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaDeNacimiento" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_AAAAMMDD" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sexo" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}sexo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entidadFederativaDeNacimiento" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nacionalidad" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_3_3" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="consecExpMovil" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_3_3" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaEnvExpMovil" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_formato1_obl" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="idProcesoExpediente" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="motivoRechazo" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_3_3" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="descripcionRechazo" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_1_100" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="accion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_2"/&amp;gt;
 *         &amp;lt;element name="fechaDevolucion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_AAAAMMDD" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="montoDevolucion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numerico_13_2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaEnvioCancelacion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_AAAAMMDD" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaConfirmacion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_formato1_obl" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="aplicacionOrigen" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_2"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concluirExpedienteEntrada", propOrder = {
    "cveAfore",
    "idNegocio",
    "curp",
    "apellidoPaterno",
    "apellidoMaterno",
    "nombreTrabajador",
    "fechaDeNacimiento",
    "sexo",
    "entidadFederativaDeNacimiento",
    "nacionalidad",
    "consecExpMovil",
    "fechaEnvExpMovil",
    "idProcesoExpediente",
    "motivoRechazo",
    "descripcionRechazo",
    "accion",
    "fechaDevolucion",
    "montoDevolucion",
    "fechaEnvioCancelacion",
    "fechaConfirmacion",
    "aplicacionOrigen"
})
public class ConcluirExpedienteEntrada {

    @XmlElement(required = true)
    protected String cveAfore;
    protected String idNegocio;
    @XmlElement(required = true)
    protected String curp;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String nombreTrabajador;
    protected String fechaDeNacimiento;
    protected String sexo;
    protected String entidadFederativaDeNacimiento;
    protected String nacionalidad;
    protected String consecExpMovil;
    protected String fechaEnvExpMovil;
    protected String idProcesoExpediente;
    protected String motivoRechazo;
    protected String descripcionRechazo;
    @XmlElement(required = true)
    protected String accion;
    protected String fechaDevolucion;
    protected BigDecimal montoDevolucion;
    protected String fechaEnvioCancelacion;
    protected String fechaConfirmacion;
    @XmlElement(required = true)
    protected String aplicacionOrigen;

    /**
     * Obtiene el valor de la propiedad cveAfore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveAfore() {
        return cveAfore;
    }

    /**
     * Define el valor de la propiedad cveAfore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveAfore(String value) {
        this.cveAfore = value;
    }

    /**
     * Obtiene el valor de la propiedad idNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNegocio() {
        return idNegocio;
    }

    /**
     * Define el valor de la propiedad idNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNegocio(String value) {
        this.idNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Define el valor de la propiedad apellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Define el valor de la propiedad apellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTrabajador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    /**
     * Define el valor de la propiedad nombreTrabajador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTrabajador(String value) {
        this.nombreTrabajador = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaDeNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeNacimiento(String value) {
        this.fechaDeNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadFederativaDeNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadFederativaDeNacimiento() {
        return entidadFederativaDeNacimiento;
    }

    /**
     * Define el valor de la propiedad entidadFederativaDeNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadFederativaDeNacimiento(String value) {
        this.entidadFederativaDeNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad consecExpMovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecExpMovil() {
        return consecExpMovil;
    }

    /**
     * Define el valor de la propiedad consecExpMovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecExpMovil(String value) {
        this.consecExpMovil = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEnvExpMovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEnvExpMovil() {
        return fechaEnvExpMovil;
    }

    /**
     * Define el valor de la propiedad fechaEnvExpMovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEnvExpMovil(String value) {
        this.fechaEnvExpMovil = value;
    }

    /**
     * Obtiene el valor de la propiedad idProcesoExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProcesoExpediente() {
        return idProcesoExpediente;
    }

    /**
     * Define el valor de la propiedad idProcesoExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProcesoExpediente(String value) {
        this.idProcesoExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoRechazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    /**
     * Define el valor de la propiedad motivoRechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoRechazo(String value) {
        this.motivoRechazo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionRechazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRechazo() {
        return descripcionRechazo;
    }

    /**
     * Define el valor de la propiedad descripcionRechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRechazo(String value) {
        this.descripcionRechazo = value;
    }

    /**
     * Obtiene el valor de la propiedad accion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccion() {
        return accion;
    }

    /**
     * Define el valor de la propiedad accion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccion(String value) {
        this.accion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Define el valor de la propiedad fechaDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDevolucion(String value) {
        this.fechaDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDevolucion() {
        return montoDevolucion;
    }

    /**
     * Define el valor de la propiedad montoDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDevolucion(BigDecimal value) {
        this.montoDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEnvioCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEnvioCancelacion() {
        return fechaEnvioCancelacion;
    }

    /**
     * Define el valor de la propiedad fechaEnvioCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEnvioCancelacion(String value) {
        this.fechaEnvioCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaConfirmacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaConfirmacion() {
        return fechaConfirmacion;
    }

    /**
     * Define el valor de la propiedad fechaConfirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaConfirmacion(String value) {
        this.fechaConfirmacion = value;
    }

    /**
     * Obtiene el valor de la propiedad aplicacionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplicacionOrigen() {
        return aplicacionOrigen;
    }

    /**
     * Define el valor de la propiedad aplicacionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplicacionOrigen(String value) {
        this.aplicacionOrigen = value;
    }

}
