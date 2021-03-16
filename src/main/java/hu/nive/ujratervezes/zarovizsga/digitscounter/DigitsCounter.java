package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        Set<Character> characters = new HashSet<>();

        if(s == null || s.isEmpty()){
            return 0;
        }

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                characters.add(c);
            }
        }

        return characters.size();
    }
}
