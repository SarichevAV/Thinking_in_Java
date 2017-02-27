package Глава_9.упражнение_13;

/**
 * Created by andrej on 26.01.17.
 */
public interface base {
}

interface impl_1 extends base{}
interface impl_2 extends base{}

interface impl extends impl_1,impl_2 {}

