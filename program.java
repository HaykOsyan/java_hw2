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