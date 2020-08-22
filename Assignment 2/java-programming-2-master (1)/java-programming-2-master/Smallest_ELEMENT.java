import java.util.Arrays;


class smallest_ELEMENT {

    public static int kthSmallest(Integer[] arr,
                                  int k)
    {

        Arrays.sort(arr);

        return arr[k - 1];
    }


    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 46,76,102,45,22 };
        int k = 2;
        System.out.print("K th smallest element is " + kthSmallest(arr, k));
    }
}