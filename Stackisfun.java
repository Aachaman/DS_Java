import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Stackisfun{
    public static void main(String[] args) {
        
        Stack<String> games = new Stack<String>();
        games.push("A");
        games.push("b");
        games.add("c");
        games.add("d");

        games.pop();
        
        System.out.println(games.peek());
        System.out.println(games.empty());
        System.out.println(games.search("c"));


        System.out.println(games.size());
        
        games.sort(null);


    }
}