//Vikel Cunningham

import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;

public class TreeSetUse{
    String[] words;    //the array which stores the words
    Scanner sc = new Scanner(System.in);
    TreeSet<String> set = new TreeSet<>();

    TreeSetUse(){                         // this is the consructor for the entering of the string & splitting the words up individually into an array
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        words = str.split(" ");
        setToList();        //calls to the setting to list.
        printList();        //calls to the print.
    }

        // this funtions puts the individual words into the TreeSet table as list.
    public void setToList(){    
        set.addAll(Arrays.asList(words));
    }

    public void printList(){        // this function allows the iteration through the set of words within the set & print each one
        for(String w : set){
            System.out.println(w);
        }
    }

    public static void main(String[] args){
        new TreeSetUse(); // this created a new Tree Set which runs through the constructor 
    }
}
