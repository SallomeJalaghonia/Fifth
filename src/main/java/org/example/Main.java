package org.example;
// მეხუთე დავალება
public class Main {
    public static void main(String[] args) {
        // ვიძახებ hasTeen მეთოდს
        hasTeen(13, 25, 40); // true
    }

    // ირკვევა არის თუ არა რიცხვები 13-19 ზე მეტი,ნაკლები,ტოლი
    public static void hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}