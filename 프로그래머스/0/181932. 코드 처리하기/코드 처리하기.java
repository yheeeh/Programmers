class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = true;
        for(int i = 0; i < code.length(); i++){
            if(mode){
                if(code.charAt(i) != '1' && i % 2 == 0){
                    ret += code.charAt(i);
                }else if(code.charAt(i) == '1'){
                    mode = false;
                }
            }else{
                if(code.charAt(i) != '1' && i % 2 == 1){
                    ret += code.charAt(i);
                }else if(code.charAt(i) == '1'){
                    mode = true;
                }
            }
        }
        if(ret.equals("")){
            ret = "EMPTY";
        }
        return ret;
    }
}