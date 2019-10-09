import java.util.Scanner;
class WaterDegree
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("물의 온도를 입력하세요.");
		double input_degree = s.nextDouble();
		if (input_degree < 0)
			System.out.println("잘못입력하셨습니다.");
		else if ((input_degree >= 0) && (input_degree < 25))
			System.out.println("냉수입니다.");
		else if ((input_degree >= 25) && (input_degree < 40))
			System.out.println("미온수입니다.");
		else if ((input_degree >= 40) && (input_degree < 80))
			System.out.println("온수입니다.");
		else
			System.out.println("끓는 물 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오.");
	}
}