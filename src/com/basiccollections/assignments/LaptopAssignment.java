/*Create classes for the below objects with the fields specified below.
Create three different instances for each type and add them to a collection.
Now, read from these collection and print each attribute in console.

Laptop : company, model, operatingSystem, processor

Observe that Set doesn’t accept duplicate objects by writing an ddisplaying the elements in collection.
For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact that Set doesn’t accept duplicates (through equals() and hashCode()).


Company and model  together define the equality for Laptop. If two laptops have same company and model then they are equal.
*/

package com.basiccollections.assignments;

public class LaptopAssignment {
	private String name;
	private String model;
	private String operatingSystem;
	private String processor;
	
	public LaptopAssignment(String name, String model, String operatingsystems,
			String processor) {
		super();
		this.name = name;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
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
		LaptopAssignment other = (LaptopAssignment) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		return true;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingsystems() {
		return operatingSystem;
	}
	public void setOperatingsystems(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}


	@Override
	public String toString() {
		return "Laptop [name=" + name + ", model=" + model
				+ ", operatingSystem=" + operatingSystem + ", processor="
				+ processor + "]";
	}
	
	

}
