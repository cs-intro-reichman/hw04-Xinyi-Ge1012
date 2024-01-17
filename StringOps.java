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
        String string = "";
       for(int i = 0; i < str.length(); i++){
        if(str.chatAt(i) > 64 && str.chatAt(i) < 91){
            if(str.chatAt(i) == 'A' || str.chatAt(i) == 'E' || str.chatAt(i) == 'I' || str.chatAt(i) == 'O' || str.chatAt(i) == 'U'){
                string += (char)(str.charAt(i));
            } else {
                string += (char)(str.charAt(i) + 32);
            }
        if(str.chatAt(i) >90){   
        if(str.chatAt(i) == 'a' || str.chatAt(i) == 'e' || str.chatAt(i) == 'i' || str.chatAt(i) == 'o' || str.chatAt(i) == 'u' ){
             string +=(char)(str.chatAt(i)-32);
        } else {
            string += (char)(str.charAt(i));
        }
      }
       }
        return string;
    }

    public static String camelCase (String string) {
        boolean newOne = false;
        boolean firstOne = true;
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
                string.length()--; 
                i--; 
                newOne = true;
            } else if (string.charAt(i) == ' ') {
                string = string.substring(0, i) + string.substring(i + 1);
                string.length()--;
                i--;
            }
        }
        return string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int index = 0;
        for(int i = 0; i < string.length; i++){
            if(chr.charAt(0) == string.charAt(i)){
               
                int[] array = new int[index];
                array[index] = string.indexOf(i);
                index++;
            }

        }
        return int[] arr;
    }
}
}