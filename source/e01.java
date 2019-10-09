import java.util.Scanner;
class Square5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("정사각형의 크기를 입력하시오. ");
		int length = s.nextInt();
		for (int i=0; i<length; i++ ){
			for (int j=0; j<length; j++){
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}