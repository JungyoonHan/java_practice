import java.util.Scanner;
class YearCount
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int count_young = 0;
		System.out.print("가족이 몇 명인지 입력하세요 ");
		int count_all = s.nextInt();
		for (int i = count_all; i > 0; i--){
			System.out.print("태어난 년도를 입력하세요 ");
			int birth_year = s.nextInt();
			int age = 2014-birth_year+1;
			if (age < 20)
				count_young++;
		}
		System.out.println("가족들 중에 미성년자는 모두 "+count_young+"명 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}