package backjoon.직각삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        String answer="";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("0 0 0")) {
                break;
            }
            String[] nums = line.split(" ");
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            Arrays.sort(arr); //배열 정렬
            int x= arr[0]; int y=arr[1]; int z=arr[2];
            if(x*x+y*y==z*z) System.out.println("right");
            else System.out.println("wrong");
        }



    }
}
