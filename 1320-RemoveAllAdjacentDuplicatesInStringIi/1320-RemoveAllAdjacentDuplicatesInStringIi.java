// Last updated: 8/29/2026, 11:50:25 PM
class Solution {

    class pair{
        char ch;
        int count;
    
     pair(char ch, int count){
        this.ch = ch;
        this.count = count;
     }
    }
       
    public String removeDuplicates(String s, int k) {

        Stack <pair> stack = new Stack<>();

        for(char ch: s.toCharArray()){

            if(!stack.isEmpty() && stack.peek().ch == ch){
               stack.peek().count++;
           

            if(stack.peek().count == k){
                stack.pop();
            }
            }
            
            else{
                stack.push(new pair(ch,1));
            }
        } 

        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){

            pair curr = stack.pop();
            for(int i = 0; i< curr.count; i++){
               ans.append(curr.ch);
            }
        }
        return ans.reverse().toString();
    }

}