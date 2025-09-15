public class RotateBinary {
    public static void main(String[] args) {
        String bin = "1011";
        int k = 2;

        int n = bin.length();
        k = k % n;
        String rotated = bin.substring(k) + bin.substring(0, k);
        int decimal = Integer.parseInt(rotated, 2);

        System.out.println("Rotate " + bin + " by " + k + " = " + decimal);

        
        String bin2 = "1101";
        int k2 = 1;
        String rotated2 = bin2.substring(k2) + bin2.substring(0, k2);
        int decimal2 = Integer.parseInt(rotated2, 2);
        System.out.println("Rotate " + bin2 + " by " + k2 + " = " + decimal2);
    }
}
