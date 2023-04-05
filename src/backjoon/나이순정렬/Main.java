package backjoon.나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Men implements Comparable<Men> {
    int age;
    String name;

    Men(int  age, String name){
        this.age=age;
        this.name=name;
    }
    void print(){
        System.out.println(age + " "+ name);
    }
    public int compareTo(Men other) {
        return Integer.compare(this.age, other.age);
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Men> arr = new ArrayList<>();
        for(int i=0; i<n ; i++){
            String[] s = br.readLine().split(" ");
            int age = Integer.parseInt(s[0]);
            String name = s[1];
            arr.add(new Men(age,name));
        }
        Collections.sort(arr);
        for(Men m : arr){
            m.print();
        }

    }
}
