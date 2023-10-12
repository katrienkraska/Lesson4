package task2;

 abstract class AbstractHandler {
    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();
}

class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Відкрити XML-документ");
    }

    @Override
    public void create() {
        System.out.println("Створити XML-документ");
    }

    @Override
    public void change() {
        System.out.println("Редагувати XML-документ");
    }

    @Override
    public void save() {
        System.out.println("Зберегти XML-документ");
        System.out.println();
    }
}

class TXTHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Відкрити текстовий документ");
    }

    @Override
    public void create() {
        System.out.println("Створити текстовий документ");
    }

    @Override
    public void change() {
        System.out.println("Редагувати текстовий документ");
    }

    @Override
    public void save() {
        System.out.println("Зберегти текстовий документ");
        System.out.println();
    }
}

class DOCHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Відкрити документ Microsoft Word");
    }

    @Override
    public void create() {
        System.out.println("Створити документ Microsoft Word");
    }

    @Override
    public void change() {
        System.out.println("Редагувати документ Microsoft Word");
    }

    @Override
    public void save() {
        System.out.println("Зберегти документ Microsoft Word");
    }
}

class Main{
    public static void main(String[] args) {
        AbstractHandler handler1 = new XMLHandler();
        AbstractHandler handler2 = new TXTHandler();
        AbstractHandler handler3 = new DOCHandler();

        handler1.open();
        handler1.create();
        handler1.change();
        handler1.save();

        handler2.open();
        handler2.create();
        handler2.change();
        handler2.save();

        handler3.open();
        handler3.create();
        handler3.change();
        handler3.save();
    }
}