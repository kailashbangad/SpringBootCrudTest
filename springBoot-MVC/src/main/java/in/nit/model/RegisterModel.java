package in.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterModel {
	private Integer empId;
	private String empName;
	private String empSal;
	private String empGen;
	private String empPrj;
	private String empAddr;
	private String empLang,empDoj,empBrnch;

}
