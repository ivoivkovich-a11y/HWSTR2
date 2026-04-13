void main() {
    {
        {
            // Задача №1
            System.out.println("Задача №1");
            String firstName = "Ivanov";
            String middleName = "Ivan";
            String lastName = "Ivanovich";
            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("fullName = " + fullName);

            // Задача №2
            System.out.println("Задача №2");
            String fullNameUppedrCase = fullName.toUpperCase();
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUppedrCase);
        }
        {
            // Задача №3
            System.out.println("Задача №3");
            String fullName = "Иванов Семён Семёнович";
            String fullNameNew = fullName.replace("ё","е");
            System.out.println("Данные Ф. И. О. сотрудника —" + fullNameNew);
        }
    }
}
