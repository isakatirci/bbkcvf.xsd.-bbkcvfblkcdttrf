//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.pacs_004_001;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SCTActiveCurrencyAndAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCTActiveCurrencyAndAmount"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09&gt;SCTActiveCurrencyAndAmount_SimpleType"&gt;
 *       &lt;attribute name="Ccy" use="required" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.004.001.09}SCTActiveCurrencyCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCTActiveCurrencyAndAmount", propOrder = {
    "value"
})
@XmlSeeAlso({
    iso.std.iso._20022.tech.xsd.sct.pacs_004_001.SCTCharges7 .Amt.class,
    iso.std.iso._20022.tech.xsd.sct.pacs_004_001.SCTPaymentTransaction112 .OrgnlIntrBkSttlmAmt.class
})
public class SCTActiveCurrencyAndAmount {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "Ccy", required = true)
    protected SCTActiveCurrencyCode ccy;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link SCTActiveCurrencyCode }
     *     
     */
    public SCTActiveCurrencyCode getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCTActiveCurrencyCode }
     *     
     */
    public void setCcy(SCTActiveCurrencyCode value) {
        this.ccy = value;
    }

}
