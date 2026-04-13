class Solution {
    public String firstPalindrome(String[] arr) {
        for(int i = 0; i<arr.length ; i++){
            if(isPalin(arr[i])){
                return arr[i];
            }
        }

        return "";
    }


public boolean isPalin(String str){
    StringBuilder sb = new StringBuilder(str);
    String temp = sb.reverse().toString();

    if(str.equals(temp)){
        return true;
    }

    return false;
}
}