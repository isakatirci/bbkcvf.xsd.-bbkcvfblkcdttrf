//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.camt_029_001;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCTCompensation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCTCompensation2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;urn:iso:std:iso:20022:tech:xsd:sct:camt.029.001.09&gt;SCTActiveCurrencyAndAmount"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.029.001.09}SCTBranchAndFinancialInstitutionIdentification6"/&gt;
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.029.001.09}SCTBranchAndFinancialInstitutionIdentification6_1"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.029.001.09}SCTCompensationReason1Choice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCTCompensation2", propOrder = {
    "amt",
    "dbtrAgt",
    "cdtrAgt",
    "rsn"
})
public class SCTCompensation2 {

    @XmlElement(name = "Amt", required = true)
    protected SCTCompensation2 .Amt amt;
    @XmlElement(name = "DbtrAgt", required = true)
    protected SCTBranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "CdtrAgt", required = true)
    protected SCTBranchAndFinancialInstitutionIdentification61 cdtrAgt;
    @XmlElement(name = "Rsn", required = true)
    protected SCTCompensationReason1Choice rsn;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTCompensation2 .Amt }
     *     
     */
    public SCTCompensation2 .Amt getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTCompensation2 .Amt }
     *     
     */
    public void setAmt(SCTCompensation2 .Amt value) {
        this.amt = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public SCTBranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtrAgt(SCTBranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification61 }
     *     
     */
    public SCTBranchAndFinancialInstitutionIdentification61 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification61 }
     *     
     */
    public void setCdtrAgt(SCTBranchAndFinancialInstitutionIdentification61 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link SCTCompensationReason1Choice }
     *     
     */
    public SCTCompensationReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTCompensationReason1Choice }
     *     
     */
    public void setRsn(SCTCompensationReason1Choice value) {
        this.rsn = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;restriction base="&lt;urn:iso:std:iso:20022:tech:xsd:sct:camt.029.001.09&gt;SCTActiveCurrencyAndAmount"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amt
        extends SCTActiveCurrencyAndAmount
    {


    }

}