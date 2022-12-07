package constant;

public class PropertyConstant {

    public final static String BCRYPT_CONSTANT_PARAMETER = "BCRYPT_SALT";
    public static final String BCRYPT_SALT = System.getProperty(BCRYPT_CONSTANT_PARAMETER);

}
