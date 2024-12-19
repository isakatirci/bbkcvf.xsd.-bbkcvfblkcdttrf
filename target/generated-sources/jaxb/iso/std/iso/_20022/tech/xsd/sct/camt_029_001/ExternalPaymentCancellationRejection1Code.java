//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.camt_029_001;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalPaymentCancellationRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExternalPaymentCancellationRejection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AC04"/&gt;
 *     &lt;enumeration value="AM04"/&gt;
 *     &lt;enumeration value="ARDT"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="LEGL"/&gt;
 *     &lt;enumeration value="NOAS"/&gt;
 *     &lt;enumeration value="NOOR"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalPaymentCancellationRejection1Code")
@XmlEnum
public enum ExternalPaymentCancellationRejection1Code {

    @XmlEnumValue("AC04")
    AC_04("AC04"),
    @XmlEnumValue("AM04")
    AM_04("AM04"),
    ARDT("ARDT"),
    CUST("CUST"),
    LEGL("LEGL"),
    NOAS("NOAS"),
    NOOR("NOOR");
    private final String value;

    ExternalPaymentCancellationRejection1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalPaymentCancellationRejection1Code fromValue(String v) {
        for (ExternalPaymentCancellationRejection1Code c: ExternalPaymentCancellationRejection1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
