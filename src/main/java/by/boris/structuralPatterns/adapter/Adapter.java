package by.boris.structuralPatterns.adapter;
import java.util.List;
/** Адаптер с помощью поторого мы печатаем не просто страницу, а сразу несколько (List) страниц. */
public class Adapter implements InterfaceAdapter {

    private final Printer printer;

    public Adapter() {
        printer = new Printer();
    }

    @Override
    public void printList(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
