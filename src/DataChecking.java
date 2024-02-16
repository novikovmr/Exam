import Exceptions.IncorrectDataFormatException;
import Exceptions.ValueException;


public class DataChecking {
    /**
     * 
     * @param gender - Пол (f или m)
     * @throws ValueException - Неправильно указано значение параметра gender
     */
    public static void genderCheck(String gender) throws ValueException{
        if(gender.length() == 1) {
            gender = gender.toLowerCase();
            if(gender.equals("m") || gender.equals("f")) {
                char[] genderArray = gender.toCharArray();
                char convertGender = genderArray[0];
            }
            else {
                throw new ValueException("Неправильно указан пол.\n Введите пол в формате m/f.");
            }
        }
        else{ 
            throw new ValueException("Неправильно указан пол.\n Введите пол в формате m/f (Только один символ!)");
        }
    }

    /**
     * 
     * @param phoneNumber = номер телефона
     * @throws ValueException - Неправильное кол-во цифр в номере
     * @throws NumberFormatException - Ошибка формата данных, номер должен быть Integer
     */
    public static void phoneNumberCheck(String phoneNumber) throws ValueException, NumberFormatException {
        if(phoneNumber.length() == 11) {
            try {
                long checkNum = Long.parseLong(phoneNumber);
            }
            catch(NumberFormatException e){
                throw new NumberFormatException("Непраильный вормат ввода номера, введите номер в формате 89001111222");
            }
        }
        else {
            throw new ValueException("Неправильный формат номера телефона. Должно быть 11 цифр.");
        }
    }

    /**
     * 
     * @param date дата рождения
     * @throws IncorrectDataFormatException - Неверный формат даты
     */
    public static void DateFormatCheck(String date) throws IncorrectDataFormatException{
        char[] dateCheckData = date.toCharArray();
        if (dateCheckData.length == 10 & (dateCheckData[2] == '.' && dateCheckData[5] == '.'));
        else {
            throw new IncorrectDataFormatException("Формат даты рождения введен неверно. Проверьте введенные данные. Формат даты: dd.mm.yyyy");
        }
    }
}
