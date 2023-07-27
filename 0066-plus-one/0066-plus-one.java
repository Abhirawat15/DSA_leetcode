class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int carry=1;
        int i;
        for(i=len-1;i>0;i--){
            int num=digits[i];
            if(num<9){
                digits[i]=num+carry;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        
        if(digits[i]==9){
            digits=new int[len+1];
            for(int j=len-1;j>=0;j--){
                digits[j+1]=digits[j];
            }
            digits[1]=0;
            digits[0]=1;
        }else{
            digits[0]=digits[0]+carry;
        }
        return digits;
    }
}