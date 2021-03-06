package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Story extends DomainEntity {

	//Constructors
	
	public Story(){
		super();
	}
	
	// Attributes
	
	private String title;
	private String pieceText;
	private Collection<String> link;

	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@NotBlank
	public String getPieceText() {
		return pieceText;
	}

	public void setPieceText(String pieceText) {
		this.pieceText = pieceText;
	}

	@URL
	@NotBlank
	public Collection<String> getLink() {
		return link;
	}
	
	public void setLink(Collection<String> link) {
		this.link = link;
	}
	
	// Relationships

	private Trip trip;
	private Explorer explorer;
	private Explorer writer;

	@Valid
	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	@Valid
	public Explorer getExplorer() {
		return explorer;
	}

	public void setExplorer(Explorer explorer) {
		this.explorer = explorer;
	}

	@Valid
	public Explorer getWriter() {
		return writer;
	}

	public void setWriter(Explorer writer) {
		this.writer = writer;
	}
}
