import java.util.*;

public class a2_count_no_of_vowel_consonant_spaces {

  public static void count(String str, int length) {
    int vow = 0;
    int con = 0;
    int space = 0;
    str = str.toLowerCase();
    for (int i = 0; i < length; i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vow++;
      } else if (ch == ' ') {
        space++;
      } else {
        con++;
      }
    }
    System.out.println("Vowels: " + vow);
    System.out.println("Consonants: " + con);
    System.out.println("Spaces: " + space);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int length = str.length();
    count(str, length);

  }
}



// public class tUf {
//   public static void solve(String str, int length) {
//     int vowels = 0, consonants = 0, whitespaces = 0;
//     str = str.toLowerCase(); // converting given string to lowercase
//     for (int i = 0; i < length; i++) {
//       char ch = str.charAt(i);
//       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//         vowels++;
//       else if (ch >= 'a' && ch <= 'z')
//         consonants++;
//       else if (ch == ' ')
//         whitespaces++;
//     }

//     System.out.println("Vowels: " + vowels);
//     System.out.println("Consonants: " + consonants);
//     System.out.println("White spaces: " + whitespaces);
//   }
//   public static void main(String args[]) {
//     String str = "Take u forward is Awesome";
//     int length = str.length();
//     solve(str, length);
//   }
// }