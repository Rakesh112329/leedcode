class Solution {
    public boolean isValid(String s) {
      char[] chars=s.toCharArray();

      Stack<Character>st=new Stack<>();

      for(char elc:chars){
        if(elc=='('|| elc=='['|| elc=='{'){
            st.push(elc);
            continue;
        }
        else{
            if(st.isEmpty()) return false;
        
        char top=st.pop();
         if(top=='(' && elc !=')') return false;
        
        if(top=='[' && elc !=']') return false;
        
         if(top=='{' && elc !='}') return false;
        
    
      }
    
        
    }
    return st.isEmpty();
}
}