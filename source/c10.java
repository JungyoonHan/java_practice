import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("숫자1 을 입력하시오.");
		int num1 = s.nextInt();
		System.out.print("숫자2 를 입력하시오.");
		int num2 = s.nextInt();
		System.out.print("연산기호문자('+', '-', '*', '/' 중 1개)를 입력하세요.");
		String operator = s.next();
		int result = 0;
		if (operator.equals("+"))
			result = num1+num2;
		else if (operator.equals("-")){
			if (num1>=num2)
				result = num1-num2;
			else
				result = num2-num1;
		}
		else if (operator.equals("*"))
			result = num1*num2;
		else if (operator.equals("/")){
			if (num1>=num2)
				result = num1/num2;
			else
				result = num2/num1;
		}
		System.out.println("계산식의 결과 값은 "+ result +"입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오.");
	}
}