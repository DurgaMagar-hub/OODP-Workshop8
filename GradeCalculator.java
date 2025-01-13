public class GradeCalculator {
    public int calculateGrade(int marks) {
		if (marks >= 90) {
			return 10;
		} else if (marks >= 80) {
			return 9;
		} else if (marks >= 70) {
			return 8;
		} else if (marks >= 60) {
			return 7;
		} else if (marks >= 50) {
			return 6;
		} else {
			return 5;
		}
	}
}
