import java.util.Scanner;
class Square2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하세요.");
		int width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하세요.");
		int height = s.nextInt();
		int area = width*height;
		System.out.println("직사각형의 넓이는 "+area+" 이고,");
		if (width==height)
			System.out.println("정사각형입니다.");
		else
			System.out.println("정사각형이 아닙니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}