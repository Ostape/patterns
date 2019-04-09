package com.robosh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().logic();
    }

    private void logic(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(input.substring(1, 4));
        rec(input,0,0);
       // implement(input);
    }

    public void k(String str){
        List<Integer> savedLeft = new ArrayList<Integer>();
        List<Integer> savedRight = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++){
            if (str.indexOf("(", i) != -1){
                savedLeft.add(i);
            }
            if (str.indexOf(")", i) != -1){
                savedRight.add(i);
            }
        }
        do {
            if (savedLeft.isEmpty()){
                break;
            }
            for (int i = 0; i < savedLeft.size(); i++) {
                for (int j = 0; j < savedRight.size(); j++){
                    if (savedLeft.get(i) > savedRight.get(j)) {
                        System.out.println(str.substring(savedLeft.get(i-1), savedRight.get(j)));
                        savedLeft.remove(i-1);
                        savedRight.remove(j);
                    }
                }
            }
        }while (true);

    }

    public void implement(String str){
        int startParenth = str.indexOf("(")+1;
        int endsParenth = str.indexOf(")");
        System.out.println(str.substring(startParenth, endsParenth));
    }


    public int rec(String str,int k, int right){
        if(str.indexOf("(", k) >= 0){
            k = str.indexOf("(", k);
            right = rec(str, k+1, right);
            System.out.println(str.substring(k,right+1));
        }

        if (str.indexOf(")", right) > k){
            return str.indexOf(")", right);
        }
        else if (str.indexOf(")", right) < k && str.indexOf(")", right) != -1){
            right = str.indexOf(")", right);
            rec(str,k, right+1);
            return right;
        }

        return k;
    }
}
