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
import mx.com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar.IDSSN;


/**
 * <p>Clase Java para concluirExpedienteContrato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="concluirExpedienteContrato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idssn" type="{http://www.procesar.com.mx/ArquitecturaSW/DataTypes/tiposComunesProcesar/}IDSSN"/&gt;
 *         &lt;element name="cuerpo" type="{http://www.procesar.com.mx/AdmonCuenta/ConclusionExpeMovil/concluirExpediente/}concluirExpedienteEntrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
