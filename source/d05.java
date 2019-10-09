import java.util.Scanner;
class Square4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int count1=0, count2=0, count3=0, count4=0, count5=0;
		while (true){
			System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오. : ");
			int width = s.nextInt();
			int height = s.nextInt();
			if ((width <= 0) || (height <= 0))
				break;
			else{
				if (width==height)
					count1++;
				else if (width >= height*2)
					count2++;
				else if (width*2 <= height)
					count3++;
				else if (width > height)
					count4++;
				else if (width < height)
					count5++;
			}
		}
		System.out.println("\"정사각형\"의 개수는 "+count1+" 입니다.");
		System.out.println("\"좌우로 길쭉한 직사각형\"의 개수는 "+count2+" 입니다.");
		System.out.println("\"위아래로 길쭉한 직사각형\"의 개수는 "+count3+" 입니다.");
		System.out.println("\"일반적인 가로형 직사각형\"의 개수는 "+count4+" 입니다.");
		System.out.println("\"일반적인 세로형 직사각형\"의 개수는 "+count5+" 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}