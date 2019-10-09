import java.util.Scanner;
class Apart
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적을 입력하시오.");
		double m2_area = s.nextDouble();
		double pyung_area = Double.parseDouble(String.format("%.1f",m2_area/3.305));
		System.out.println("아파트의 평형은 "+pyung_area+" 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}