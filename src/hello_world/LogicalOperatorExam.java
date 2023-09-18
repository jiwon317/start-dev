package hello_world;

public class LogicalOperatorExam {
	public boolean isAgeTwenties(int age) {
		boolean isTwenties = false;
		if(age < 30 && age > 19) {
			isTwenties = true;
		}else {
			isTwenties = false;
		}
		
		return isTwenties;
	}
	
	public static void main(String[] args){
		LogicalOperatorExam exam = new LogicalOperatorExam();
		System.out.println(exam.isAgeTwenties(19));
		System.out.println(exam.isAgeTwenties(25));
		System.out.println(exam.isAgeTwenties(30));
		
	}
}
