
package domain;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class PersonalRecord extends DomainEntity {

	private String name;
	private String photo;
	private String phoneNumber;
	private String likedln;


	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotBlank
	@URL
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Pattern(regexp = "[+][1-9]{1,3} [(][1-9]{1,3}[)] [0-9]{4,}")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@NotBlank
	@URL
	public String getLikedln() {
		return likedln;
	}
	public void setLikedln(String likedln) {
		this.likedln = likedln;
	}

}
