import java.util.Scanner;
class File3
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요 ");
		int megabytes = scanner.nextInt();
		long bytes = megabytes*1024*1024;
		System.out.print("전송방식을 1: Wi-Fi, 2: Bluetooth, 3: LTE, 4: USB 에서 선택하여 입력하세요 ");
		byte kind = scanner.nextByte();
		double time = 0;
		if (kind == 1)
			time = bytes/1500000.0;
		else if (kind == 2)
			time = bytes/300000.0;
		else if (kind == 3)
			time = bytes/1000000.0;
		else if (kind == 4)
			time = bytes/60000000.0;
		System.out.format("파일 전송 시간은 %.1f 초 입니다.\n",time);
		System.out.println("계속하려면 아무 키나 누르십시오. . .");
	}
}