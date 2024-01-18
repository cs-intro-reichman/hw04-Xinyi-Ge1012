public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       
    }

    public static String capVowelsLowRest (String string) {
        String ans = "";
       for(int i = 0; i < string.length(); i++){
        char currentChar = string.charAt(i);
          if(string.charAt(i) > 64 && string.charAt(i) < 91){
            if(string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'){
                ans = ans + (char)(currentChar);
            } else {
                ans = ans + (char)(currentChar + 32);
            }
         } else if(string.charAt(i) >90){   
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ){
             ans = ans + (char)(currentChar-32);
            } else {
            ans += (char)(currentChar);
            }
         } else {
            ans += (char)(currentChar);
         }

       }
        return ans;
    }

    public static String camelCase (String string) {
        boolean newOne = false;
        boolean firstOne = true;
        int n = string.length();
        for (int i = 0; i < n; i++) {
            if (newOne == true && string.charAt(i) != ' ') {
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    string = string.substring(0, i) + (char) (string.charAt(i) - 32) + string.substring(i + 1);
                }
                newOne = false;
            } else if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    string = string.substring(0, i) + (char) (string.charAt(i) + 32) + string.substring(i + 1);
                    firstOne = false;
            } else if (firstOne == false && string.charAt(i) == ' ') {
                string = string.substring(0, i) + string.substring(i + 1);
                n--; 
                i--; 
                newOne = true;
            } else if (string.charAt(i) == ' ') {
                string = string.substring(0, i) + string.substring(i + 1);
                n--;
                i--;
            }
        }
        return string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int index = 0;
        for(int i = 0; i < string.length(); i++){
            if(chr == string.charAt(i)){
                index++;
            }
        }
           int[] array = new int[index];
        for(int i = 0, j = 0; i < string.charAt(i); i++){
            if(chr == string.charAt(i)){
                array[j++] = i;
            }
        }
        return array;
     }
}