class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
        
            if (c == '(' || c == '{' || c == '['){
                list.add(c);
            }
            else{
                if(list.isEmpty()){
                    return false;
                }
                char top = list.remove(list.size()-1);

                if(c == ')' && top != '(' || 
                   c == '}' && top != '{' ||
                   c == ']' && top != '[' ){
                    return false;
                   }               
            }
        }

        return list.isEmpty();
    }
}
