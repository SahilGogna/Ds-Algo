package interviewbit;


import java.util.ArrayList;

public class Q142 {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(0);
        l.add(4);
        l.add(4);
        l.add(6);
        l.add(0);
        l.add(9);
        l.add(6);
        l.add(5);
        l.add(1);

        System.out.print(plusOne(l));
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> list) {
        int size = list.size();
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 1; i < size; i++) {
            newList.add(0);
        }

        newList.add(1);

        int[] testList = new int[size];

        int carry = 0;
        for (int i = size - 1; i >= 0; i--) {
            int element = list.get(i);
            int auxElement = newList.get(i);

            int answer = carry + element + auxElement;

            carry = answer / 10;

            testList[i] = answer % 10;
        }
        ArrayList<Integer> finalList = new ArrayList<>();
        if (carry != 0) {
            finalList.add(carry);
            int k = 0;
            while (k < size) {
                finalList.add(testList[k]);
                k++;
            }

        } else {
            int pointer = 0;
            for (int i = 0; i < size; i++) {
                if(testList[i] != 0){
                    pointer++;
                    break;
                }else{
                    pointer++;
                }
            }
            for (int i = pointer-1; i < size; i++) {
                finalList.add(testList[i]);
            }
        }
        return finalList;
    }
}
