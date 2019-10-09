import java.util.Scanner;
class Square
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오.");
		int width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오.");
		int height = s.nextInt();
		int area = width*height;
		System.out.println("직사각형의 넓이는 "+area+" 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}