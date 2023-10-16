package org.example;

import java.util.Arrays;

/*
Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
Стараемся применять ООП и работу с файлами.
Если какой-то пункт не изучали и не знаете, как сделать, то можете сделать своим способом.
Например, у кого в курсе не было ООП, то применяем списки\массивы\словари

Желательный функционал программы:
В программе должен быть минимум один класс со следующими свойствами:
id игрушки,
текстовое название,
количество
частота выпадения игрушки (вес в % от 100)

Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
Возможность организовать розыгрыш игрушек.

Например, следующим образом:
С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив.
Это список призовых игрушек, которые ожидают выдачи.
Еще у нас должен быть метод – получения призовой игрушки.
После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив.
А эту игрушку записываем в текстовый файл.
Не забываем уменьшить количество игрушек

К написанию программы можно подойти более творчески и делать так, как Вы поняли задание.
Немного менять и отходить от примера выше.

Если будут вопросы-предложения, то пишите в личные сообщения

 */
public class Main {

    public static void main(String[] args) {

        ToyConstructor lego = new ToyConstructor("lego", 2);
        ToyConstructor duplo = new ToyConstructor("duplo", 2);
        ToyCar macquien = new ToyCar("Macquien", 2);
        ToyDoll barbie = new ToyDoll("barbie", 5);
        Store storToys = new Store();
        storToys.addToy(lego,2);
        storToys.addToy(duplo,5);
        storToys.addToy(macquien,1);
        storToys.addToy(barbie,2);
        storToys.printList();
        storToys.removeToy(barbie,2);
        storToys.printList();
        Draw onedraw = new Draw();
        onedraw.addDraw(storToys.getToy(1));
        MyFileWriter writToy = new MyFileWriter();
        writToy.myWriter(onedraw.takeToy().toString());


    }


}
