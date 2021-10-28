package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
           String revr="";
            for(int i = s.length() - 1; i >= 0; i--)
            {
                revr = revr + s.charAt(i);
            }
            System.out.println("reverse : "+revr);
    }

    public void isPalindrome(){
       boolean palindrome=true;
        for(int i=0,j=s.length()-1;i<=j;i++,j--)
        {
            if (s.charAt(i)!=s.charAt(j))
            {
                palindrome=false;
                break;
            }
        }
        System.out.println("isPalindrome : "+palindrome);
    }

    public void toUpperCase(){
      String upper="";
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii>90){
                ascii=ascii-32;
                char l=(char)ascii;
                upper=upper+l;}
            else upper=upper+(char)ascii;

        }
        System.out.println("uppercase : "+upper);
    }

    public void toLowerCase(){
      String lower="";
            for(int i=0;i<s.length();i++){
                int ascii=s.charAt(i);
                if(ascii<=90){
                    ascii=ascii+32;
                    char l=(char)ascii;
                    lower=lower+l;}
                else lower=lower+(char)ascii;
            }
            System.out.println("lowercase : "+lower);
    }

    public void getVowelNumber(){
       String Vowel ="oieauyOIEAUY";
            int nbv=0;
            for (int i=0;i<s.length();i++)
            {
                for (int j=0;j< Vowel.length();j++)
                {
                    if (s.charAt(i)== Vowel.charAt(j))
                    {
                        nbv++;
                        break;
                    }
                }
            }
            System.out.println("vowelNumber : "+nbv);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
