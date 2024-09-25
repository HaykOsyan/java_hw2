package homework2;

// Задание 1. Формирование URL с параметрами
// Дана строка базового URL:
// https://example.com/search?
// Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
// передаются в виде строки, где ключи и значения разделены =, а пары
// ключ-значение разделены &. Если значение null, то параметр не должен
// попадать в URL.

// public class program {
//     public static void main(String[] args) {
//         String params = "query=java&sort=desc&filter=null";
//         String baseUrl = "https://example.com/search?";
//         System.out.println(urlMaker(baseUrl, queryMaker(params)));
//     }

//     public static String urlMaker(String baseUrl, String params) {
//         return baseUrl.concat(params);
//     }

//     public static String queryMaker(String str) {
//         String query = "";
//         String[] myArray = str.split("&");
//         for (int i = 0; i < myArray.length; i++) {
//             if (!queryChecker(myArray[i])) {
//                 if (i == 0) {
//                     query = query.concat(myArray[i]);
//                 } else {
//                     query = query.concat("&").concat(myArray[i]);
//                 }
//             }
//         }
//         return query;
//     }

//     public static boolean queryChecker(String str) {
//         return str.substring(str.indexOf("=") + 1).equals("null");
//     }
// }

// // Задача 2. Создание CSV-строки из массива объектов
// // Дан массив объектов, где каждый объект представляет собой строку данных, и
// // массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// // строкой, а значения в строках разделяются запятыми.

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         String[] headers = { "Name", "Age", "City" };
//         String[][] data = {
//                 { "John", "30", "New York" },
//                 { "Alice", "25", "Los Angeles" },
//                 { "Bob", "35", "Chicago" }
//         };
//         generateCSV(headers, data);
//     }

//     public static String generateCSV(String[] headers, String[][] data) {
//         arrInLine(headers);
//         for (int i = 0; i < data.length; i++) {
//             System.err.println();
//             arrInLine(data[i]);
//         }
//         return "q";
//     }

//     public static void arrInLine(String[] array) {
//         for (int i = 0; i < array.length; i++) {
//             if (i > 0) {
//                 System.out.print("," + array[i]);
//             } else {
//                 System.out.print(array[i]);
//             }
//         }
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         String[] headers = { "Name", "Age", "City" };
//         String[][] data = {
//                 { "John", "30", "New York" },
//                 { "Alice", "25", "Los Angeles" },
//                 { "Bob", "35", "Chicago" }
//         };
//         String csv = generateCSV(headers, data);
//         System.out.println(csv);
//     }

//     public static String generateCSV(String[] headers, String[][] data) {
//         StringBuilder sb = new StringBuilder();
//         appendArray(sb, headers);
//         sb.append("\n");
//         for (String[] row : data) {
//             appendArray(sb, row);
//             sb.append("\n");
//         }
//         return sb.toString();
//     }

//     public static void appendArray(StringBuilder sb, String[] array) {
//         for (int i = 0; i < array.length; i++) {
//             if (i > 0) {
//                 sb.append(",");
//             }
//             sb.append(array[i]);
//         }
//     }
// }
/**
 * program
 */

// Задача 4. Логирование операций с массивом во время поиска
// минимального и максимального элементов
// Реализуйте метод поиска минимального и максимального элементов массива.
// После нахождения каждого элемента (минимального и максимального),
// сделайте запись в лог-файл log.txt в формате год-месяц-день
// час:минуты {минимальный элемент}, {максимальный элемент}.

import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;

public class program {

    public static void main(String[] args) {
        int[] numbers = { 77, 156, 6056, -21, 799, 654, 23, 33, 44, 55, -66, -1, 4 };
        // System.out.println(maxArray(numbers));
        // System.out.println(minArray(numbers));
        WriteToFile("minimum is --->" + minArray(numbers) + "maximum is --->" + maxArray(numbers) + "founded at"
                + LocalDateTime.now());
    }

    public static int maxArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                WriteToFile("Found new maximum at  " + LocalDateTime.now() + "----->" + max);
            }
        }
        return max;
    }

    public static int minArray(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                WriteToFile("Found new minimum at  " + LocalDateTime.now() + "----->" + min);
            }
        }
        return min;
    }

    public static void WriteToFile(String info) {
        try {
            FileWriter myWriter = new FileWriter("log.txt", true);
            myWriter.write("\n" + info);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
