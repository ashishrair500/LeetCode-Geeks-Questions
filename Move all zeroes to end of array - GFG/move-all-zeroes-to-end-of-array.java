//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        /*
               int index=0;
        for(int i=1; i<nums.length; i++){
if(nums[index]==0 && nums[i]!=0){
     int temp=nums[index];
     nums[index]=nums[i];
     nums[i]=temp;
     index++;
}else if (nums[index]!=0)
index++;*/
//second aproach

int fillIndex = 0;
        int i = 0;
        while(i<n){
            if(arr[i] != 0){
                arr[fillIndex++] = arr[i];
            }
            i++;
        }
        
        while(fillIndex<n){
            arr[fillIndex] = 0;
            fillIndex++;
        }

        }
    
}