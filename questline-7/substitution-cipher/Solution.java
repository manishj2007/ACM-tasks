public class CaesarCipher {
    public static void main(String[] args) {
        String t1 = "RECRUIT";
        int shift1 = 3;
        String encoded = "";

        
        for (int i = 0; i < t1.length(); i++) {
            char c = t1.charAt(i);
            char newChar = (char) ((c - 'A' + shift1) % 26 + 'A');
            encoded = encoded + newChar;
        }
        System.out.println("Encoding RECRUIT with +3: " + encoded);

        
        String t2 = "ZHOFRPH";
        int shift2 = -3;
        String decoded = "";
        for (int i = 0; i < t2.length(); i++) {
            char c = t2.charAt(i);
            char newChar = (char) ((c - 'A' + shift2 + 26) % 26 + 'A');
            decoded = decoded + newChar;
        }
        System.out.println("Decoding ZHOFRPH with -3: " + decoded);
    }
}

