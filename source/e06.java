import java.util.Scanner;
class MatrixMultiply
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int rows, columns, number, i, j;
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오 ");
		rows = scanner.nextInt();
		columns = scanner.nextInt();
		for (i = 1; i <= rows; i++){
			for (j = 1; j <= columns; j++){
				number = i*j;
				System.out.format("%4d",number); //또는 System.out.print(number+"\t");
			}
			System.out.println();
		}
		System.out.println("계속하려면 아무 키나 누르십시오. . .");
	}
}