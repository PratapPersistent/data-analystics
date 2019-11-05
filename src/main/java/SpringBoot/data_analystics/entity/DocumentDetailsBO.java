package SpringBoot.data_analystics.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DocumentDetails")
public class DocumentDetailsBO implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ddId;
	
	@Column
	private String aadharCard;
	
	@Column
	private String panCard;
	
	@Column
	private String passport;
	
	@Column
	private String ssPass;
	
	@Column
	private String votingCard;
	
	@Column
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
