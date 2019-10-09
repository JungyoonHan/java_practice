import java.util.Scanner;
class File2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요.");
		int megabytes = s.nextInt();
		System.out.print("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요.");
		String usb2 = s.next();
		long bytes = (long)megabytes*1024*1024;
		int time;
		if (usb2.equals("Y") || usb2.equals("y")){
			time = (int)bytes/60000000;
			System.out.println("파일 전송 시간은 "+time+" 초 입니다.");
		}
		else if (usb2.equals("N") || usb2.equals("n")){
			time = (int)bytes/1500000;
			System.out.println("파일 전송 시간은 "+time+" 초 입니다.");
		}
		else{
			System.out.println("키를 잘못 누르셨습니다.");
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}