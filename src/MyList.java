import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class MyList{

    public static void MyList() throws IOException {

        FileWriter fileWriter = new FileWriter("TestMyList.txt", StandardCharsets.UTF_8);   // Запис даних в файл

        Scanner newName = new Scanner(System.in);  // Сканер для введеного імені - Стрінговий
        Scanner newIndx = new Scanner(System.in); // Сканер для індексу - інтовий

        ArrayList<String> List = new ArrayList<>();    // створюємо список + декілька значень
        List.add(0, "Anton");
        List.add(1, "Vadim");
        List.add(2, "Oleksandr");
        List.add(3, "Sergii");
        List.add(4, "Irina");
        List.add(5, "Juliya");
        List.add(6, "Nikolai");
        List.add(7, "Andrii");
        List.add(8, "Oleg");
        List.add(9, "Jurii");

        for (int i = 0; i < 10; i++) {   // через цикл повторюємо ввод даних в список через ітерацію 10 разів
            String name = newName.nextLine();
            System.out.println(List.add(name) + " ");    // додоча одиниці в список через метод .add = ( name )  де  name значення введене через сканер
            System.out.println("Ви добавили в список ім'я " + name);   // Показуємо що ми ввели
            System.out.println("У списку " + List.size() + " індексів");  // показуємо скільки в списку індексів
            System.out.println(List);   // показуємо  остаточний список після внесеного значення

            fileWriter.write(List.add(name) + " \n");                    // Тестово зробив запис у файл аби було =)
            fileWriter.write("Ви добавили в список ім'я " + name + "\n");
            fileWriter.write("У списку " + List.size() + " індексів \n");
            fileWriter.write(List.toString());
        }
        System.out.println();   // просто відступ
        System.out.println("Введіть індекс щоб дізнатись ім'я ");    // запит на виведення значення по його індексу
        int indx = newIndx.nextInt();    // вносимо номер індексу що не має перевищувати кількість індексів в списку
        if (indx <= List.size()) {   // первірка через if elsr на вірність внесеного числа індексів
            System.out.println("Введений Вами індекс " + indx + " в списку належить :" + List.get(indx));
            fileWriter.close();   // закриваємо потік
        } else {
            System.out.println("Вказаний Вами індекс виходить за рамки списку " + List.size());   // вивід помилки у випадку внесеного числа що перевищує суму індексів
        }
    }

    public static void main(String[] args) throws IOException {     // точка входу в клвсі
        MyList();
    }
}


//
//    Создайте проект, используя IntelliJ IDEA. Создайте класс MyList. +
//        Реализуйте в простейшем приближении возможность использования его экземпляра аналогично экземпляру класса List.+
//        Минимально требуемый интерфейс взаимодействия с экземпляром,+
//        должен включать метод добавления элемента,+
//        индексатор для получения значения элемента по указанному индексу+
//        и свойство только для чтения для получения общего количества элементов.+