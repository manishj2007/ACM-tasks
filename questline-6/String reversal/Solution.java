public class StringReversal {
    // Iterative method
    public static String reverseIterative(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    // Recursive method
    public static String reverseRecursive(String str) {
        if (str.equals("")) {
            return str;  
        }
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";

        System.out.println("Iterative reverse: " + reverseIterative(input));
        System.out.println("Recursive reverse: " + reverseRecursive(input));
    }
}
