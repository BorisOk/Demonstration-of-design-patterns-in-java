package by.boris.structuralPatterns.adapter;
/** Принтер, обьект который может печатать только одну страницу. */
public class Printer {
    public void print(String text) {
        System.out.println(text);
    }
}
