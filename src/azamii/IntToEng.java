package azamii;

import java.util.Scanner;

public class IntToEng {
	
	// メインメソッド

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

   // static String translateEng(int n) {
    	
    	//String[] s = ;
    	
    	
    	/*if(n==0){
    		return "zero";
    	}else if(n==1){
    		return "one";
    	}else if(n==2){
    		return "two";
    	}else if(n==3){
    		return "three";
    	}else if(n==4){
    		return "four";
    	}else if(n==5){
    		return "five";
    	}else if(n==6){
    		return "six";
    	}else if(n==7){
    		return "seven";
    	}else if(n==8){
    		return "eight";
    	}else if(n==9){
    		return "nine";
    	}else if(n==10){
    		return "ten";
    	}*/

      //  return "";

   // }
    static  String translateEng(int n){//一の位
    	String no = " ";
    	switch(n){
    	
    	case 0: no= "zero";
    	case 1: no= "one";
    	case 2: no= "two";
    	case 3: no= "three";
    	case 4: no= "four";
    	case 5: no= "five";
    	case 6: no= "six";
    	case 7: no= "seven";
    	case 8: no= "eight";
    	case 9: no= "nine";
    	
    	
    	}
    	
    	
    }
   

}
    
