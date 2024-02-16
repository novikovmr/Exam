/*
 * Фамилия Имя Отчество дата _ рождения номер _ телефона пол

Форматы данных:

фамилия, имя, отчество - строки
дата _ рождения - строка формата dd.mm.yyyy
номер _ телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно распарсить полученную строку и выделить из них требуемые значения. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
<Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */

import java.io.IOException;

import Exceptions.EmptyInputException;
import Exceptions.IncorrectDataFormatException;
import Exceptions.UserDataArrayLengthException;
import Exceptions.ValueException;

public class App {
    public static void main(String[] args) {
        try {
            UserData.getData();
        } catch (EmptyInputException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        } catch (UserDataArrayLengthException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        } catch (ValueException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        } catch (IncorrectDataFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        
        
        
        
    }
}
