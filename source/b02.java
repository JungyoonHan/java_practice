import java.util.Scanner;
class Degree2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하세요.");
		double input_degree = s.nextDouble();
		System.out.println("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요.");
		String kind = s.next();
		double output_degree;
		if (kind.equals("c") || kind.equals("C")){
			output_degree = input_degree*1.8+32;
			System.out.println("변환된 온도는 "+output_degree+" 입니다.");
		}
		else if (kind.equals("f") || kind.equals("F")){
			output_degree = (input_degree-32)/1.8;
			System.out.println("변환된 온도는 "+output_degree+" 입니다.");
		}
		else{
			System.out.println("키가 옳지 않습니다. 다른 키를 누르세요.");
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}