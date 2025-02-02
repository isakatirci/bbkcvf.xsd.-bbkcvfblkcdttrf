//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 09:50:58 AM TRT 
//


package bbkcvf.xsd.$bbkcvfblkcdttrf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import iso.std.iso._20022.tech.xsd.sct.pacs_002_001.SCTFIToFIPaymentStatusReportV10;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SndgInst" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}SndgInstBICIdentifier"/&gt;
 *         &lt;element name="RcvgInst" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.002.001.10SCL}BICFIDec2014Identifier"/&gt;
 *         &lt;element name="SrvcId" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}SrvcID"/&gt;
 *         &lt;element name="TstCode" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}TestCodeType"/&gt;
 *         &lt;element name="FType" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}FTpType"/&gt;
 *         &lt;element name="FileRef" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}Max16Text"/&gt;
 *         &lt;element name="FileDtTm" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.002.001.10SCL}ISODateTime"/&gt;
 *         &lt;element name="OrigFRef" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="OrigFName" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}Max32Text"/&gt;
 *         &lt;element name="OrigDtTm" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.002.001.10SCL}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="FileRjctRsn" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}Text3"/&gt;
 *         &lt;element name="FileBusDt" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.002.001.10SCL}ISODate"/&gt;
 *         &lt;element name="FileCycleNo" type="{urn:BBkCVF:xsd:$BBkCVFBlkCdtTrf}Max2NumericText"/&gt;
 *         &lt;element name="FIToFIPmtStsRptSCL" type="{urn:iso:std:iso:20022:tech:xsd:sct:pacs.002.001.10SCL}SCTFIToFIPaymentStatusReportV10" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sndgInst",
    "rcvgInst",
    "srvcId",
    "tstCode",
    "fType",
    "fileRef",
    "fileDtTm",
    "origFRef",
    "origFName",
    "origDtTm",
    "fileRjctRsn",
    "fileBusDt",
    "fileCycleNo",
    "fiToFIPmtStsRptSCL"
})
@XmlRootElement(name = "BBkCVFBlkCdtTrf")
public class BBkCVFBlkCdtTrf {

    @XmlElement(name = "SndgInst", required = true)
    @XmlSchemaType(name = "string")
    protected SndgInstBICIdentifier sndgInst;
    @XmlElement(name = "RcvgInst", required = true)
    protected String rcvgInst;
    @XmlElement(name = "SrvcId", required = true)
    @XmlSchemaType(name = "string")
    protected SrvcID srvcId;
    @XmlElement(name = "TstCode", required = true)
    @XmlSchemaType(name = "string")
    protected TestCodeType tstCode;
    @XmlElement(name = "FType", required = true)
    @XmlSchemaType(name = "string")
    protected FTpType fType;
    @XmlElement(name = "FileRef", required = true)
    protected String fileRef;
    @XmlElement(name = "FileDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileDtTm;
    @XmlElement(name = "OrigFRef")
    protected String origFRef;
    @XmlElement(name = "OrigFName", required = true)
    protected String origFName;
    @XmlElement(name = "OrigDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origDtTm;
    @XmlElement(name = "FileRjctRsn", required = true)
    protected String fileRjctRsn;
    @XmlElement(name = "FileBusDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fileBusDt;
    @XmlElement(name = "FileCycleNo", required = true)
    protected String fileCycleNo;
    @XmlElement(name = "FIToFIPmtStsRptSCL")
    protected List<SCTFIToFIPaymentStatusReportV10> fiToFIPmtStsRptSCL;

    /**
     * Gets the value of the sndgInst property.
     * 
     * @return
     *     possible object is
     *     {@link SndgInstBICIdentifier }
     *     
     */
    public SndgInstBICIdentifier getSndgInst() {
        return sndgInst;
    }

    /**
     * Sets the value of the sndgInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link SndgInstBICIdentifier }
     *     
     */
    public void setSndgInst(SndgInstBICIdentifier value) {
        this.sndgInst = value;
    }

    /**
     * Gets the value of the rcvgInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvgInst() {
        return rcvgInst;
    }

    /**
     * Sets the value of the rcvgInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvgInst(String value) {
        this.rcvgInst = value;
    }

    /**
     * Gets the value of the srvcId property.
     * 
     * @return
     *     possible object is
     *     {@link SrvcID }
     *     
     */
    public SrvcID getSrvcId() {
        return srvcId;
    }

    /**
     * Sets the value of the srvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrvcID }
     *     
     */
    public void setSrvcId(SrvcID value) {
        this.srvcId = value;
    }

    /**
     * Gets the value of the tstCode property.
     * 
     * @return
     *     possible object is
     *     {@link TestCodeType }
     *     
     */
    public TestCodeType getTstCode() {
        return tstCode;
    }

    /**
     * Sets the value of the tstCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCodeType }
     *     
     */
    public void setTstCode(TestCodeType value) {
        this.tstCode = value;
    }

    /**
     * Gets the value of the fType property.
     * 
     * @return
     *     possible object is
     *     {@link FTpType }
     *     
     */
    public FTpType getFType() {
        return fType;
    }

    /**
     * Sets the value of the fType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTpType }
     *     
     */
    public void setFType(FTpType value) {
        this.fType = value;
    }

    /**
     * Gets the value of the fileRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileRef() {
        return fileRef;
    }

    /**
     * Sets the value of the fileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileRef(String value) {
        this.fileRef = value;
    }

    /**
     * Gets the value of the fileDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileDtTm() {
        return fileDtTm;
    }

    /**
     * Sets the value of the fileDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileDtTm(XMLGregorianCalendar value) {
        this.fileDtTm = value;
    }

    /**
     * Gets the value of the origFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigFRef() {
        return origFRef;
    }

    /**
     * Sets the value of the origFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigFRef(String value) {
        this.origFRef = value;
    }

    /**
     * Gets the value of the origFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigFName() {
        return origFName;
    }

    /**
     * Sets the value of the origFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigFName(String value) {
        this.origFName = value;
    }

    /**
     * Gets the value of the origDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigDtTm() {
        return origDtTm;
    }

    /**
     * Sets the value of the origDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigDtTm(XMLGregorianCalendar value) {
        this.origDtTm = value;
    }

    /**
     * Gets the value of the fileRjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileRjctRsn() {
        return fileRjctRsn;
    }

    /**
     * Sets the value of the fileRjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileRjctRsn(String value) {
        this.fileRjctRsn = value;
    }

    /**
     * Gets the value of the fileBusDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileBusDt() {
        return fileBusDt;
    }

    /**
     * Sets the value of the fileBusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileBusDt(XMLGregorianCalendar value) {
        this.fileBusDt = value;
    }

    /**
     * Gets the value of the fileCycleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCycleNo() {
        return fileCycleNo;
    }

    /**
     * Sets the value of the fileCycleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCycleNo(String value) {
        this.fileCycleNo = value;
    }

    /**
     * Gets the value of the fiToFIPmtStsRptSCL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fiToFIPmtStsRptSCL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIToFIPmtStsRptSCL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCTFIToFIPaymentStatusReportV10 }
     * 
     * 
     */
    public List<SCTFIToFIPaymentStatusReportV10> getFIToFIPmtStsRptSCL() {
        if (fiToFIPmtStsRptSCL == null) {
            fiToFIPmtStsRptSCL = new ArrayList<SCTFIToFIPaymentStatusReportV10>();
        }
        return this.fiToFIPmtStsRptSCL;
    }

}
