package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Emergency extends DomainEntity{

	//Constructors
	
	public Emergency(){
		super();
	}
	
	// Attributes
	
	private String name;
	private String email;
	private String phoneNumber;
	
	@NotBlank
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	@Pattern(regexp = "[+][1-9]{1,3} [(][1-9]{1,3}[)] [0-9]{4,}")
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	// Relationships
	
	private Explorer explorer;
	
	@Valid
	public Explorer getExplorer(){
		return explorer;
	}
	
	public void setExplorer(Explorer explorer){
		this.explorer = explorer;
	}

}
