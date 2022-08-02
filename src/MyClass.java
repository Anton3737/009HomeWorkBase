public class MyClass {
    // перший метод те Т вказуємо як дженерик в методі і прокидуємо його через параметри
    static <T> void factoryMethod(T nameVaribles) {  // створюємо статичний метод з дженериком <T> Type і закидуємо в рпреметри методу
        T Tipes = nameVaribles;      // парамтеметру Т вказуємо місце в параметрі методу
        System.out.println(Tipes);    // виводимо аргумент методу в консоль
    }

    // другий метод Т вказуємо в класі і через поле
    static class FactoryMethodNew<T> {
        public T place;        // визначаємо поля

        public void MethodOut() {
            System.out.println(place.toString());   // приводимо поле place до строкового значення через метод .toString()
        }

    }

    // варіант номер 3 через конструктор

    static class FactoryMethodSecon<T> {

        public T place1;

        public FactoryMethodSecon(T argument) {
            this.place1 = argument;
        }

    }

    public static void main(String[] args) {        // в точці входу в програму
        MyClass nameOfobject = new MyClass();       // створюємо обєкт від похідного класу MyClass з іменем nameOfobject


        nameOfobject.factoryMethod("Строковоє значениє");   // імя обєкта  + фабричний метод (задаємо значення аргументу) - повертаємось в рядок №5 SOUT і вивобимо всі наші методи
        nameOfobject.factoryMethod("Аргумент");
        nameOfobject.factoryMethod(1234567890 + " int value");
        nameOfobject.factoryMethod(1.12321342112 + " long value");

        System.out.println();

        FactoryMethodNew<String> factoryMethodNew = new FactoryMethodNew<>();  // створюємо об'єкт
        factoryMethodNew.place = "New string value ";    // вказуємо строкове значення через схуму імя обєкту factoryMethodNew + поле place
        factoryMethodNew.MethodOut();  // викликаємо метод з SOUT де вказоно що ми привожимо все до текстового значення

        System.out.println();

        FactoryMethodSecon<String> factoryMethodSecon = new FactoryMethodSecon<>("Текст в параметрах об'єкта factoryMethodSecon заданого через конструктор з дженериком <T>");
        System.out.println(factoryMethodSecon.place1); // імя обєкту factoryMethodSecon + імя поля place1 для виводу аргументу що було задано в створеному об'єкті

    }
}


