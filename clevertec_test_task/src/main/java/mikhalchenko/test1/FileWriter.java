package mikhalchenko.test1;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileWriter {

File file;


    private static void createFile(String data) throws IOException {


        File file = new File("C:\\Users\\user\\IdeaProjects\\CLEVERTEC_TEST_TASK_Android\\clevertec_test_task\\src\\main\\resources\\Тестовое задание 1. Java. Михальченко Татьяна.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> lines = Arrays.asList(data);
        Path file1 = Paths.get("Тестовое задание 1. Java. Михальченко Татьяна.txt");
        Files.write(file1, lines, StandardCharsets.UTF_8);

    }






    public static void main(String[] args) throws IOException {
        String data = " public boolean isValid(String cardNumber) {\n" +
                "        boolean isValid = false;\n" +
                "\n" +
                "        String withoutSpaces = \"\";\n" +
                "        for (int i = 0; i < cardNumber.length(); i++) { // deleting a space\n" +
                "            if (cardNumber.charAt(i) != ' ') {\n" +
                "                withoutSpaces += cardNumber.charAt(i);\n" +
                "            }\n" +
                "        }\n" +
                "        char[] charArray = withoutSpaces.toCharArray();\n" +
                "        int[] arrInt = new int[charArray.length];\n" +
                "        int sum = 0;\n" +
                "        for (int i = charArray.length - 1; i >= 0 && charArray.length == 16; i--) {// charArray.length == 16\n" +
                "            // since the standard card number consists of 16 digits\n" +
                "            if (withoutSpaces.matches(\"[0-9]+\")) {// checking that there are only numbers in the card number\n" +
                "                arrInt[i] = Character.getNumericValue(charArray[i]);\n" +
                "                if (i % 2 == 0) { //the numbers standing in even places are multiplied by 2\n" +
                "                    arrInt[i] *= 2;\n" +
                "                    if (arrInt[i] > 9) {// if the number is greater than 9,\n" +
                "                        // then it is replaced by the sum of the digits of the resulting product\n" +
                "                        arrInt[i] = arrInt[i] / 10 + arrInt[i] % 10;\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "                sum += arrInt[i];// all the received figures are added together\n" +
                "                if (sum % 10 == 0) { // checking the received amount for a multiple of 10, checking for validity\n" +
                "                    isValid = true;\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return isValid;\n" +
                "    }";
        try {
            FileWriter.createFile(data);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> lines = Arrays.asList(data);
        Path file1 = Paths.get("C:\\Users\\user\\IdeaProjects\\CLEVERTEC_TEST_TASK_Android\\clevertec_test_task\\src\\main\\resources\\Тестовое задание 1. Java. Михальченко Татьяна.txt");
        Files.write(file1, lines, StandardCharsets.UTF_8);
    }

}
