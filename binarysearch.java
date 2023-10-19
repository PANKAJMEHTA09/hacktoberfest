public class binarysearch {

    public static int binarysearch(int mark[], int kie) {
        int start = 0; // doubt hai yha pe mai mark[0] ku nhi likh skta ??????
        int end = mark.length - 1;
        while (start <= end) { // ye less than equal to isliye lgaya bcz end wala bada hai start wala chota or
                               // ye ascending order me hai...
            int mid = (start + end) / 2;
            if (kie == mark[mid]) {
                return mid;
            } else if (mark[mid] < kie) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String args[]) {

        int marks[] = { 54, 35, 67, 98, 21, 43 };
        int key = 67;

        int our = binarysearch(marks, key);
        System.out.println(our);

    }
}
