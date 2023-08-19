//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        Map<Character,Integer> m =new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            
           if(m.containsKey(s.charAt(i))){ 
               
               if( m.get(s.charAt(i))<0)
                 m.put(s.charAt(i), i);
               
           }
               
           else m.put(s.charAt(i),-1);
            
        }
        int smallestIndex=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer>e:m.entrySet()){
            
            if(e.getValue()>-1 &&e.getValue()<smallestIndex) smallestIndex=e.getValue();
        }
        for(Map.Entry<Character,Integer>e:m.entrySet()){
            
            if(e.getValue()==smallestIndex) return e.getKey().toString();
        }
        
        return "-1";
    }
} 