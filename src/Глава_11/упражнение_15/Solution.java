package Глава_11.упражнение_15;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by andrej on 01.02.17.
 */
public class Solution {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();

        LinkedList<String> linkedList = new LinkedList<>();

        for (String s:"+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".split("") ) {
            linkedList.add(s);
        }

        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();

            if(s.equals("+"))
                stringStack.push(iterator.next());
            if (s.equals("-")) {
                System.out.print(stringStack.pop());
            }
        }

    }
}
