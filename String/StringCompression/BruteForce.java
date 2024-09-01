class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            Integer count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
           sb.append((count==1)?chars[i] : chars[i]+""+count);
        }

        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}
