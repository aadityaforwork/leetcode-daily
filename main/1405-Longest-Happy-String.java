class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder result=new StringBuilder();
        int countA=0;
        int countB=0;
        int countC=0;
        while(a>0 || b>0 || c>0){
             if((a>=b && a>=c && countA<2) || (countB==2 && a!=0) || (countC==2 &&a!=0) ){
                result.append("a");
                a--;
                countA++;
                countB=0;
                countC=0;
             }
             else if((b>=a && b>=c && countB<2) || (countA==2 && b!=0) || (countC==2 && b!=0)){
                result.append("b");
                b--;
                countB++;
                countA=0;
                countC=0;
             }
             else if((c>=a && c>=b && countC<2) || (countB==2 && c!=0) || (countA==2 && c!=0)){
                result.append("c");
                c--;
                countC++;
                countA=0;
                countB=0;
             }
             else{
                break;
             }
        }

        return result.toString();
    }
}