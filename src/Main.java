import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {5, 2, 1, -4, 6, 8, -2, 18, 11};
        //
        // Arrays.sort(list1);

        System.out.println(Arrays.toString(list1));
        double[] list2 = {2.2, 5.2, 9.568, 6.4826};
        //System.out.println(Arrays.toString(list2));
        //Arrays.fill(list1, 1, 3, 5);

        int[] copyList = Arrays.copyOf(list1, 15);
        //System.out.println(Arrays.toString(copyList));

        HelperArray helperArray = new HelperArray();
        helperArray.copyList(list1, 6);

        helperArray.myCopyRangeList(list1, 2, 5);




    }
}