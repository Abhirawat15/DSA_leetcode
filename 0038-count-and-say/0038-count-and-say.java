class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        String num= countAndSay(n-1);
        int count=1;
        String str="";
        String fir=num.substring(0,1);
        for(int i=1;i<num.length();i++){
            if(fir.equals(num.substring(i,i+1))){
                count++;
            }else{
                str=str+(count+fir);
                fir=num.substring(i,i+1);
                count=1;
            }
        }
        str=str+(count+fir);
        return str;
    }
}