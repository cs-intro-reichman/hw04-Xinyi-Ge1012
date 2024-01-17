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
        char ans = "";
       for(int i = 0; i < string.length(); i++){
        if(string.chatAt(i) > 64 && string.chatAt(i) < 91){
            if(string.chatAt(i) == 'A' || string.chatAt(i) == 'E' || string.chatAt(i) == 'I' || string.chatAt(i) == 'O' || string.chatAt(i) == 'U'){
                ans = ans + (char)(string.charAt(i));
            } else {
                ans = ans + (char)(string.charAt(i) + 32);
            }
        if(string.chatAt(i) >90){   
        if(string.chatAt(i) == 'a' || string.chatAt(i) == 'e' || string.chatAt(i) == 'i' || string.chatAt(i) == 'o' || string.chatAt(i) == 'u' ){
             ans = ans + (char)(string.chatAt(i)-32);
        } else {
            ans = ans + (char)(string.charAt(i));
        }
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
               
                int[] array = new int[index];
                array[index] = string.indexOf(i);
                index++;
            }

        }
        return array[index];
    }
}
}