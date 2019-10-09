import java.util.Scanner;
class Age
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		int birth_year = s.nextInt();
		int age;
		age = 2014-birth_year+1;
		System.out.println("당신의 나이는 "+age+" 입니다.\n");
		System.out.println("계속하려면 아무 키나 누르십시오. . .");
	}
}