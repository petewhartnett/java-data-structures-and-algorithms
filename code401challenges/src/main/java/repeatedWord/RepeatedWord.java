package repeatedWord;

public class RepeatedWord {


    //reference - forgot the syntax for split and referenced baeldung to rememeber -  https://www.baeldung.com/string/split

    public static String repeat(String words){

        String lowerCase = words.toLowerCase();

        String[] stringArr = lowerCase.split(" ");


        for(int i =0; i  < stringArr.length; i++){
            for(int j = 1; j < stringArr.length; j++){

                if(stringArr[i] == stringArr[j]){

                    return stringArr[i];
                }

            }
        }

        return null;
    }

}
