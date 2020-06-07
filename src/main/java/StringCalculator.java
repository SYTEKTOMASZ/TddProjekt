public class StringCalculator   {

    public int add(String numbers) {

        if (numbers.length() == 0) {
            return 0;
        }

        int result = 0;

        String customSeparator = null;
        if (numbers.startsWith("//")) {
            String[] split = numbers.split("\n", 2);

            customSeparator = split[0].substring(2);
            numbers = split[1];
        }

        String separator;
        if (customSeparator == null) {
            separator = "[,|\n]";
        } else {
            separator = "[,|\n|" + customSeparator + "]";
        }

        String[] strings = numbers.split(separator);

        for (String s : strings) {
            result += Integer.parseInt(s);
        }

        return result;
    }
}

