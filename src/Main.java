//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        String pass1="qazWSX1@2";
//        String pass2="qazWSX1@";
//        System.out.println(passwordUtil(pass1));
//        System.out.println(passwordUtil(pass2));
//
//    }
//    public static String passwordUtil(String pass){
//        StringBuilder sb= new StringBuilder();
//        try {
//
//            MessageDigest md =MessageDigest.getInstance("SHA-256");
//            md.update(pass.getBytes());
//            byte[] mdArray= md.digest();
//            sb= new StringBuilder(mdArray.length*2);
//
//            for (byte b: mdArray){
//                int v= b & 0xff;
//                if (v < 16){
//                    sb.append('0');
//                }
//                sb.append(Integer.toHexString(v));
//            }
//
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        return sb.toString();
//    }
//}
