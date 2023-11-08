public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var firstName = "ivan";
        var middleName = "ivanov";
        var lastname = "ivanovich";
        var fullname = firstName + " " + middleName + " " + lastname + " ";
        System.out.println(fullname);

        System.out.println("задача 2");
        var firstname = "ivan";
        var middlename = "ivanov";
        var lastName = "ivanovich";
        var fullName = firstname + " " + middlename + " " + lastName + " ";
        fullName = fullName.toUpperCase();
        System.out.println(fullname.toUpperCase());
        System.out.println("Задача 3");
        var fIrstname = "Семён";
        var mIddlename = "ivanov";
        var lAstName = "Семёнович";
        var fUllName = fIrstname + " " + mIddlename + " " + lAstName + " ";
        fUllName=fUllName.replace("ё","е");
                System.out.println(fUllName);

    }
}

