//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.camt_087_001;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCTUnderlyingPaymentTransaction4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCTUnderlyingPaymentTransaction4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06}SCTUnderlyingGroupInformation1"/&gt;
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06}SCTOrigId" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06}Max35Text"/&gt;
 *         &lt;element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06}SCTOrigId"/&gt;
 *         &lt;element name="OrgnlIntrBkSttlmAmt"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06&gt;SCTActiveCurrencyAndAmount"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrgnlIntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06}ISODate"/&gt;
 *         &lt;element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06}SCTOriginalTransactionReference28"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCTUnderlyingPaymentTransaction4", propOrder = {
    "orgnlGrpInf",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlIntrBkSttlmAmt",
    "orgnlIntrBkSttlmDt",
    "orgnlTxRef"
})
public class SCTUnderlyingPaymentTransaction4 {

    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected SCTUnderlyingGroupInformation1 orgnlGrpInf;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId", required = true)
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlTxId", required = true)
    protected String orgnlTxId;
    @XmlElement(name = "OrgnlIntrBkSttlmAmt", required = true)
    protected SCTUnderlyingPaymentTransaction4 .OrgnlIntrBkSttlmAmt orgnlIntrBkSttlmAmt;
    @XmlElement(name = "OrgnlIntrBkSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlIntrBkSttlmDt;
    @XmlElement(name = "OrgnlTxRef", required = true)
    protected SCTOriginalTransactionReference28 orgnlTxRef;

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link SCTUnderlyingGroupInformation1 }
     *     
     */
    public SCTUnderlyingGroupInformation1 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTUnderlyingGroupInformation1 }
     *     
     */
    public void setOrgnlGrpInf(SCTUnderlyingGroupInformation1 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the orgnlTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlTxId(String value) {
        this.orgnlTxId = value;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTUnderlyingPaymentTransaction4 .OrgnlIntrBkSttlmAmt }
     *     
     */
    public SCTUnderlyingPaymentTransaction4 .OrgnlIntrBkSttlmAmt getOrgnlIntrBkSttlmAmt() {
        return orgnlIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTUnderlyingPaymentTransaction4 .OrgnlIntrBkSttlmAmt }
     *     
     */
    public void setOrgnlIntrBkSttlmAmt(SCTUnderlyingPaymentTransaction4 .OrgnlIntrBkSttlmAmt value) {
        this.orgnlIntrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlIntrBkSttlmDt() {
        return orgnlIntrBkSttlmDt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.orgnlIntrBkSttlmDt = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SCTOriginalTransactionReference28 }
     *     
     */
    public SCTOriginalTransactionReference28 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTOriginalTransactionReference28 }
     *     
     */
    public void setOrgnlTxRef(SCTOriginalTransactionReference28 value) {
        this.orgnlTxRef = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;restriction base="&lt;urn:iso:std:iso:20022:tech:xsd:sct:camt.087.001.06&gt;SCTActiveCurrencyAndAmount"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OrgnlIntrBkSttlmAmt
        extends SCTActiveCurrencyAndAmount
    {


    }

}
