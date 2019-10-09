import java.util.Scanner;
class Day3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오. ");
		int month = s.nextInt();
		System.out.print("일을 입력하시오. ");
		int day = s.nextInt();
		int day_count = 0;
		if (month == 1){
			day_count = day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 2){
			day_count = 31+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 3){
			day_count = 31+28+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 4){
			day_count = 31*2+28+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 5){
			day_count = 31*2+28+30+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 6){
			day_count = 31*3+28+30+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 7){
			day_count = 31*3+28+30*2+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 8){
			day_count = 31*4+28+30*2+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 9){
			day_count = 31*5+28+30*2+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 10){
			day_count = 31*5+28+30*3+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 11){
			day_count = 31*6+28+30*3+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else if (month == 12){
			day_count = 31*6+28+30*4+day;
			System.out.println("이 날짜는 1년 중 "+day_count+"번 쨰 날에 해당됩니다.");
		}
		else
			System.out.println("잘못 입력하셨습니다.");
		System.out.println("계속하려면 아무 키나 누르십시오.");
	}
}