import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String text) {
        //kelimenin tersini eşitleyebileceğim bir boş string oluşturdum.
        String emptyStr = "";

        //text girdisinin her bir karakterini tek tek tersten olacak şekilde emptyStr'ye ekledim.
        for(int i = text.length() - 1; i > -1; i--) {
            emptyStr = emptyStr + text.charAt(i);
        }

        //isPalindrome durumunu kontrol ettim.
        if(text.equals(emptyStr)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");

        String text = scanner.nextLine();

        //büyük küçük harf duyarlılığı olduğu için her bir harfi küçük olarak düzelttim.
        text = text.toLowerCase();

        //isPalindrome fonksiyonunun return ettiği sonucu print ettim.
        System.out.println("Sonuç: " + isPalindrome(text));

    }
}