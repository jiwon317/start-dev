package hello_world;

public class LogicalOperatorExam {
	public boolean isAgeDiscountable(int age) {
		boolean isDiscount = false;
		if( age <= 19 || age >= 60) {
			isDiscount = true;
			
		}else {
			isDiscount = false;
		}
	return isDiscount;
	}
	
	public static void main(String[] args){
		LogicalOperatorExam exam = new LogicalOperatorExam();
		System.out.println(exam.isAgeDiscountable(15));
		System.out.println(exam.isAgeDiscountable(27));
		System.out.println(exam.isAgeDiscountable(61));
	}
	
}
