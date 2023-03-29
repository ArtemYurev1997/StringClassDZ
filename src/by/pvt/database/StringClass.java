package by.pvt.database;

public class StringClass {
    public static void main(String[] args) {
        String text  = "������ ������, ����������� � ������� ��������� new, �������� (����������� � ������� ���������) " +
                "��� ������ ������, ���������� ������, �������� ����������� ������ String. ������������ ������� ������ String ��������" +
                " ��, ��� ��� �������� �� ����� ���� �������� ����� �������� ������� ��� ������" +
                " ������ ������ ������. ��������� ������ ������ �������� � �������� ������" +
                " ������� � heap. ���� ��������� ������ ��� ���� ��������� ������� ��������" +
                " � �������� � �����. ������������� ��������� ����� ��������� ����������������� ������";

        String text1  = "��1�� ������� 8 ������� 1998 ����[12]. ������� ��� Playground. � ������ ������ ����������� ��������. " +
                "����������� �����, ��������, Beginning Java 2 by Ivor Horton (Mar 1999), ���������� �� J2SE 1.2 (������ �������� � Java 2). " +
                "������ � ��� �� ��� ���� ����� ����� �����������, ��������: �. �. ������, �. ��. ������, �. �. ������. " +
                "���������� ���������������� �� Java 2. ������������� ���������� (2011). " +
                "� �� �����, �����, ��� ��������, Java 2 ���� ����������� �������� ���������� ��������, �������� �������� ���� �������������� � ���������, " +
                "� ����� �� ������ Java ��� �������� �� ����� ����. ���� J2SE 1.2 ������� ������� �� Java 2, � ������ ���� �� Java 2 ��������� JDK 7, ��� �������� � ������ ��������.";

        method1(text, 1, "abc");
        method2(text, "���", "NIE");
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
        String result =str.replaceAll("[^A-Za-z�-��-�0-9]", " ");
        System.out.print(result);
        System.out.println();
    }
}
