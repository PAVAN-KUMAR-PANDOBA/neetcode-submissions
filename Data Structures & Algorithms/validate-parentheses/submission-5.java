class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        int i=0,j=-1;
        while(i<s.length()){
            if(s.charAt(i)=='(') {
                list.add(')');
                j++;
                i++;

            }
            else if(s.charAt(i)=='[') {
                list.add(']');
                j++;
                i++;
            }
            else if(s.charAt(i)=='{') {
                list.add('}');
                j++;
                i++;
            }
            else if(s.charAt(i)==('}')){
                if(list.size()==0) return false;
                Character temp=list.remove(j);
                if(temp!='}') return false;
                else {
                    j--;
                    i++;
                }

            }
            else if(s.charAt(i)==(']') ){
                if(list.size()==0) return false;
                Character temp=list.remove(j);
                if(temp!=']') return false;
                else {
                    j--;
                    i++;
                }
            }
            else if(s.charAt(i)==(')') ) {
                if(list.size()==0) return false;
                Character temp=list.remove(j);
                if(temp!=')') return false;
                else {
                    j--;
                    i++;
                }
            }
            else i++;
        }
        if(list.size()!=0) return false;
        return true;
        
        
    }
}
