package ru.otus.java.basic.safarov.homework04;

public class Box {

    private final int width;
    private final int lenght;
    private final int heigth;
    private String color;
    private boolean isOpen;
    private String inside;

    public Box(int width, int lenght,  int heigth, String color) {
        this.width = width;
        this.lenght = lenght;
        this.heigth = heigth;
        this.color = color;
        isOpen = false;
        inside = "";
        System.out.println("Создана коробка.\n" + toString());
    }

    @Override
    public String toString() {
        return "Коробка: \n" +
                "\tразмеры ширина: " + width +
                ", длина: " + lenght +
                ", высота: " + heigth +
                "\n\tцвет: " + color +
                "\n\tкоробка " + (isOpen? "открыта":"закрыта") +
                "\n\t" + (inside.isEmpty() ?"в коробке ничего нет":"в коробке лежит " + inside);
    }

    public void open() {
        if (isOpen){
            System.out.println("Коробка уже открыта.");
            return;
        }
        isOpen = true;
        System.out.println("Коробка открыта.");
    }
}


//   - объекты класса Коробка должны иметь размеры и цвет.
//        - Коробку можно открывать и закрывать.
//   - Коробку можно перекрашивать.
//   - Изменить размер коробки после создания нельзя.
//        - У коробки должен быть метод, печатающий информацию о ней в консоль.
//        - В коробку можно складывать предмет (если в ней нет предмета), или выкидывать
//его оттуда (только если предмет в ней есть), только при условии что коробка
//открыта (предметом читаем просто строку).
//        - Выполнение методов должно сопровождаться выводом сообщений в консоль.