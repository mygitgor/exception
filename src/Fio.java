
public class Fio {
    public String surname;
    public String name;
    public String patronymic;
    public String date;
    public int phone;
    public char sex;

     /*
     * 
    Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки,
    обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
     */

    public Fio() {}

    public Fio(String surname, String name, String patronymic, String date, int phone, char sex) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date = date;
        this.phone = phone;
        this.sex = sex;
    }

    /*
     * Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, 
     * обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
     */
    public String argumentControl(Fio fio) {
       
        if (fio.surname != null && fio.name != null && fio.patronymic != null && fio.date != null && fio.phone != 0 && fio.sex != ' ') {
            
            if (fio.surname.length() > 3 && fio.name.length() > 3 && fio.patronymic.length() > 3 && fio.date.length() > 3 && fio.phone > 0 && fio.sex != ' ') {
                
                if (fio.surname.length() < 10 && fio.name.length() < 10 && fio.patronymic.length() < 10 && fio.date.length() < 10 && fio.phone < 999999999 && fio.sex != ' ') {
                    return "данные корректны";
                } else {
                    throw new MaxIndexOutOfBoundsException();
                    //return "данные не корректны indexOutOfBoundsException";
                }
            } else {
                throw new MinIndexOutOfBoundsException();
                //return "Некорректные данные IndexOutOfBoundsException";
            }
        } else {
            throw new ExceptionEmptyElement();
            //return "зополняйте все поля";
        }
    }

    /*
     * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
     * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. 
     * Можно использовать встроенные типы java и создать свои. 
     * Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
     */

    
    public String toString() {
        return surname + " " + name + " " + patronymic + " " + date + " " + phone + " " + sex;
    }


}

class ExceptionEmptyElement extends NullPointerException {

    public ExceptionEmptyElement() {
        super("зополняйте все поля");
    }
}

class MaxIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public MaxIndexOutOfBoundsException() {
        super("вы нобрали много символов");
    }
}

class MinIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public MinIndexOutOfBoundsException() {
        super("вы нобрали меньше символов");
    }
}

