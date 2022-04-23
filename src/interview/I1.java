package interview;

public class I1 {

    public static void main(String[] args) {

        int arr [] = {2,5,4,-1,1,7};

        int istenenToplam = 6;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]+arr[j] == istenenToplam){
                    System.out.println(arr[i]+" ve " +arr[j]+" = "+istenenToplam);
                }
            }
        }
    }
}
