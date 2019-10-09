import java.util.Scanner;
class Function2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("2차 함수 y=ax^2+bx+c의 계수 a와 b, c를 입력하시오. ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오. ");
		int x_begin = s.nextInt();
		int x_end = s.nextInt();
		for (int x = x_begin; x <= x_end; x++){
			int y = a*x*x+b*x+c;
			System.out.println("좌표 ("+x+", "+y+")");
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}