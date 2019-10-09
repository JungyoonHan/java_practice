import java.util.Scanner;
class Age2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		int birth_year = s.nextInt();
		int age = 2014-birth_year+1;
		if (age < 20)
			System.out.println("미성년자입니다.");
		else
			System.out.println("미성년자가 아닙니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}