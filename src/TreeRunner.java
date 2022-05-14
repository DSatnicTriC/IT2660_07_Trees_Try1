public class TreeRunner {

	public static void main(String[] args) {
		var listing01 = new Listing("Daniel", 1, 3.5);
		var listing02 = listing01.deepCopy();
		listing02.setName(listing02.getName() + "HA");
		listing02.setIdNumber(listing02.getIdNumber() + 1);
		listing02.setGradePointAverage(listing02.getGradePointAverage() + 1);

		System.out.println("Listing01");
		System.out.println(listing01.toString());
		System.out.println("\n");
		System.out.println("Listing02");
		System.out.println(listing02.toString());
		System.out.println("\n");

		Integer comparison = listing02.compareTo(listing01.getName());

		if (comparison == 0) {
			System.out.println("The string is equal to the compared string");
		} else if (comparison < 0) {
			System.out.println("The string is lexicographically less than the other string");
		} else if (comparison > 0) {
			System.out.println("The string is lexicographically greater than the other string");
		}
	}
}