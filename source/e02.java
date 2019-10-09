import java.util.Scanner;
class Triangle
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
		int height = s.nextInt();
		int blank = s.nextInt();
		for (int i=0; i<height; i++){
			for (int j = 0; j < height+blank; j++){
				System.out.print(" ");
			}
			blank--;
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}