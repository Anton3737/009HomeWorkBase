import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MyDictionary {


    static class MyDictionaryMethod<TIPE1, TIPE2> {    // Створюємо клас з двума дженериками
        public TIPE1 varibles1;                  // присваюємо поля з типом даних дженерик
        public TIPE2 varibles2;

        public MyDictionaryMethod(TIPE1 varibles1, TIPE2 varibles2) {     // викликаємо конструктор з параметрами
            this.varibles1 = varibles1;              // робимо на них посилання
            this.varibles2 = varibles2;
        }


        public static void main(String[] args) throws IOException {          // точка входу
            FileWriter fileWriter = new FileWriter("TestMyList.txt" , StandardCharsets.UTF_8);        // просто добавив запис в файл
            Scanner mydictionary = new Scanner(System.in);  // сканер для вводу в консоль
            String word = mydictionary.nextLine();     // ініціалізуємо змінну для сканера

            MyDictionaryMethod<String, String> myDictionary = new MyDictionaryMethod<>( word, word);   // створюємо об'єкт  з двума типами даних Дженерик String як вказано в класі і вказуємо 2 параметри
            System.out.println(myDictionary.varibles2 + " " + myDictionary.varibles1);     // викликаємо через SOUT імя класу + поле


            MyDictionaryMethod<Integer, Integer> myDictionary1 = new MyDictionaryMethod<>( 1111, 2222); // створюємо об'єкт  з двума типами даних Дженерик Integer як вказано в класі і вказуємо 2 параметри
            System.out.println(myDictionary1.varibles1 + " " + myDictionary1.varibles2);


            MyDictionaryMethod<Integer, String> myDictionary3 = new MyDictionaryMethod<>(2022, "Hallo");  // створюємо об'єкт  з двума типами даних Дженерик Integer + String як вказано в класі і вказуємо 2 параметри
            System.out.println(myDictionary3.varibles2 + " " + myDictionary3.varibles1);
        }


    }
}
