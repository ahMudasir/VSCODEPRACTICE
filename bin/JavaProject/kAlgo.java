                package bin.JavaProject;
                import java.util.Scanner;

                public class kAlgo {
                    /*
                    It is used to find maximum sum subarray in array
                    */
            
                public static int maxSubarray(int arr[]){

                int maxSum =arr[0];
                int currSum =arr[0];

                for (int i = 1; i < arr.length; i++) {
                    currSum +=arr[i];
                // maxSum = Math.max(maxSum, currSum);
                    if (currSum>maxSum){
                        maxSum= currSum;
                    }
                    if (currSum<0){
                        currSum =0;
                    }
                }
                return maxSum;
            }

        public static void main(String[] args) {
        // maximum sub string

            int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

             int result = maxSubarray(arr);
            System.out.println("Maximum subarray sum " + result);
                }
        }
