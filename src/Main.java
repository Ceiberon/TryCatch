import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] StrArray = {"String1","String2","String3","String4","String5","String6","String7","String8","String9","String10"};

        System.out.println("1-10 arası bir sayı giriniz ");
        Scanner input = new Scanner(System.in);
        var index = input.nextInt();

        try {
            System.out.println(StrArray[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}

