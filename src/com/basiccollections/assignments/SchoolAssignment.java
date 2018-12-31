/*Create classes for the below objects with the fields specified below.
Create three different instances for each type and add them to a collection.
Now, read from these collection and print each attribute in console.

School : name, city, school district, greatSchoolRanking

Observe that Set doesn’t accept duplicate objects by writing an displaying the elements in collection.
For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact that Set doesn’t accept duplicates (through equals() and hashCode()).

School : name, city and school district together define equality


Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection is maintaining the order that you add.

Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection keeps these elements in a natural order.

Create a simple map to store all of our class students’ names and their favorite fruits. Try to get their favorite fruit by giving their name. Also, list all the names and their favorite fruits saperately.
*/

package com.basiccollections.assignments;

public class SchoolAssignment {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;
	public SchoolAssignment(String name, String city, String schoolDistrict,
			int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchoolDistrict() {
		return schoolDistrict;
	}
	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + greatSchoolRanking;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
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
		SchoolAssignment other = (SchoolAssignment) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (greatSchoolRanking != other.greatSchoolRanking)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict="
				+ schoolDistrict + ", greatSchoolRanking=" + greatSchoolRanking
				+ "]";
	}
	

}
