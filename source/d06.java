import java.util.Scanner;
class Apart4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int count1=0, count2=0, count3=0, count4=0;
		for (int i=0; i < 10; i++){
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오. ");
			double m2_area = s.nextDouble();
			double pyung_area = Double.parseDouble(String.format("%.1f",m2_area/3.305));
			System.out.println("--> 이 아파트의 평형은 "+pyung_area+" 입니다.");
			if (pyung_area < 15)
				count1++;
			else if (pyung_area >= 15 && pyung_area < 30)
				count2++;
			else if (pyung_area >= 30 && pyung_area < 50)
				count3++;
			else
				count4++;
		}
		System.out.println("\"소형 아파트\"의 개수는 "+count1+" 입니다.");
		System.out.println("\"중소형 아파트\"의 개수는 "+count2+" 입니다.");
		System.out.println("\"중형 아파트\"의 개수는 "+count3+" 입니다.");
		System.out.println("\"대형 아파트\"의 개수는 "+count4+" 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}