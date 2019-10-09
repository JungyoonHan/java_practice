import java.util.Scanner;
class Score3
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
		System.out.println("입력하신 점수의 총점은 "+total+" 이고,\n평균은 "+average+" 입니다.");
		if (average >= 90)
			System.out.println("수 입니다.");
		else if ((average >= 80) && (average < 90))
			System.out.println("우 입니다.");
		else if ((average >= 70) && (average < 80))
			System.out.println("미 입니다.");
		else if ((average >= 60) && (average < 70))
			System.out.println("양 입니다.");
		else
			System.out.println("가 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}