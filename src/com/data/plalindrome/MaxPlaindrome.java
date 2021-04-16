package com.data.plalindrome;

public class MaxPlaindrome {
    public static void main(String[] args) {
        String s = "flsuqzhtcahnyickkgtfnlyzwjuiwqiexthpzvcweqzeqpmqwkydhsfipcdrsjkefehhesubkirhalgnevjugfohwnlhbjfewiunlgmomxkafuuokesvfmcnvseixkkzekuinmcbmttzgsqeqbrtlwyqgiquyylaswlgfflrezaxtjobltcnpjsaslyviviosxorjsfncqirsjpkgajkfpoxxmvsyynbbovieoothpjgncfwcvpkvjcmrcuoronrfjcppbisqbzkgpnycqljpjlgeciaqrnqyxzedzkqpqsszovkgtcgxqgkflpmrikksaupukdvkzbltvefitdegnlmzeirotrfeaueqpzppnsjpspgomyezrlxsqlfcjrkglyvzvqakhtvfmeootbtbwfhqucbnuwznigoyatvkocqmbtqghybwrhmyvvuchjpvjckiryvjfxabezchynfxnpqaeampvaapgmvoylyutymdhvhqfmrlmzkhuhupizqiujpwzarnszrexpvgdmtoxvjygjpmiadzdcxtggwamkbwrkeplesupagievwsaaletcuxtpsxmbmeztcylsjxvhzrqizdmgjfyftpzpgxateopwvynljzffszkzzqgofdlwyknqfruhdkvmvrrjpijcjomnrjjubfccaypkpfokohvkqndptciqqiscvmpozlyyrwobeuazsawtimnawquogrohcrnmexiwvjxgwhmtpykqlcfacuadyhaotmmxevqwarppknoxthsmrrknu";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if (s.length()<=1||(s.length()==2&&s.charAt(0)==s.charAt(1))){
            return s;
        }
        char [] chars = s.toCharArray();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j=s.length()-1;j>=i;j--){
                StringBuffer sb = new StringBuffer();
                // 从第一个字符开始判断，找到以第一个字符开始的最大回文子串
                sb.append(s.substring(i,j+1));
                String s1 = sb.toString();
                String s2 = sb.reverse().toString();
                if(s1.equals(s2)&&s1.length()>result.length()){
                    result = s1;
                }
            }

        }
        return result;
    }
}
