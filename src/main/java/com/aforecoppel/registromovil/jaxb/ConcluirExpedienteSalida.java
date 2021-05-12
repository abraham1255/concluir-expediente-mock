
package com.aforecoppel.registromovil.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para concluirExpedienteSalida complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="concluirExpedienteSalida"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="resultadoOperacion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}resultadoOperacion"/&amp;gt;
 *         &amp;lt;element name="diagnosticoRecepcion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_15"/&amp;gt;
 *         &amp;lt;element name="idNegocio" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}nss" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="claveDeAforeConNssAsociado" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_3" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="identificadorDeTipoDeTrabajador" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_1" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nssAsociado" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}nss" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="curpOficial" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}curp" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nombreFormatoImss" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_50" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nombreProcanase" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_50" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaDeNacimiento" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_AAAAMMDD" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sexo" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}sexo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entidadFederativaNacimiento" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nacionalidad" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_3_3" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="indicadorDeCreditoInfonavit" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_1" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="indicadorSieforeBasicaPension" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_1" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="indicadorPortabilidad" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}numericoString_1" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaDePrimerRegistro" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_AAAAMMDD" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaAltaEnAfore" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_AAAAMMDD" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fechaTransaccion" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}fecha_formato1_obl" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entidadOrigen" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}alfaNumerico_3_3"/&amp;gt;
 *         &amp;lt;element name="curp" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}curp" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concluirExpedienteSalida", propOrder = {
    "resultadoOperacion",
    "diagnosticoRecepcion",
    "idNegocio",
    "claveDeAforeConNssAsociado",
    "identificadorDeTipoDeTrabajador",
    "nssAsociado",
    "curpOficial",
    "nombreFormatoImss",
    "nombreProcanase",
    "fechaDeNacimiento",
    "sexo",
    "entidadFederativaNacimiento",
    "nacionalidad",
    "indicadorDeCreditoInfonavit",
    "indicadorSieforeBasicaPension",
    "indicadorPortabilidad",
    "fechaDePrimerRegistro",
    "fechaAltaEnAfore",
    "fechaTransaccion",
    "entidadOrigen",
    "curp"
})
public class ConcluirExpedienteSalida {

    @XmlElement(required = true)
    protected String resultadoOperacion;
    @XmlElement(required = true)
    protected String diagnosticoRecepcion;
    protected String idNegocio;
    protected String claveDeAforeConNssAsociado;
    protected String identificadorDeTipoDeTrabajador;
    protected String nssAsociado;
    protected String curpOficial;
    protected String nombreFormatoImss;
    protected String nombreProcanase;
    protected String fechaDeNacimiento;
    protected String sexo;
    protected String entidadFederativaNacimiento;
    protected String nacionalidad;
    protected String indicadorDeCreditoInfonavit;
    protected String indicadorSieforeBasicaPension;
    protected String indicadorPortabilidad;
    protected String fechaDePrimerRegistro;
    protected String fechaAltaEnAfore;
    protected String fechaTransaccion;
    @XmlElement(required = true)
    protected String entidadOrigen;
    protected String curp;

    /**
     * Obtiene el valor de la propiedad resultadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoOperacion() {
        return resultadoOperacion;
    }

    /**
     * Define el valor de la propiedad resultadoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoOperacion(String value) {
        this.resultadoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticoRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticoRecepcion() {
        return diagnosticoRecepcion;
    }

    /**
     * Define el valor de la propiedad diagnosticoRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticoRecepcion(String value) {
        this.diagnosticoRecepcion = value;
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
     * Obtiene el valor de la propiedad claveDeAforeConNssAsociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveDeAforeConNssAsociado() {
        return claveDeAforeConNssAsociado;
    }

    /**
     * Define el valor de la propiedad claveDeAforeConNssAsociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveDeAforeConNssAsociado(String value) {
        this.claveDeAforeConNssAsociado = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorDeTipoDeTrabajador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorDeTipoDeTrabajador() {
        return identificadorDeTipoDeTrabajador;
    }

    /**
     * Define el valor de la propiedad identificadorDeTipoDeTrabajador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorDeTipoDeTrabajador(String value) {
        this.identificadorDeTipoDeTrabajador = value;
    }

    /**
     * Obtiene el valor de la propiedad nssAsociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNssAsociado() {
        return nssAsociado;
    }

    /**
     * Define el valor de la propiedad nssAsociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNssAsociado(String value) {
        this.nssAsociado = value;
    }

    /**
     * Obtiene el valor de la propiedad curpOficial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpOficial() {
        return curpOficial;
    }

    /**
     * Define el valor de la propiedad curpOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpOficial(String value) {
        this.curpOficial = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFormatoImss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFormatoImss() {
        return nombreFormatoImss;
    }

    /**
     * Define el valor de la propiedad nombreFormatoImss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFormatoImss(String value) {
        this.nombreFormatoImss = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProcanase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProcanase() {
        return nombreProcanase;
    }

    /**
     * Define el valor de la propiedad nombreProcanase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProcanase(String value) {
        this.nombreProcanase = value;
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
     * Obtiene el valor de la propiedad entidadFederativaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadFederativaNacimiento() {
        return entidadFederativaNacimiento;
    }

    /**
     * Define el valor de la propiedad entidadFederativaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadFederativaNacimiento(String value) {
        this.entidadFederativaNacimiento = value;
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
     * Obtiene el valor de la propiedad indicadorDeCreditoInfonavit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorDeCreditoInfonavit() {
        return indicadorDeCreditoInfonavit;
    }

    /**
     * Define el valor de la propiedad indicadorDeCreditoInfonavit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorDeCreditoInfonavit(String value) {
        this.indicadorDeCreditoInfonavit = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorSieforeBasicaPension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorSieforeBasicaPension() {
        return indicadorSieforeBasicaPension;
    }

    /**
     * Define el valor de la propiedad indicadorSieforeBasicaPension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorSieforeBasicaPension(String value) {
        this.indicadorSieforeBasicaPension = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorPortabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPortabilidad() {
        return indicadorPortabilidad;
    }

    /**
     * Define el valor de la propiedad indicadorPortabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPortabilidad(String value) {
        this.indicadorPortabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDePrimerRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDePrimerRegistro() {
        return fechaDePrimerRegistro;
    }

    /**
     * Define el valor de la propiedad fechaDePrimerRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDePrimerRegistro(String value) {
        this.fechaDePrimerRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAltaEnAfore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAltaEnAfore() {
        return fechaAltaEnAfore;
    }

    /**
     * Define el valor de la propiedad fechaAltaEnAfore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAltaEnAfore(String value) {
        this.fechaAltaEnAfore = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Define el valor de la propiedad fechaTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTransaccion(String value) {
        this.fechaTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadOrigen() {
        return entidadOrigen;
    }

    /**
     * Define el valor de la propiedad entidadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadOrigen(String value) {
        this.entidadOrigen = value;
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

}
