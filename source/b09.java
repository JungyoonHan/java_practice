import java.util.Scanner;
class Kilogram
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("신장(cm단위)을 입력하세요.");
		int height = s.nextInt();
		double dheight = height/100.0;
		System.out.print("체중(kg단위)을 입력하세요.");
		int weight = s.nextInt();
		double bmi = weight/(dheight*dheight); //int bmi라고 쓰여있는데?
		if (bmi >= 25){
			System.out.println("당신은 비만이십니다.");
		}
		else
			System.out.println("당신은 비만이 아니군요.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}