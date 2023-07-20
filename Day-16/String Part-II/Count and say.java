class Solution {
    public String countAndSay(int n) {
        String output = "1", str = "";
        for(int i = 1; i < n; i++, output = str, str= "")
            for(int j = 0, count = 1; ; j++) 
                if(j == output.length() - 1) {
                    str +=  String.valueOf(count) + output.charAt(j) ;
                    break;
                }
                else if(output.charAt(j) != output.charAt(j + 1)){
                    str += String.valueOf(count) + output.charAt(j) ;
                    count = 1;
                }
                else count++;
        return output;
    }
}
