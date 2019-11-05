package SpringBoot.data_analystics.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HouseAndVehicle")
public class HouseAndVehicleBO implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hvId;
	
	@Column
	private Boolean ownHouse;
	
	@Column
	private String houseOwner;
	
	@Column
	private Boolean twoWheeler;
	
	@Column
	private Boolean fourWheeler;

	public Long getHvId() {
		return hvId;
	}

	public void setHvId(Long hvId) {
		this.hvId = hvId;
	}

	public Boolean getOwnHouse() {
		return ownHouse;
	}

	public void setOwnHouse(Boolean ownHouse) {
		this.ownHouse = ownHouse;
	}

	public String getHouseOwner() {
		return houseOwner;
	}

	public void setHouseOwner(String houseOwner) {
		this.houseOwner = houseOwner;
	}

	public Boolean getTwoWheeler() {
		return twoWheeler;
	}

	public void setTwoWheeler(Boolean twoWheeler) {
		this.twoWheeler = twoWheeler;
	}

	public Boolean getFourWheeler() {
		return fourWheeler;
	}

	public void setFourWheeler(Boolean fourWheeler) {
		this.fourWheeler = fourWheeler;
	}	

}
