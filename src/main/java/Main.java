public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Александр";
        post.passport = "1111 № 11111111";
        post.patronymic = "Александрович";
        post.phone = "+7(900)-000-00-00";
        post.surname = "Александров";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 10;
        post.birthday.year = 2000;
    }
}
