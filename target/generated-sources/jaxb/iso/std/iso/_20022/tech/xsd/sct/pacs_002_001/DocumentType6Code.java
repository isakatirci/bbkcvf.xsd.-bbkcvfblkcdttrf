//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.pacs_002_001;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AROI"/&gt;
 *     &lt;enumeration value="BOLD"/&gt;
 *     &lt;enumeration value="CINV"/&gt;
 *     &lt;enumeration value="CMCN"/&gt;
 *     &lt;enumeration value="CNFA"/&gt;
 *     &lt;enumeration value="CREN"/&gt;
 *     &lt;enumeration value="DEBN"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="DNFA"/&gt;
 *     &lt;enumeration value="HIRI"/&gt;
 *     &lt;enumeration value="MSIN"/&gt;
 *     &lt;enumeration value="PUOR"/&gt;
 *     &lt;enumeration value="SBIN"/&gt;
 *     &lt;enumeration value="SOAC"/&gt;
 *     &lt;enumeration value="TSUT"/&gt;
 *     &lt;enumeration value="VCHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType6Code")
@XmlEnum
public enum DocumentType6Code {

    AROI,
    BOLD,
    CINV,
    CMCN,
    CNFA,
    CREN,
    DEBN,
    DISP,
    DNFA,
    HIRI,
    MSIN,
    PUOR,
    SBIN,
    SOAC,
    TSUT,
    VCHR;

    public String value() {
        return name();
    }

    public static DocumentType6Code fromValue(String v) {
        return valueOf(v);
    }

}
