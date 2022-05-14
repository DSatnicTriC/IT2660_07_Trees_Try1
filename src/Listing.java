// per exercise 30 it must be called this
public class Listing {

	// start of privates and encapsulated fields
	private String name;
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

}
