package repl92to156;

public class repl139 {
        public  static  String  alphabetical1( String  str) {
            str= str.toLowerCase();
            char  max= str. charAt ( 0 );
            String  result= String . valueOf (str. charAt ( 0 ));
            for ( int  i= 1 ;i< str. length ();i++ ) {
                if (max< str. charAt (i)){
                    result+= String . valueOf (str. charAt (i));
                    max= str. charAt (i);
                }
            }
            return  ( String ) result;
        }
        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(alphabetical("hello")); //"hlo"
            System.out.println(alphabetical("software"));
            System.out.println(alphabetical("language"));
        }
        public static String alphabetical(String str ){
            String newStr = "" + str.charAt(0);
            for(int i=1;i<str.length();i++){
                if(str.charAt(i-1)<str.charAt(i)){
                    newStr=newStr+str.charAt(i);
                }
            }
            return newStr;
        }
    }
