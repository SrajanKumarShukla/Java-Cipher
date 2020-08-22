import java.util.*;

class Replace_Arr_By_Rank {


    static void changeArr(int[] input)
    {

        int newArray[]
                = Arrays
                .copyOfRange(input,
                        0,
                        input.length);


        Arrays.sort(newArray);
        int i;


        Map<Integer, Integer> ranks
                = new HashMap<>();

        int rank = 1;

        for (int index = 0;
             index < newArray.length;
             index++) {

            int element = newArray[index];


            if (ranks.get(element) == null) {

                ranks.put(element, rank);
                rank++;
            }
        }

        
        for (int index = 0;
             index < input.length;
             index++) {

            int element = input[index];
            input[index]
                    = ranks.get(input[index]);

        }
    }


    public static void main(String[] args)
    {

        int[] arr = { 99,88,77,66 };

        changeArr(arr);


        System
                .out
                .println(Arrays
                        .toString(arr));
    }
}