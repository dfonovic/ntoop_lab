package string;

import java.util.Random;
import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unos;
        unos = sc.nextLine();
        String [] rijeci = unos.split(" ");
        Random r = new Random();
        int izbaci = r.nextInt(rijeci.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rijeci.length; ++i){
            if (i!=izbaci){
                sb.append(rijeci[i] + " ");
            }
        } 
        System.out.println(sb);
    }
}
