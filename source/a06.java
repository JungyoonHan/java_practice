import java.util.Scanner;
class Score
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요.");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		int math = s.nextInt();
		int total = kor+eng+math;
		double average = Double.parseDouble(String.format("%.1f",total/3.0));
		System.out.println("입력하신 점수의 총점은 "+total+" 이고,");
		System.out.println("평균은 "+average+" 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오.");
	}
}