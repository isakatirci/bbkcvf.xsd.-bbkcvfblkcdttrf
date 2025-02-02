//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.pacs_004_001;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCTGroupHeader90 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCTGroupHeader90"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}SCTId"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}ISODateTime"/&gt;
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}Max15NumericText"/&gt;
 *         &lt;element name="TtlRtrdIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}SCTActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}ISODate"/&gt;
 *         &lt;element name="SttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}SCTSettlementInstruction7"/&gt;
 *         &lt;element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}SCTBranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}SCTBranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCTGroupHeader90", propOrder = {
    "msgId",
    "creDtTm",
    "nbOfTxs",
    "ttlRtrdIntrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmInf",
    "instgAgt",
    "instdAgt"
})
public class SCTGroupHeader90 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "TtlRtrdIntrBkSttlmAmt", required = true)
    protected SCTActiveCurrencyAndAmount ttlRtrdIntrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "SttlmInf", required = true)
    protected SCTSettlementInstruction7 sttlmInf;
    @XmlElement(name = "InstgAgt")
    protected SCTBranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected SCTBranchAndFinancialInstitutionIdentification6 instdAgt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the ttlRtrdIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTActiveCurrencyAndAmount }
     *     
     */
    public SCTActiveCurrencyAndAmount getTtlRtrdIntrBkSttlmAmt() {
        return ttlRtrdIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the ttlRtrdIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTActiveCurrencyAndAmount }
     *     
     */
    public void setTtlRtrdIntrBkSttlmAmt(SCTActiveCurrencyAndAmount value) {
        this.ttlRtrdIntrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link SCTSettlementInstruction7 }
     *     
     */
    public SCTSettlementInstruction7 getSttlmInf() {
        return sttlmInf;
    }

    /**
     * Sets the value of the sttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTSettlementInstruction7 }
     *     
     */
    public void setSttlmInf(SCTSettlementInstruction7 value) {
        this.sttlmInf = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public SCTBranchAndFinancialInstitutionIdentification6 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstgAgt(SCTBranchAndFinancialInstitutionIdentification6 value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public SCTBranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTBranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstdAgt(SCTBranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
    }

}
