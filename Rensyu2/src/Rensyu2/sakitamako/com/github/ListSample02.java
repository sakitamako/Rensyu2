package Rensyu2.sakitamako.com.github;

import java.util.ArrayList;
import java.util.List;

public class ListSample02 {
	
	public static void main(String[] args) {
	        List<String> list = new ArrayList<String>();
	        
	        //値の記憶は　add メソッドを利用します
	        list.add("1");
	        list.add("2");
	        list.add("3");
	        list.add("4");
	        list.add("5");
	        
	        //値の取得
	        for (int i = 0; i < list.size(); i++) {
	            //値の取得は get メソッドを利用します
	            System.out.println(list.get(i));
	        }

	        //拡張 for 文を利用するともっと簡単です
	        for (String s : list) {
	            System.out.println(s); 
	    }
	        
	}

}
