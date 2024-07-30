public class dsa68_bitmagic68_powerset {
    static void powerset(String s){
        int n=s.length();
        double power=Math.pow(2,n);
        for(int counter=0;counter<power;counter++){
            for(int j=0;j<n;j++){
                if((counter&(1<<j))!=0){
                    System.out.print(s.charAt(j));

                }

            }
            System.out.println();
        }





    }
    public static void main(String[] args) {
        powerset("nik");

    }
}
