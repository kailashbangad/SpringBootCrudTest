package in.nit.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
public class Customer {
	
	@Id
	@Column
	 private Integer id;
	@Column
	 private String email;
	@Column
	 private String name;
	 
	 public Customer() {
		super();
	}

	public Customer(Integer id, String email, String name) {
			super();
			this.id = id;
			this.email = email;
			this.name = name;
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + "]";
	}

}
