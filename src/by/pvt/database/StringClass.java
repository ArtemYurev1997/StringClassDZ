package by.pvt.database;

public class StringClass {
    public static void main(String[] args) {
        String text  = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) " +
                "или метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является" +
                " то, что его значение не может быть изменено после создания объекта при помощи" +
                " любого метода класса. Изменение строки всегда приводит к созданию нового" +
                " объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение" +
                " и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку";

        String text1  = "Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. В данном случае встречается путаница. " +
                "Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2). " +
                "Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри. " +
                "Технологии программирования на Java 2. Распределённые приложения (2011). " +
                "В то время, когда, как известно, Java 2 была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании, " +
                "о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7, это приводит к полной путанице.";

        method1(text, 1, "abc");
        method2(text, "ние", "NIE");
        method3(text1);

    }

    static void method1(String str, int k, String st) {
        String newText = "";
        StringBuilder sb;
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > k) {
                sb = new StringBuilder(words[i]);
                newText =  newText + " " + sb.insert(k, st).toString();
            }
        }
        System.out.println(newText);
    }


    static void method2(String str, String s, String sl) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith(s)) {
                words[i] = new StringBuffer(words[i]).append(sl).toString();
            }
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }


    static void method3(String str) {
        String result =str.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        System.out.print(result);
        System.out.println();
    }
}
