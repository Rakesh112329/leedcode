class Solution {
    public int lengthOfLastWord(String s) {
        // String str=s.trim();
        // int count=0;
        // for(int i=str.length()-1;i>=0;i--){
        // if(str.charAt(i)!=' '){
        //     count++;
        // }
        // else{
        //     break;
        // }
        // }
        // return count;

        String [] words=s.trim().split(" ");
        return words[words.length - 1].length();
        
        // String[] words=s.trim().split("\\s+");
        // return words[words.length-1].length();
    }
}