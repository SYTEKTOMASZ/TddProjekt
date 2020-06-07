public class StringCalculator   {

    public int add(String numbers) {

        if (numbers.length() == 0) {
            return 0;
        }

        int result = 0;
        String separator;
        if(numbers.contains("//")){
            int x = numbers.indexOf("/");
            separator = numbers.charAt(x+2);


        }
        String[] strings = numbers.split("[,|\n|%s  ]",separator);

        for (String s : strings) {
            result += Integer.parseInt(s);
        }

        return result;
    }
}

