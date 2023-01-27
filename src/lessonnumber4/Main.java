package lessonnumber4;

public class Main {

    public static void main(String[] args) {
        String str = "po polly begayet katranchek";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        int length = str.length();
        int lastIndex = length - 1;
        System.out.println(str.charAt(lastIndex));
        System.out.println(str.charAt(0));
    }
}
