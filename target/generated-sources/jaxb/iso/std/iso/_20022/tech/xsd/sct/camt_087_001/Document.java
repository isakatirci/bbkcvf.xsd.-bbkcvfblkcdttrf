//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.camt_087_001;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqToModfyPmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06}SCTRequestToModifyPaymentV06"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqToModfyPmt"
})
public class Document {

    @XmlElement(name = "ReqToModfyPmt", required = true)
    protected SCTRequestToModifyPaymentV06 reqToModfyPmt;

    /**
     * Gets the value of the reqToModfyPmt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTRequestToModifyPaymentV06 }
     *     
     */
    public SCTRequestToModifyPaymentV06 getReqToModfyPmt() {
        return reqToModfyPmt;
    }

    /**
     * Sets the value of the reqToModfyPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTRequestToModifyPaymentV06 }
     *     
     */
    public void setReqToModfyPmt(SCTRequestToModifyPaymentV06 value) {
        this.reqToModfyPmt = value;
    }

}
