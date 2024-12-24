package Interface;

public class BeginStringFilter implements Filter {
    private final String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;//хранит строку-шаблон, с которой будет сравниваться начало строки
    }

    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }
}

