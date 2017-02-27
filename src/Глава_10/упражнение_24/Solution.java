package Глава_10.упражнение_24;

/**
 * Created by andrej on 29.01.17.
 */
public class Solution {
    class inClass extends withInner.Inner{
        public inClass(withInner withInner, int i) {
            withInner.super(i);
        }
    }
}
