import java.util.Locale;
public class TaskSevenString {
    public static void main(String[] args) {
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));
        fullName = "Иванов Семён Семёнович";
        String[] str5 = fullName.split(" ");
        for (int i = 0; i < str5.length; i++) {
            if (str5[i].contains("ё")) {
                str5[i] = str5[i].replace("ё", "е");
            }
            System.out.print(str5[i] + " ");
        }
    System.out.println(fullName.replace("ё","е"));
    }
}
