import java.util.Scanner;
class Number
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요.");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요.");
		int num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요.");
		int num3 = s.nextInt();
		if ((num1 == num2) || (num1 == num3) || (num2 == num3)){
			System.out.println("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 합이 같다.");
		}
		if (((num1 > 50) && (num2 > 50)) || ((num1 > 50) && (num3 > 50)) || ((num2 > 50) && (num3 > 50))){
			System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50보다 크다.");
		}
		if ((num1+num2 == num3) || (num1+num3 == num2) || (num2+num3 == num1)){
			System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.");
		}
		if (((num1%num2 == 0) && (num3%num2 == 0)) || ((num1%num3 == 0) && (num2%num3 == 0)) || ((num2%num1 == 0) && (num3%num1 == 0))){
			System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.");
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}