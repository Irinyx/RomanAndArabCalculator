public class RomanToArabic {
    int val(char roman) throws RuntimeException {
        switch (roman) {
            case 'I':
            case 'i':
                return 1;

            case 'V':
            case 'v':
                return 5;

            case 'X':
            case 'x':
                return 10;

            case 'L':
            case 'l':
                return 50;

            case 'C':
            case 'c':
                return 100;

            case 'D':
            case 'd':
                return 500;

            case 'M':
            case 'm':
                return 1000;
        }
        throw new RuntimeException("Not a Roman type");
    }

    String ArabToRim(String str) throws RuntimeException {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int first = val(str.charAt(i));
            if (i + 1 < str.length()) {
                int second = val(str.charAt(i + 1));
                if (first >= second) {
                    result = result + first;
                } else {
                    result = second - first - result;
                    i++;
                }
            } else {
                result = result + first;
                i++;
            }
        }
        String res = Integer.toString(result);
        return res;
    }
}

