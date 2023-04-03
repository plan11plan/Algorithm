package backjoon.블랙잭;

import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //N장의 카드 중에서 3장의 카드를 골라야 한다.
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(i,scanner.nextInt());
        }

        int result =0; // 전단계.

        for(int i=0;i<=n-3;i++){
            for(int j=i+1; j<=n-2;j++){
                for(int k=j+1; k<=n-1; k++){

                    int temp= arr.get(i)+arr.get(j)+arr.get(k); // 현재

                    if(target==temp){
                        result=temp;
                    }
                    // 그전
                    if( result<temp && temp <target){ //전단계 < 현재 < 목표
                        result=temp;
                    }
                }
            }
        }
        System.out.println(result);
    }


}