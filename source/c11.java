import java.util.Scanner;
class LeapYear2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("년도를 입력하세요.");
		int year = s.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			System.out.println("입력하신 년도는 윤년입니다.");
		else
			System.out.println("입력하신 년도는 윤년이 아닙니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}