//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package iso.std.iso._20022.tech.xsd.sct.pacs_028_001;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Max35Text_SCL.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Max35Text_SCL"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCL"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="35"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Max35Text_SCL")
@XmlEnum
public enum Max35TextSCL {

    SCL;

    public String value() {
        return name();
    }

    public static Max35TextSCL fromValue(String v) {
        return valueOf(v);
    }

}
