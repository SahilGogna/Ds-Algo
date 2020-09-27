package interviewbit;

import java.util.*;

/**
 * This solution was failing some of the test cases
 */
public class Q140 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(27);
//        list.add(10);
//        list.add(15);
//        list.add(9);
//        list.add(90);

        list.add(12);
        list.add(121);
        System.out.print(largestNumber(list));
    }

    public static String largestNumber(final List<Integer> A) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int number : A) {
            int key = getStartingNumber(number);
            if (map.containsKey(key) && key!=0) {
                map.get(key).add(number);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(number);
                map.put(key, list);
            }
        }
        StringBuffer finalNumber = new StringBuffer();

        for (int i = 9; i >= 0; i--) {
            if (map.containsKey(i)) {
                List<Integer> mainList = map.get(i);
                List<Integer> nonZeroList = new ArrayList<>();
                List<Integer> zeroList = new ArrayList<>();

                for (int element : mainList) {
                    if (element % 10 == 0) {
                        zeroList.add(element);
                    } else {
                        nonZeroList.add(element);
                    }
                }

                Collections.sort(nonZeroList, new CustomComparator());

                for (int element : nonZeroList) {
                    finalNumber.append(element);
                }

                for (int element : zeroList) {
                    finalNumber.append(element);
                }
            }
        }
        return finalNumber.toString();
    }

    public static int getStartingNumber(int n) {
        int start = 0;
        while (n != 0) {
            start = n % 10;
            n = n / 10;
        }
        return start;
    }

    public static class CustomComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer x, Integer y) {
            return (y+""+x).compareTo(x+""+y);
        }
    }
}
