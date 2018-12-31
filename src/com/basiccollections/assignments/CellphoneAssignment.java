/*Create classes for the below objects with the fields specified below.
Create three different instances for each type and add them to a collection.
Now, read from these collection and print each attribute in console.

CellPhone : company, model, description, operatingSstem, price

Observe that Set doesn’t accept duplicate objects by writing an ddisplaying the elements in collection.
For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact that Set doesn’t accept duplicates (through equals() and hashCode()).

CellPhone : company, model and operatingSstem together define equality*/

package com.basiccollections.assignments;

public class CellphoneAssignment {
	private String company;
	private String modelnumber;
	private String description;
	private String operatingSystems;
	private double price;
	public CellphoneAssignment(String company, String modelnumber, String description,
			String operatingSystems, double price) {
		super();
		this.company = company;
		this.modelnumber = modelnumber;
		this.description = description;
		this.operatingSystems = operatingSystems;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((modelnumber == null) ? 0 : modelnumber.hashCode());
		result = prime
				* result
				+ ((operatingSystems == null) ? 0 : operatingSystems.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CellphoneAssignment other = (CellphoneAssignment) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (modelnumber == null) {
			if (other.modelnumber != null)
				return false;
		} else if (!modelnumber.equals(other.modelnumber))
			return false;
		if (operatingSystems == null) {
			if (other.operatingSystems != null)
				return false;
		} else if (!operatingSystems.equals(other.operatingSystems))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", modelnumber=" + modelnumber
				+ ", description=" + description + ", operatingSystems="
				+ operatingSystems + ", price=" + price + "]";
	}
	
	
	

}
