// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        int count=0;
        int temp=num;
        while(temp>0){
        temp/=10;
        count++;
        }
        
        int i=0;
        int ans=0;
        int power=0;
        while(i<count){
            int rem=num%10;
            num/=10;
            if(rem==0){
                ans+=5*Math.pow(10,power);
            }else{
                ans+=rem*Math.pow(10,power);
            }
            i++;
            power++;
        }
        return ans;
    }
}