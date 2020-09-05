package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
@Id
private Integer prodId;
private String prodCode;
private String prodName;
private double prodCost;
//Id (PK) based constructor
public Product(Integer prodId) {
super();
this.prodId = prodId;
}
//Parameterized constructor
public Product(String prodName, double prodCost, String prodCode) {
super();
this.prodName = prodName;
this.prodCost = prodCost;
this.prodCode = prodCode;
}
public Product(Integer prodId, String prodName, double prodCost, String prodCode)
{
super();
this.prodId = prodId;
this.prodName = prodName;
this.prodCost = prodCost;
this.prodCode = prodCode;
}

}
