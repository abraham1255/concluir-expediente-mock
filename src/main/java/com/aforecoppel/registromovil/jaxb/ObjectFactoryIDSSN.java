
package com.aforecoppel.registromovil.jaxb;

import com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar.ArrayOfMotivos;
import com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar.IDSSN;
import com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar.Motivo;
import com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar.SSNROP;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar package. 
 * <p>An ObjectFactoryIDSSN allows you to programatically 
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
public class ObjectFactoryIDSSN {


    /**
     * Create a new ObjectFactoryIDSSN that can be used to create new instances of schema derived classes for package: mx.com.procesar.arquitecturasw.datatypes.tiposcomunesprocesar
     * 
     */
    public ObjectFactoryIDSSN() {
    }

    /**
     * Create an instance of {@link IDSSN }
     * 
     */
    public IDSSN createIDSSN() {
        return new IDSSN();
    }

    /**
     * Create an instance of {@link ArrayOfMotivos }
     * 
     */
    public ArrayOfMotivos createArrayOfMotivos() {
        return new ArrayOfMotivos();
    }

    /**
     * Create an instance of {@link Motivo }
     * 
     */
    public Motivo createMotivo() {
        return new Motivo();
    }

    /**
     * Create an instance of {@link SSNROP }
     * 
     */
    public SSNROP createSSNROP() {
        return new SSNROP();
    }

}
