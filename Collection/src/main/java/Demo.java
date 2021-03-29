import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * @author huzh
 * @date 2021.3.17 16:52
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String str = "Abc123++";
        String publicKey = "MIGeMA0GCSqGSIb3DQEBAQUAA4GMADCBiAKBgH9RB1AJw1b5f1eE52+icZplN40I" +
                "eAooLdn9zb2tJCHmUQuFHaMAgUGTlrMYstjjy5MMvteZ3L0LmJd9g9Czyp2PQblk" +
                "WEATn3YA9G00DiEgWJZ5cc7BFrLHIbFqSK8+BBFxGcFHhD2gvp62OaJPTkRvYgjv" +
                "r+TvVdvVRo3DPT/rAgMBAAE=";
        System.out.println(encrypt(str, publicKey));
    }

    public static String encrypt(String str, String publicKey) throws Exception {
        //base64编码的公钥
        byte[] decoded = Base64.getDecoder().decode(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes("UTF-8")));
        return outStr;
    }
}
