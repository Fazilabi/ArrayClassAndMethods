public class HelperArray {
    //list[1,2,3,4,5]
    static  int[] copyList(int[] arr, int a){
        System.out.print("[");
        for (int i=0; i<a; i++){
            System.out.print(arr[i]);
            if (i<a-1){
                System.out.print(",");
            }else {
                System.out.print("");
            }

        }
        System.out.println("]");

        return arr;
    }

    static int[] myCopyRangeList(int[] arr, int from, int to){
        System.out.print("[");
        for (int i=from; i<to; i++){
            System.out.print(arr[i]);
            if (i<to-1){
                System.out.print(",");
            }else {
                System.out.print("");
            }
        }
        System.out.println("]");
        return arr;
    }
}
