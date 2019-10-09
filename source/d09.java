import java.util.Scanner;
class Gugudan
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while (true){
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9). ");
			int dan = s.nextInt();
			if ((dan < 2) || (dan > 9))
				System.out.println("잘못입력하였습니다.");
			else{
				for (int i = 1; i < 10; i++){
					System.out.println(dan+" x "+i+" = "+dan*i);
				}
				break;
			}
			//System.out.println("계속하려면 아무 키나 누르십시오...);
		}	
		System.out.println("계속하려면 아무 키나 누르십시오...");	
		
	}
}