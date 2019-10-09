import java.util.Scanner;
class File
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요.");
		int gigabytes = s.nextInt();
		int megabytes = gigabytes*1024;
		int kilobytes = megabytes*1024;
		long bytes = (long)kilobytes*1024;//왜 마이너스지?
		System.out.println("입력하신 파일 용량은\n"+megabytes+"메가바이트\n"+kilobytes+"킬로바이트\n"+bytes+"바이트 입니다.");
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}