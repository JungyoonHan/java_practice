import java.util.Scanner;
class Day2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("날수를 입력하세요.");
		int days = s.nextInt();
		int seconds = days*24*60*60;
		System.out.println("날수에 해당되는 기간은 "+seconds+" 초 입니다.");
		if (seconds<1000000)
			System.out.println("계속하려면 아무 키나 누르십시오.");
		else{
			int m_count = seconds/1000000;
			System.out.println("100만 초가 모두 "+m_count+"번이나 포함됩니다.");
			System.out.println("계속하려면 아무 키나 누르십시오.");
		}
	}
}