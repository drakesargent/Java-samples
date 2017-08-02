package chapter9;
/*Kenneth Drake-Sargent
 *Chapter 9
 *Programming Challenge 5
 *CourseGrades
 */

public class CourseGrades {
	
	// declare object variables for the different tests
	GradedActivity lab;
	PassFailActivity pfexam;
	Essay essay;
	FinalExam finalExam;
	
	//no args constructor
	CourseGrades(){
	
	}
	
	//mutator classes for the tests
	void setLab(GradedActivity ga){
	lab = ga;
	}
	
	void setPassFailExam(PassFailExam pfe){
	pfexam = pfe;
	}
	
	void setEssay(Essay e){
	essay = e;
	}
	
	void setFinalExam(FinalExam fe){
	finalExam = fe;
	}
	
	//overriding toString Method for this class
	public String toString(){
		String courseScores ="";
		courseScores += "Lab Score:\t\t"+lab.getScore()+"\tGrade: "+lab.getGrade()+"\n";
		courseScores += "Pass/Fail Exam Score:\t"+pfexam.getScore()+"\tGrade: "+pfexam.getGrade()+"\n";
		courseScores += "Essay Score:\t\t"+essay.getScore()+"\tGrade: "+essay.getGrade()+"\n";
		courseScores += "Final Exam Score:\t"+finalExam.getScore()+"\tGrade: "+finalExam.getGrade()+"\n";
		return courseScores;
	}
}
