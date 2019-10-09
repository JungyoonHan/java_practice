import java.util.Scanner;
class SumNumber
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int number, count = 0, totalsum = 0;
		double average;
		while(true){
			System.out.print("0부터 100 사이의 숫자를 입력하세요. ");
			number = s.nextInt();
			if (number < 0 || number > 100){
				break;
			}
			else{
				totalsum += number;
				count++;
				continue;
			}
		}
		average = Double.parseDouble(String.format("%.1f",(double)totalsum/count));
		System.out.println("입력한 "+count+" 개의 숫자들의 총 합계는 "+totalsum+" 이고, 평균 값은 "+average+" 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오. . .");
	}
}