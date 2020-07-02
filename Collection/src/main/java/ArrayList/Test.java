package ArrayList;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author huzh
 * @date 2020/3/2915:09
 */
public class Test {

    public static void main(String[] args) {

        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();

        // 乱序的字符
        char[] chars = {'A', 'C', 'U', 'B', 'E', 'P', 'F', 'Z'};
        // 用Arrays工具类正序排列，也可以用冒泡排序
        Arrays.sort(chars);
        System.out.println(chars);
        StringBuffer sb = new StringBuffer(new String(chars));
        // 顺序反转
        sb.reverse();
        // 处理结果数组
        char[] c = new char[sb.length()];
        sb.getChars(0, sb.length(), c, 0);
        System.out.println(c);

        Map map = new ConcurrentHashMap();
    }
}
