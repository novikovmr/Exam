import java.io.IOException;
import java.util.Scanner;

import Exceptions.EmptyInputException;
import Exceptions.IncorrectDataFormatException;
import Exceptions.UserDataArrayLengthException;
import Exceptions.ValueException;
import Exceptions.WriteData;

public class UserData {
    public static void getData() throws EmptyInputException, UserDataArrayLengthException, NumberFormatException, ValueException, IncorrectDataFormatException, IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол;\n Формат даты рождения: дд.мм.гггг.\n Пол: f/m.");
        String userData = scanner.nextLine();

        if(userData.isEmpty()) {
            throw new EmptyInputException("Вы не ввели данные.");
        }

        //Убираем начальные и конечные пробелы.
        userData = userData.trim();
        String[] userDataArray = userData.split(" ");
        
        if(userDataArray.length == 6) {
            DataChecking.phoneNumberCheck(userDataArray[4]);
            DataChecking.genderCheck(userDataArray[5]);
            DataChecking.DateFormatCheck(userDataArray[3]);
            WriteData.createFile(userDataArray);
        }
        else{ 
            throw new UserDataArrayLengthException("Неправильный ввод. Проверьте формат ввода данных в соответствии с инструкцией выше");
        }
    }
}
