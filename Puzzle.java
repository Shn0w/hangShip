import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    String word;
    String s;
    ArrayList<String> wrongs;


    public Puzzle(){
        word = "skrrt";
        s = "";
        for(int i = 0; i<word.length(); i++){
            s+="_";
        }
        wrongs = new ArrayList<>();
    }

    public boolean isUnsolved(){
        return !word.equals(s);
    }

    public boolean makeGuess(String letter){
        if(letter.length()!=word.length() && letter.length()!=1) return true;
        letter = letter.toLowerCase();
        if(wrongs.contains(letter)){
            return true;
        }
        boolean a = false;
        for(int i = 0; i<word.length()-letter.length()+1; i++){
            if(word.substring(i, i+letter.length()).equals(letter)){
                s = s.substring(0, i) + letter + s.substring(i+letter.length());
                a = true;
            }
        }
        if(a){
            return a;
        }
        wrongs.add(letter);
        return a;
    }

    public String getWord(){
        return word;
    }
    
    public void show(){
        System.out.println(s);
        System.out.println();
        System.out.print("Wrongs Guesses: ");
        for(String s: wrongs){
            System.out.print(s + " ");
        }
    }
}
