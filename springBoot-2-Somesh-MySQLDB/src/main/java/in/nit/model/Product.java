package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer prodId;

	private String prodCode;
	private Double prodCost;
	private String prodType;
	private String prodNote;

	private Double prodDiscount;
	private Double prodGst;

}
