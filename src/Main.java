// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean summer = false;
        System.out.println( isCatPlaying(summer, 45) ? "The cat is playing" : "The cat is not playing");
    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        if(summer){
            return (temperature >= 25) && (temperature <= 45);
        }else {
            return (temperature >= 25) && (temperature <= 35);
        }
    }
}