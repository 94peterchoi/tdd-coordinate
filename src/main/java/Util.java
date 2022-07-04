public class Util {

    public static int strToInt(String str) {
        String strNum = str.replaceAll("[^0-9]","");
        return Integer.parseInt(strNum);
        // try-catch 날려줘야 함
    }

}
