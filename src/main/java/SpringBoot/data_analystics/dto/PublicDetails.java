package SpringBoot.data_analystics.dto;

public class PublicDetails {

	private Long pdId;
	private String fname;
	private String mname;
	private String lname;
	private PublicAddress pAddress;
	private PublicAddress tAddress;
	private EducationOccupation eoId;
	private DocumentDetails docId;
	private String mobileNum;
	private String whatsAppNum;
	private HouseAndVehicle hvId;
	private WardDetails wardId;

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

	public PublicAddress getpAddress() {
		return pAddress;
	}

	public void setpAddress(PublicAddress pAddress) {
		this.pAddress = pAddress;
	}

	public PublicAddress gettAddress() {
		return tAddress;
	}

	public void settAddress(PublicAddress tAddress) {
		this.tAddress = tAddress;
	}

	public EducationOccupation getEoId() {
		return eoId;
	}

	public void setEoId(EducationOccupation eoId) {
		this.eoId = eoId;
	}

	public DocumentDetails getDocId() {
		return docId;
	}

	public void setDocId(DocumentDetails docId) {
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

	public HouseAndVehicle getHvId() {
		return hvId;
	}

	public void setHvId(HouseAndVehicle hvId) {
		this.hvId = hvId;
	}

	public WardDetails getWardId() {
		return wardId;
	}

	public void setWardId(WardDetails wardId) {
		this.wardId = wardId;
	}

}
