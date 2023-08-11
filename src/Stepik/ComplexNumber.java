

public final class ComplexNumber {
    private final double re;
    private final double im;
public static void main(String[] args) {
   ComplexNumber cNumber1 = new ComplexNumber(1.1, 3.3);
ComplexNumber cNumber2 = new ComplexNumber(4.1, 5.3);
System.out.println(cNumber1.hashCode());
System.out.println(cNumber2.hashCode());
}
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
   
    @Override
public boolean equals(Object o) {  
    if (this == o) { // проверяет, ссылаются ли два объекта на одну и ту же область памяти. 
        return true;       // Если это условие истинно, то это означает, что оба объекта являются одним и тем же экземпляром класса (то есть это один и тот же объект).
        // Таким образом, если `this == o` вернуло `true`, метод `equals()` немедленно возвращает `true`
    }
    if (o == null || getClass() != o.getClass()) { // Проверка на null и на принадлежность к одному классу
        return false;
    }
    ComplexNumber other = (ComplexNumber) o; // Приведение объекта `o` к типу `ComplexNumber` необходимо, чтобы 
            // мы могли обращаться к полям `re` и `im` данного объекта и сравнивать их со значениями полей 
            // текущего объекта `this`
    return Double.compare(other.re, re) == 0 && Double.compare(other.im, im) == 0; // происходит сравнение полей `re` и `im` текущего объекта 
         // `this` с полями объекта `other`.  Метод `Double.compare(a, b)` сравнивает два значения типа `double`
         // и возвращает результат сравнения в виде числа. В данном случае, мы используем `Double.compare` 
         // для сравнения значений `re` и `im` двух объектов типа `ComplexNumber`. 
        //Если результаты сравнения равны нулю, это означает, что значения полей `re` и `im` обоих объектов идентичны.
}

@Override
public int hashCode( ) {
    int result = 17; // переменная, в которой будет накапливаться итоговый хэш-код объекта. Зачастую для начального 
                 //значения `result` выбирают некоторое простое число, например, 17. Это простое число использовано для 
                 // уменьшения коллизий и достижения равномерного распределения хэш-кодов.
    long temp = Double.doubleToLongBits(re); //  временная переменная, в которой будет храниться битовое представление 
                // числа `re`. Метод `Double.doubleToLongBits(re)` преобразует число `re` типа `double` 
                // в его битовое представление типа `long` - используется для расчета хэш-кода 
        result = 31 * result + (int) (temp ^ (temp >>> 32)); // 31 обычно используется при вычислении хэш-кода 
                // объектов для обеспечения равномерного распределения значений хэш-кодов.
                // int) (temp ^ (temp >>> 32))` используется для комбинирования битов переменной 
                // `temp` с её сдвигом на 32 бита вправо или операции XOR (исключающее ИЛИ).
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

/*Рефлексивность.

Любой объект должен быть equals() самому себе.
Мы уже учли это требование. В нашем методе указано:

 

if (this == o) return true;
 

Симметричность.

Если a.equals(b) == true, то и b.equals(a) должно возвращать true.
Этому требованию наш метод тоже соответствует.

Транзитивность.

Если два объекта равны какому-то третьему объекту, значит, они должны быть равны друг и другу.
Если a.equals(b) == true и a.equals(c) == true, значит проверка b.equals(c) тоже должна возвращать true.

Постоянность.

Результаты работы equals() должны меняться только при изменении входящих в него полей. Если данные двух объектов не менялись, результаты проверки на equals() должны быть всегда одинаковыми.

Неравенство с null.

Для любого объекта проверка a.equals(null) должна возвращать false
Это не просто набор каких-то «полезных рекомендаций», а именно жесткий контракт методов, прописанный в документации Oracle */