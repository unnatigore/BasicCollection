

package com.basiccollections.assignments;

public class TelevisionAssignment {
	private String company;
	private String type;
	private double price;
	private boolean threeDEnabled;
	public TelevisionAssignment(String company, String type, double price,
			boolean threeDEnabled) {
		super();
		this.company = company;
		this.type = type;
		this.price = price;
		this.threeDEnabled = threeDEnabled;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isThreeDEnabled() {
		return threeDEnabled;
	}
	public void setThreeDEnabled(boolean threeDEnabled) {
		this.threeDEnabled = threeDEnabled;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (threeDEnabled ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelevisionAssignment other = (TelevisionAssignment) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (threeDEnabled != other.threeDEnabled)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TelevisionAssignment [company=" + company + ", type=" + type
				+ ", price=" + price + ", threeDEnabled=" + threeDEnabled + "]";
	}
	
	
	
	
	
}	