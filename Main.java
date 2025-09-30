public class Main
{
  public static void main(String[] args)
  {
    lastFirstN("cream", "butter", 3);
    stringManip("hello", "hello");
    System.out.println(removeStr("badaboom", "ada"));
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    System.out.println(s1.substring(s1.length()-n) + s2.substring(s2.length()-n));
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    System.out.println(s1.toUpperCase());
    System.out.println((s2.substring(0, 1)).toUpperCase() + (s2.substring(1)).toLowerCase());
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    int x = s1.lastIndexOf(s2);
    return (s1.substring(0,x) + s1.substring (x+s2.length()));
  }
}
