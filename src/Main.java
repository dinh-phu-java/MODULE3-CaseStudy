import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            String pass="qazWSX1@";
            MessageDigest md =MessageDigest.getInstance("SHA-256");
            md.update(pass.getBytes());
            byte[] mdArray= md.digest();
            StringBuilder sb= new StringBuilder(mdArray.length*2);

            for (byte b: mdArray){
                int v= b & 0xff;
                if (v < 16){
                    sb.append('0');
                }
                sb.append(Integer.toHexString(v));
            }
            System.out.println(sb.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
