package Model;

public class Token {

    public static String generateToken(){
        return "token";
    }
    public static long generateHash(String token){
        return token.hashCode();
    }

    private String token;
    private long hashToken;
    private Robo robo;

    public Token(Robo robo) {
        this.robo = robo;
        token=generateToken();
        hashToken=generateHash(token);
    }



}
