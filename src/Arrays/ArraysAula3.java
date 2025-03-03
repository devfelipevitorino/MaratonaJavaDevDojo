package Arrays;

public class ArraysAula3 {
    public static void main(String[] args) {

        String[] s = new String[4];
        s[0] = "Goku";
        s[1] = "Luffy";
        s[2] = "Kakashi";
        s[3] = "Obito";

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }

        s = new String[5];

        s[4] = "Sasori";

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}
