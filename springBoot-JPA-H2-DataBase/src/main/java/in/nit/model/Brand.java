package in.nit.model;

public class Brand {
	private String brandName;
	private Integer brandId;
	public Brand(String brandName, Integer brandId) {
		super();
		this.brandName = brandName;
		this.brandId = brandId;
	}
	public Brand() {
		super();
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	@Override
	public String toString() {
		return "Brand [brandName=" + brandName + ", brandId=" + brandId + "]";
	}
	
	

}
