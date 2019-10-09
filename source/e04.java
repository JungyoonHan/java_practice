import java.util.Scanner;
class Gugudan{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)를 입력하세요 ");
		int mode = s.nextInt();
		int odd = 3;
		int even = 2;
		if (mode==1){
			for (int i = 0; i < 4; i++){
				for (int j = 1; j <= 9; j++){
					System.out.print(odd+" x "+j+" = "+odd*j+"\t");
					if (j == 3 || j == 6 || j == 9)
						System.out.println();
				}
				System.out.println();
				odd += 2;
			}
		}
		else if (mode==2){
			for (int i = 0; i < 4; i++){
				for (int j = 1; j <= 9; j++){
					System.out.print(even+" x "+j+" = "+even*j+"\t");
					if (j == 3 || j == 6 || j == 9)
						System.out.println();
				}
				System.out.println();
				even += 2;
			}
		}
		System.out.println("계속하려면 아무 키나 누르십시오. . .");
	}
}