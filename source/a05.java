import java.util.Scanner;
class Day
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("날 수를 입력하세요.");
		int days = s.nextInt();
		int seconds = days*24*60*60;
		System.out.println("날 수에 해당되는 시간은 모두 "+seconds+" 초 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오.");
	}
}