package backjoon.직사각형에서탈출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        int result =cal(x,y,w,h);
        System.out.println(result);

    }

    private static int cal(int x, int y, int w, int h) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(x);
        arr.add(y);
        arr.add(w-x);
        arr.add(h-y);
        Iterator<Integer> iter = arr.iterator();
        Collections.sort(arr); // 오름차순으로 정렬
        return arr.get(0);

    }
}
