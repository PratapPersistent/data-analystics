package SpringBoot.data_analystics.dto;

public class DocumentDetails {

	private long ddId;
	
	private String aadharCard;
	
	private String panCard;
	
	private String passport;
	
	private String ssPass;
	
	private String votingCard;
	
	private String rationCard;

	public long getDdId() {
		return ddId;
	}

	public void setDdId(long ddId) {
		this.ddId = ddId;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getSsPass() {
		return ssPass;
	}

	public void setSsPass(String ssPass) {
		this.ssPass = ssPass;
	}

	public String getVotingCard() {
		return votingCard;
	}

	public void setVotingCard(String votingCard) {
		this.votingCard = votingCard;
	}

	public String getRationCard() {
		return rationCard;
	}

	public void setRationCard(String rationCard) {
		this.rationCard = rationCard;
	}
}
