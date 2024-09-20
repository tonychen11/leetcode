class Solution {
    public boolean backspaceCompare(String s, String t) {
        return builder(s).equals(builder(t));
    }

    public String builder(String s){
        StringBuilder builder = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '#'){
                if(builder.length() > 0){
                    builder.deleteCharAt(builder.length() - 1);
                }                
            }
            else{
                builder.append(c);
            }
        }

        return builder.toString();
    }
}
