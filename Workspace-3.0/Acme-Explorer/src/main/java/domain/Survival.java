package domain;

import java.util.Date;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Survival extends DomainEntity {

	private String title;
	private String description;
	private Date moment;
	private Gps location;

	private Manager manager;
	private Trip trip;

	@NotBlank
	public String getTitle() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	@NotBlank
	public String getDescription() {
		return description;

	}

	public void setDescription(String description) {
		this.description = description;
	}

	@NotEmpty
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@NotEmpty
	public Gps getLocation() {
		return location;
	}

	public void setLocation(Gps location) {
		this.location = location;
	}

	@Valid
	public Manager getManager() {
		return manager;
	}

	public void setManager(final Manager manager) {
		this.manager = manager;
	}

	@Valid
	public Trip getTrip() {
		return trip;
	}

	public void setCVs(final Trip trip) {
		this.trip = trip;
	}

}
