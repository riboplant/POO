package Guias.Guia2;

public class ej5 {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Por favor, ingrese una frase como argumento.");
            return;
        }

        String phrase = String.join(" ", args).toLowerCase().replaceAll("\\s+", "");
        if (isPalindrome(phrase)) {
            System.out.println("ES PALINDROMO");
        } else {
            System.out.println("NO ES PALINDROMO");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

}
