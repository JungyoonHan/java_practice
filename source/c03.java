import java.util.Scanner;
class Square3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오.");
		int width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오.");
		int height = s.nextInt();
		if (width==height)
			System.out.println("정사각형입니다.");
		else if (width >= (height*2))
			System.out.println("좌우로 길쭉한 직사각형입니다.");
		else if (height >= (width*2))
			System.out.println("위아래로 길쭉한 직사각형입니다.");
		else if (width > height)
			System.out.println("일반적인 가로형 직사각형입니다.");
		else if (height > width)
			System.out.println("일반적인 세로형 직사각형입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}