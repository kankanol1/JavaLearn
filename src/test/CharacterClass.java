package test;

public class CharacterClass {
    public static void main(String args[]) {
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.isUpperCase('A') ? "A" :"a");
        System.out.println(Character.toString('5'));
    }
}
