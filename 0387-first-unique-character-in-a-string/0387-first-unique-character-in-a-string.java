class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                freq+=1;
                map.put(ch,freq);
            }else{
                map.put(ch,1);
            }
        }
        
        // for(int i=0;i<map.size();i++){
        //     char ch1=s.charAt(i);
        //     System.out.print(map.get(ch1)+" ");
        // }
        
        for(int i=0;i<s.length();i++){
            char ch2=s.charAt(i);
            if(map.get(ch2)==1){
                return i;
            }
        }
        return -1;
    }
}