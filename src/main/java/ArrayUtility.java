
public class ArrayUtility {

    private int [] data;

    public ArrayUtility(int[] data) {
        this.data = data;
    }

    //функция должна возвращать сумму элементов массива
    public long arraySum() {

        long sum = 0;
        for (int integer : data) {
            sum += (long) integer;
        }

        return sum;
    }

    //функция должна возвращать среднее арифметическое
    //элементов массива
    public double avg() {

        double avg = 0.;

        for (int integer : data) {
            avg += (double) integer;
        }
        avg /= data.length;

        return avg;
    }

    //функция должна возвращать медиану массива
    //медиана - это элемент посередине в упорядоченном массиве для
    //нечетных длин массива
    //или среднее арифметическое двух соседних элементов посередине
    //для четных длин
    //1 2 3 4 5 - 3
    //1 2 3 4 - (2 + 3) / 2 = 2,5
    public double median() {

        if (data.length % 2 == 0) {
            return (double) (data[data.length / 2 - 1] + data[data.length / 2]) / 2;
        }

        return (double) data[data.length / 2];
    }

    //Поначалу хотел использовать следующую конструкцию для получения нужных позиций:
    //return data[(int) Math.floor(data.length / 2)]
    //но проведя следующий тест выяснил, что при касте double к int и так всегда идет округление вниз
    public int castDoubleToInt(double aDouble){
        return (int) aDouble;
    }

}
