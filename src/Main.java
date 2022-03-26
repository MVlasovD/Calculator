public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        //ArithmeticException: / by zero
        //переменная b в итоге арифметических действий равна 0, следовательно, код не скомпилируется из-за арифметического Исключения.
        //Решение:
        // можно реализовать логику проверки делителя (с помощью тернарного оператора или используя конструкции if-else, либо сделать блок try-catch и обработать ошибку)

        int c = calc.divide.apply(a, b);

        calc.println.accept(c);

//        решение с использованием доп. метода
//        System.out.println(ifDelimeterZero(a,b));

    }

    //метод для проверки делителя на ноль
    public static int ifDelimeterZero(int a, int b) {
        if (b == 0) {
            return 0;
        } else return a / b;
    }
}