class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        Map<Character,Character> cto=new HashMap<>();
        cto.put(')','(');
        cto.put(']','[');
        cto.put('}','{');
        for (char p:s.toCharArray()){
            if(cto.containsKey(p)){
                if(!stack.isEmpty()&& stack.peek()==cto.get(p)){
                    stack.pop();
                }else{
                    return false;
                }

            }else{
                stack.push(p);
            }
        }
        return stack.isEmpty();

        
    }
}
