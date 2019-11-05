package SpringBoot.data_analystics.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;

	private String password;

	@Transient
	private String passwordConfirm;

	@ManyToMany
	private Set<Role> roles;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "wardId")
	private WardDetailsBO wardDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public WardDetailsBO getWardDetails() {
		return wardDetails;
	}

	public void setWardDetails(WardDetailsBO wardDetails) {
		this.wardDetails = wardDetails;
	}
	
	
}
