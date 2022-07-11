import java.util.Objects;

public class Test_book {
    public static void main(String[] args) {

        ProgrammingBook book1 = new ProgrammingBook("1abc", "JAVA1", 100, "author 1", "english");
        ProgrammingBook book2 = new ProgrammingBook("2abc", "JAVA2", 150, "author 2", "english");
        ProgrammingBook book3 = new ProgrammingBook("3abc", "JAVA3", 200, "author 3", "english");
        ProgrammingBook book4 = new ProgrammingBook("4abc", "JAVA4", 180, "author 4", "english");
        ProgrammingBook book5 = new ProgrammingBook("5abc", "JAVA5", 150, "author 5", "english");


        FictionBook fc1 = new FictionBook("abc1", "history1", 50, "nam1", "Viễn tưởng 1");
        FictionBook fc2 = new FictionBook("abc2", "history2", 100, "nam1", "Viễn tưởng 2");
        FictionBook fc3 = new FictionBook("abc3", "history3", 150, "nam1", "Viễn tưởng 3");
        FictionBook fc4 = new FictionBook("abc4", "history4", 200, "nam1", "Viễn tưởng 4");
        FictionBook fc5 = new FictionBook("abc5", "history5", 250, "nam1", "Viễn tưởng 5");
        double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice() + book4.getPrice() + book5.getPrice()
                + fc1.getPrice() + fc2.getPrice() + fc3.getPrice() + fc4.getPrice() + fc5.getPrice();
        System.out.println("Total price is: " + totalPrice);

        String[] javaLanguage = {book1.getLanguage(), book2.getLanguage(), book3.getLanguage(), book4.getLanguage(), book5.getLanguage()};
        int count = 0;
        String[] javaLanguague = new String[0];
        for (String s : javaLanguague) {
            if (Objects.equals(s, "Java")) {
                count++;
            }
        }
        System.out.println(count + " Java books");
        String[] fictionCategory = {fc1.getCategory(), fc2.getCategory(), fc3.getCategory(), fc4.getCategory(), fc5.getCategory()};
        int count1 = 0;
        for (String k : fictionCategory) {
            if (Objects.equals(k, "Fiction1")) {
                count1++;
            }
        }
        System.out.println(count1 + " Fiction1 books");

        double[] lowPrice = {fc1.getPrice(), fc2.getPrice(), fc3.getPrice(), fc4.getPrice(), fc5.getPrice()};
        int count2 = 0;
        for (double v : lowPrice) {
            if (v <= 100000) {
                count2++;
            }
        }
        System.out.println(count2 + " books with price lower or equal to 100000");
    }
}
