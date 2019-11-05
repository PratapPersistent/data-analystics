package SpringBoot.data_analystics.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PublicDetails")
public class PublicDetailsBO implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pdId;
	
	@Column
	private String fname;
	
	@Column
	private String mname;
	
	@Column
	private String lname;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name="pAddress", referencedColumnName="addressId")
	private PublicAddressBO pAddress;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name="tAddress", referencedColumnName="addressId")
	private PublicAddressBO tAddress;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "eoId")
	private EducationOccupationBO eoId;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "docId")
	private DocumentDetailsBO docId;
	
	@Column
	private String mobileNum;
	
	@Column
	private String whatsAppNum;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "hvId")
	private HouseAndVehicleBO hvId;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "wardId")
	private WardDetailsBO wardId;

	public Long getPdId() {
		return pdId;
	}

	public void setPdId(Long pdId) {
		this.pdId = pdId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public PublicAddressBO getpAddress() {
		return pAddress;
	}

	public void setpAddress(PublicAddressBO pAddress) {
		this.pAddress = pAddress;
	}

	public PublicAddressBO gettAddress() {
		return tAddress;
	}

	public void settAddress(PublicAddressBO tAddress) {
		this.tAddress = tAddress;
	}

	public EducationOccupationBO getEoId() {
		return eoId;
	}

	public void setEoId(EducationOccupationBO eoId) {
		this.eoId = eoId;
	}

	public DocumentDetailsBO getDocId() {
		return docId;
	}

	public void setDocId(DocumentDetailsBO docId) {
		this.docId = docId;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getWhatsAppNum() {
		return whatsAppNum;
	}

	public void setWhatsAppNum(String whatsAppNum) {
		this.whatsAppNum = whatsAppNum;
	}

	public HouseAndVehicleBO getHvId() {
		return hvId;
	}

	public void setHvId(HouseAndVehicleBO hvId) {
		this.hvId = hvId;
	}

	public WardDetailsBO getWardId() {
		return wardId;
	}

	public void setWardId(WardDetailsBO wardId) {
		this.wardId = wardId;
	}

}
