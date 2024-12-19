//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.pacs_008_001;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCTRemittanceAmount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCTRemittanceAmount3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DuePyblAmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.008.001.08}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="DscntApldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.008.001.08}DiscountAmountAndType1" minOccurs="0"/&gt;
 *         &lt;element name="CdtNoteAmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.008.001.08}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.008.001.08}TaxAmountAndType1" minOccurs="0"/&gt;
 *         &lt;element name="AdjstmntAmtAndRsn" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.008.001.08}DocumentAdjustment1" minOccurs="0"/&gt;
 *         &lt;element name="RmtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.008.001.08}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCTRemittanceAmount3", propOrder = {
    "duePyblAmt",
    "dscntApldAmt",
    "cdtNoteAmt",
    "taxAmt",
    "adjstmntAmtAndRsn",
    "rmtdAmt"
})
public class SCTRemittanceAmount3 {

    @XmlElement(name = "DuePyblAmt")
    protected ActiveOrHistoricCurrencyAndAmount duePyblAmt;
    @XmlElement(name = "DscntApldAmt")
    protected DiscountAmountAndType1 dscntApldAmt;
    @XmlElement(name = "CdtNoteAmt")
    protected ActiveOrHistoricCurrencyAndAmount cdtNoteAmt;
    @XmlElement(name = "TaxAmt")
    protected TaxAmountAndType1 taxAmt;
    @XmlElement(name = "AdjstmntAmtAndRsn")
    protected DocumentAdjustment1 adjstmntAmtAndRsn;
    @XmlElement(name = "RmtdAmt")
    protected ActiveOrHistoricCurrencyAndAmount rmtdAmt;

    /**
     * Gets the value of the duePyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getDuePyblAmt() {
        return duePyblAmt;
    }

    /**
     * Sets the value of the duePyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setDuePyblAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.duePyblAmt = value;
    }

    /**
     * Gets the value of the dscntApldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAmountAndType1 }
     *     
     */
    public DiscountAmountAndType1 getDscntApldAmt() {
        return dscntApldAmt;
    }

    /**
     * Sets the value of the dscntApldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAmountAndType1 }
     *     
     */
    public void setDscntApldAmt(DiscountAmountAndType1 value) {
        this.dscntApldAmt = value;
    }

    /**
     * Gets the value of the cdtNoteAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCdtNoteAmt() {
        return cdtNoteAmt;
    }

    /**
     * Sets the value of the cdtNoteAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setCdtNoteAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.cdtNoteAmt = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountAndType1 }
     *     
     */
    public TaxAmountAndType1 getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountAndType1 }
     *     
     */
    public void setTaxAmt(TaxAmountAndType1 value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the adjstmntAmtAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAdjustment1 }
     *     
     */
    public DocumentAdjustment1 getAdjstmntAmtAndRsn() {
        return adjstmntAmtAndRsn;
    }

    /**
     * Sets the value of the adjstmntAmtAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAdjustment1 }
     *     
     */
    public void setAdjstmntAmtAndRsn(DocumentAdjustment1 value) {
        this.adjstmntAmtAndRsn = value;
    }

    /**
     * Gets the value of the rmtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    /**
     * Sets the value of the rmtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rmtdAmt = value;
    }

}
