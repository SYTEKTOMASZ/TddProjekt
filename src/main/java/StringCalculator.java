import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class StringCalculator {
        public int add(String numbers) throws Exception {
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

            List<Integer> negativeNumbers = new ArrayList<>();

            for (String s : strings) {
                int parsedNumber = Integer.parseInt(s);
                if (parsedNumber <= 1000) {

                    if (parsedNumber < 0) {
                        negativeNumbers.add(parsedNumber);
                        // throw new Exception("liczby ujemne są niedopuszczalne: " + parsedNumber);
                    }

                    result += parsedNumber;
                }
            }

            if (negativeNumbers.size() > 0) {
                throw new Exception("liczby ujemne są niedopuszczalne: " + Arrays.toString(negativeNumbers.toArray()));
            }

            return result;
        }
    }

