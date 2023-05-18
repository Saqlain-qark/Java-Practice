/**
 * Q7 check if the character is lowercase/uppercase if so print the alternative uppercase/lowercase character 
 * and not numerical equivalent.
 */

class Q7 {
    public static void main(String[] args) {
        char ch = 'Z';
         if (ch >= 'a' && ch <= 'z') {
            System.out.println((char) (ch - 32));
        }  
        else {
            System.out.println((char) (ch + 32));
        }
    }
}