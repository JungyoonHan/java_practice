import java.util.Scanner;
class Apart3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오.");
		double m2_area = s.nextDouble();
		double pyung_area = Double.parseDouble(String.format("%.1f",m2_area/3.305));
		System.out.println("아파트의 평형은 "+pyung_area+" 입니다.");
		if (pyung_area < 15)
			System.out.println("소형 아파트 입니다.");
		else if ((pyung_area >= 15) && (pyung_area < 30))
			System.out.println("중소형 아파트 입니다.");
		else if ((pyung_area >= 30) && (pyung_area < 50))
			System.out.println("중형 아파트 입니다.");
		else
			System.out.println("대형 아파트 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오.");
	}
}