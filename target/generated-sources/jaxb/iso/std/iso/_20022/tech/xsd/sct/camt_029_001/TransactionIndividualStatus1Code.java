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
 * <p>Java class for TransactionIndividualStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionIndividualStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ACCR"/&gt;
 *     &lt;enumeration value="ACSC"/&gt;
 *     &lt;enumeration value="ACSP"/&gt;
 *     &lt;enumeration value="ACTC"/&gt;
 *     &lt;enumeration value="ACWC"/&gt;
 *     &lt;enumeration value="PDNG"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionIndividualStatus1Code")
@XmlEnum
public enum TransactionIndividualStatus1Code {

    ACCP,
    ACCR,
    ACSC,
    ACSP,
    ACTC,
    ACWC,
    PDNG,
    RJCT;

    public String value() {
        return name();
    }

    public static TransactionIndividualStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}