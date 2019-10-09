import java.util.Scanner;
class Age3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		int birth_year = s.nextInt();
		int age = 2012-birth_year+1;
		if (age < 7)
			System.out.println("유아입니다.");
		else if((age >= 7) && (age < 13))
			System.out.println("어린이입니다.");
		else if ((age >= 13) && (age < 20))
			System.out.println("청소년입니다.");
		else if ((age >= 20) && (age < 30))
			System.out.println("청년입니다.");
		else if ((age >= 30) && (age < 60))
			System.out.println("중년입니다.");
		else
			System.out.println("노년입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}