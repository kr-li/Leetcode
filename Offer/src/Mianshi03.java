public class Mianshi03 {
    public String replaceSpaces(String S, int length) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' '){
                stringBuffer.append("%20");
            }
            else {
                stringBuffer.append(S.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
