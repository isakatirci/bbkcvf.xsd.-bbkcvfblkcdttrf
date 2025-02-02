//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.pacs_002_001;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExternalStatusReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AM01"/&gt;
 *     &lt;enumeration value="AM02"/&gt;
 *     &lt;enumeration value="AM05"/&gt;
 *     &lt;enumeration value="DT01"/&gt;
 *     &lt;enumeration value="ED05"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalStatusReason2Code")
@XmlEnum
public enum ExternalStatusReason2Code {

    @XmlEnumValue("AM01")
    AM_01("AM01"),
    @XmlEnumValue("AM02")
    AM_02("AM02"),
    @XmlEnumValue("AM05")
    AM_05("AM05"),
    @XmlEnumValue("DT01")
    DT_01("DT01"),
    @XmlEnumValue("ED05")
    ED_05("ED05");
    private final String value;

    ExternalStatusReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalStatusReason2Code fromValue(String v) {
        for (ExternalStatusReason2Code c: ExternalStatusReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
