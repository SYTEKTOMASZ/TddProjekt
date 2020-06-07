public class StringCalculator   {

    public int add(String numbers) {

        if (numbers.length() == 0) {
            return 0;
        }

        int result = 0;

        String[] strings = numbers.split(",");

        for (String s : strings) {
            result += Integer.parseInt(s);
        }

        return result;
    }
}

