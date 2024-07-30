public class dsa16_strings1_anagram {
    static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;


        }
        int count[]=new int[100];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
        }for(int i=0;i<s2.length();i++){
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<100;i++){
            if(count[i]!=0){
                return false;
            }
        }
return true;
    }
    public static void main(String[] args) {
        String s1="NIKSHAY";
        String s2="IKSHAYN";
        System.out.println(anagram(s1,s2));


    }
}
