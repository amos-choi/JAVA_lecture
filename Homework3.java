import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요?");
        int num1 = scan1.nextInt();
        int[] Numlist = new int[num1]; //정의 헷갈리지 않기. 배열은 int[]이 먼저다..!!

        for (int i = 0; i < num1; i ++){
            System.out.print("수를 입력하세요.");
            Numlist[i] = scan1.nextInt();
        }

        int[] Finallist = versusNum(Numlist);

        System.out.println("최댓값:" + Finallist[0]);
        System.out.println("최솟값:" + Finallist[1]);

        scan1.close(); //이거 꼭 쓰는 연습해야할듯ㅠㅜㅠ 인도 형님이 이거 쓰는습관 들이라고함...
    }

    public static int[] versusNum(int[] Numlist){
        int bigNum= Numlist[0];
        int smallNum = Numlist[0];
        for (int i = 0; i < Numlist.length; i ++){
            if (Numlist[i] < smallNum)
                smallNum = Numlist[i];
            if (Numlist[i] > bigNum)
                bigNum = Numlist[i];
        }
        return new int[]{bigNum, smallNum};
    }
}

