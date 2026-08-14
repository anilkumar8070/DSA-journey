    class Solution {
        public boolean isPalindrome(String s) {
            String nStr = "";
            for(char ch : s.toCharArray()){
                int x = (int)ch;
                if((65<=x && x<=90) || (97<=x && x<=122) || (48<=x && x<=57) ){
                    nStr += Character.toLowerCase(ch);
                }
            }
            System.out.print(nStr.toString());
            return strr(nStr);
        }

        boolean strr(String str){
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            if(str.equals(sb.toString())){
                return true;
            }
            return false;
        }
    }