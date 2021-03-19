public class Mianshi06 {

    public String compressString(String S) {
        StringBuffer stringBuffer = new StringBuffer();
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)){
                count++;
            }
            else {
                stringBuffer.append(S.charAt(i-1));
                stringBuffer.append(count);
                count = 1;
            }
        }
        stringBuffer.append(S.charAt(S.length() - 1));
        stringBuffer.append(count);
        if (stringBuffer.toString().length() > S.length()) return S;
        else return stringBuffer.toString();
    }
}
