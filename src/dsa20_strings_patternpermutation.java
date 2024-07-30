

public class dsa20_strings_patternpermutation {
    static boolean areSame(int array1[],int array2[]){
        for(int i=0;i<1000;i++){
            if(array1[i]!=array2[i]){
            return false;
        }
    }return true;}
    static boolean patper(String original, String search){
        int search1[]=new int[1000];
        int search2[]=new int[1000];
        for(int i=0;i<search.length();i++){
            search1[original.charAt(i)]++;
            search2[search.charAt(i)]++;
        }
        for(int i=search.length();i<original.length();i++){
            if(areSame(search1,search2)){
                return true;
            }search1[original.charAt(i)]++;
            search2[original.charAt(i-search.length())]--;

        }return false;
    }
    public static void main(String[] args) {
        System.out.println(patper("nikshay","nk"));

    }
}
