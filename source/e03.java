import java.util.Scanner;
class SameTriangle{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("이등변 삼각형의 높이를 입력하시오. ");
		int height = s.nextInt();
		int h = height;
		for (int i = 0; i < height; i++){
			for (int j = 0; j < h-1; j++){
				System.out.print(" ");
			}
			h--;
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("계속하려면 아무 키나 누르십시오. . .");
	}
}