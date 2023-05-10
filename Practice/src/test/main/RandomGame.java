package test.main;


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        HashMap<Integer, String> map = new HashMap<>();
        int[] ranNum = new int[3];
        map.put(0, "cherry");
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "melon");
        map.put(4, "7");

        int hp = 100;
        int count = 1;

        System.out.println("랜덤게임에 오신걸 환영합니다!");
        System.out.println("목숨은 10개! 꽝이면 1개씩 줄어듭니다!");
        System.out.println("당첨시 목숨 X 10만원!");
        System.out.print("시작하시겠습니까? y/n > ");
        String play = sc.nextLine();
        if (play.equals("y")) {
           
            while (true) {
               
               System.out.println();
               System.out.println("Enter 를 치세요");
               sc.nextLine();
               
                hp = hp - 10;
                System.out.println(count + "번 게임");
                System.out.println("-----------------------------------");

                if (hp == 0) { // 목숨 소진 시 종료
                    System.out.println("목숨을 다 소진했습니다!");
                    System.out.println("다음 기회에!");
                    break;
                }

                for (int i = 0; i < 3; i++) { // 5 가지 중 3 개 받기
                    ranNum[i] = ran.nextInt(5);
                    System.out.print(map.get(ranNum[i]) + "\t");
                }

                if (ranNum[0] == ranNum[1] && ranNum[1] == ranNum[2]) { // 당첨 시 종료
                    System.out.println("\n 당첨!");
                    System.out.println("축하합니다!");
                    System.out.println("상금은 " + count * hp +"만원입니다!");
                    break;
                } else {
                    System.out.println("\n 꽝!");
                    System.out.println(hp + " 남았습니다!");
                    count++;
                }

                System.out.println("-----------------------------------");

            } // while
        } else {
            System.out.println("아쉬워요!");
            System.out.println("다음에 꼭 와요!");
        }
    } // main
} // class
