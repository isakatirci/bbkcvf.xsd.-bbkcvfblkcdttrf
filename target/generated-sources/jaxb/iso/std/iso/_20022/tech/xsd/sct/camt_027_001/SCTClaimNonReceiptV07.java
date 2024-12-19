//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.camt_027_001;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCTClaimNonReceiptV07 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCTClaimNonReceiptV07"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.027.001.07}SCTCaseAssignment5"/&gt;
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.027.001.07}SCTCase5"/&gt;
 *         &lt;element name="Undrlyg" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.027.001.07}SCTUnderlyingTransaction5Choice"/&gt;
 *         &lt;element name="InstrForAssgne" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.027.001.07}SCTInstructionForAssignee1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCTClaimNonReceiptV07", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "instrForAssgne"
})
public class SCTClaimNonReceiptV07 {

    @XmlElement(name = "Assgnmt", required = true)
    protected SCTCaseAssignment5 assgnmt;
    @XmlElement(name = "Case", required = true)
    protected SCTCase5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected SCTUnderlyingTransaction5Choice undrlyg;
    @XmlElement(name = "InstrForAssgne")
    protected SCTInstructionForAssignee1 instrForAssgne;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTCaseAssignment5 }
     *     
     */
    public SCTCaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTCaseAssignment5 }
     *     
     */
    public void setAssgnmt(SCTCaseAssignment5 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link SCTCase5 }
     *     
     */
    public SCTCase5 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTCase5 }
     *     
     */
    public void setCase(SCTCase5 value) {
        this._case = value;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link SCTUnderlyingTransaction5Choice }
     *     
     */
    public SCTUnderlyingTransaction5Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTUnderlyingTransaction5Choice }
     *     
     */
    public void setUndrlyg(SCTUnderlyingTransaction5Choice value) {
        this.undrlyg = value;
    }

    /**
     * Gets the value of the instrForAssgne property.
     * 
     * @return
     *     possible object is
     *     {@link SCTInstructionForAssignee1 }
     *     
     */
    public SCTInstructionForAssignee1 getInstrForAssgne() {
        return instrForAssgne;
    }

    /**
     * Sets the value of the instrForAssgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTInstructionForAssignee1 }
     *     
     */
    public void setInstrForAssgne(SCTInstructionForAssignee1 value) {
        this.instrForAssgne = value;
    }

}
