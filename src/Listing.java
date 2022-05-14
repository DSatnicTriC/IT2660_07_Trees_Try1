// per exercise 30 it must be called this
public class Listing {

	// start of privates and encapsulated fields
	private String name; // key field
	private String idNumber;
	private String gradePointAverage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getGradePointAverage() {
		return gradePointAverage;
	}
	public void setGradePointAverage(String gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}
	// end  of privates and encapsulated fields
	
	public Listing(String name, String idNumber, String gradePointAverage) {
		this.name = name;
		this.idNumber = idNumber;
		this.gradePointAverage = gradePointAverage;
	}
	
	public String toString() {
		var toString = "Name: "
				+ this.name
				+ "\nId: "
				+ this.idNumber
				+ "\nGpa: "
				+ this.gradePointAverage;
		return toString;
	}
	
	public Listing deepCopy() {
		return new Listing(this.name, this.idNumber, this.gradePointAverage);
	}
	
	public int compareTo(String targetKey) {
		return this.name.compareTo(targetKey);
	}
}
