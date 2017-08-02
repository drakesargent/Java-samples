package chapter10;
/*Kenneth Drake-Sargent
 *Chapter 10
 *Programming Challenge 1
 *Test Scores
 */
public class TestScores {
	
	//class variable double array for scores
	double[] scores;
	
	//constructor for TestScores
	public TestScores(double[] s){
		//test each value of passed array
		for (int i = 0; i < s.length; i++){
			//if invalid score throw the error
			if(s[i]<0||s[i]>100){
				throw new IllegalArgumentException("Element: " + i + " Score: "+ s[i]);
			} else {
			//otherwise initialize scores value
				scores = s;
			}
		}
		
	}
	
	//method to compute and return the average
	public double getAverage(){
		double avg = 0.0;
		for (int i = 0; i < scores.length; i++){
			avg += scores[i];
		}
			avg = avg / scores.length;
		return avg;
	}

}
