import java.util.Scanner;
class Degree
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("섭씨 온도를 입력하시오.");
		double c_degree = s.nextDouble();
		double f_degree = c_degree*1.8+32;
		System.out.println("화씨 온도는 "+f_degree+" 도 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}