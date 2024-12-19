//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.camt_029_001;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalServiceLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExternalServiceLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEPA"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *     &lt;pattern value="(\s*[^\s]\s*)+"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalServiceLevel1Code")
@XmlEnum
public enum ExternalServiceLevel1Code {

    SEPA;

    public String value() {
        return name();
    }

    public static ExternalServiceLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
