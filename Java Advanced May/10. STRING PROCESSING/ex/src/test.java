public class test {
    public static void main(String[] args) {
        String num1 = "2020520000";
        String bigger = "11110";


        //String test = String.format("%1$" + bigger.length() + "s", smaller).replace(" ", "0");
        //System.out.println(test);

//        for (int i = 0; i < num1.length() ; i++) {
//            int digit1 = num1.length() - 1 - i >= 0 ? num1.charAt(num1.length() - 1 - i) - '0' : 0;
//            System.out.println(digit1);
//        }
//        String[] bannedWords = "Linux, Windows".split(", ");
//        String text = "It is not Linux, it is GNU/Linux. Linux is merely the kernel, while GNU adds the functionality. " +
//                "Therefore we owe it to them by calling the OS GNU/Linux! Sincerely, a Windows client";
//
//        text = text.replaceAll(bannedWords[0], new String(new char[bannedWords[0].length()]).replace('\0', '*'));
//        System.out.println(text);
//
//        String test = new String();
//        System.out.println(test.replace('\0','*'));

        int asciiNum = "?".charAt(0);
        System.out.println(String.format("\\u%04x", 63));
    }
}
