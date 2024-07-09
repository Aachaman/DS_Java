import java.util.Stack;

public class Stackisfun{
    public static void main(String[] args) {
        
        Stack<String> games = new Stack<String>();
        games.add("A");
        games.add("b");
        games.add("c");
        games.add("d");

        games.pop();
        
        System.out.println(games.peek());
    }
}