class Solution {
    public String reverseVowels(String s) {
        int len=s.length();
        ArrayList<Character> al=new ArrayList<>();
        
        for(int i=0;i<len;i++){
            char l=s.charAt(i);
            if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u' ||
              l=='A' || l=='E' || l=='I' || l=='O' || l=='U'){
                al.add(l);
            }
        }
        
        Collections.reverse(al);
        int j=0;
        
        String str="";
        for(int i=0;i<len;i++){
            char l=s.charAt(i);
            if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u' ||
              l=='A' || l=='E' || l=='I' || l=='O' || l=='U'){
                str+=al.get(j++);
            }else{
                str+=l;
            }
        }
        
        return str;
    }
}