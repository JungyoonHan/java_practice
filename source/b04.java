import java.util.Scanner;
class Apart2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오.");
		double m2_area = s.nextDouble();
		double pyung_area = Double.parseDouble(String.format("%.1f",m2_area/3.305));
		System.out.println("아파트의 평형은 "+pyung_area+" 이고,");
		if (pyung_area<30)
			System.out.println("30평 미만이므로 작은 아파트입니다.");
		else
			System.out.println("30평 이상이므로 큰 아파트입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}