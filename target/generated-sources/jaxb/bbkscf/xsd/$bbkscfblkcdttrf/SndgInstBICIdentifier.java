//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package bbkscf.xsd.$bbkscfblkcdttrf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SndgInstBICIdentifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SndgInstBICIdentifier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MARKDEF0"/&gt;
 *     &lt;enumeration value="MARKDEFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SndgInstBICIdentifier")
@XmlEnum
public enum SndgInstBICIdentifier {

    @XmlEnumValue("MARKDEF0")
    MARKDEF_0("MARKDEF0"),
    MARKDEFF("MARKDEFF");
    private final String value;

    SndgInstBICIdentifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SndgInstBICIdentifier fromValue(String v) {
        for (SndgInstBICIdentifier c: SndgInstBICIdentifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
