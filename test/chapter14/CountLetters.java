package chapter14;

public class CountLetters {
    public static void main(String[] args) {

        countCharacter("hippopotamus",'p');
        System.out.println(countCharacter("hippopotamus", 'p'));
    }
    public static int countCharacter(String passStr, char passChar){
        int counter = 0;
        for (int i = 0; i < passStr.length(); i++){
            if(passStr.charAt(i)==passChar){
                counter++;
            }
        }
        return counter;
    }
}
