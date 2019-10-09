import java.util.Scanner;
class NumberPlus
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int number = s.nextInt();
		int i = 1, totalsum=0;
		if (number < 1)
			System.out.println("잘못 입력하였습니다.");
		else{
			while ( i < number+1){
				totalsum += i;
				i++;
			}
			System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 "+totalsum+"입니다.");
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
	
}