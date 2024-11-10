package com.das.arthmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
	public static String removeCharacters(String a, String b) {
        return a.chars().filter(ch -> b.indexOf(ch) == -1) .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
        
    }

    public static void main(String[] args) {
        String a = "AABB";
        String b = "AB";
        System.out.println(removeCharacters(a, b)); // Output: "he wrd"
        
         List<Integer> v = new ArrayList<>();
    }
    
    
    	
}
