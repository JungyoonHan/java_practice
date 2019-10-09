import java.util.Scanner;
class MaxMin2
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int max=0, min=100;
    while (true){
      System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
      int number = s.nextInt();
      if ((number > 0) && (number < 100)){
        if (number > max)
          max = number;
        else if (number < min)
          min = number;
      }
      else break;
    }
    System.out.println("입력된 숫자들 중 가장 큰 수는 "+max+"이고, 가장 작은 수는 "+min+"입니다.");
    System.out.println("계속하려면 아무 키나 누르십시오.");
  }
}
