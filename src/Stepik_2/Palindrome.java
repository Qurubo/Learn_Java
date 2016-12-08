package Stepik_2;

/**
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.

 Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 */
public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("Madam, I'm Adam!");
    }
    public static boolean isPalindrome(String text) {
        boolean result = false;
        String t1,t,reverText;
        t1=text.replaceAll("[^a-zA-Z0-9]","");
        t=t1.toUpperCase();
        //System.out.println(t);
        reverText=new StringBuilder(t).reverse().toString();
        result=t.equals(reverText);
        //System.out.println(result);

        return result; // your implementation here
    }
}
