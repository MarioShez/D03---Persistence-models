package domain;

import org.hibernate.validator.constraints.Range;

public class Gps {

	private Double latitude;
	private Double longitude;

	@Range(min=-90, max=90)
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Range(min=-180, max=180)
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
