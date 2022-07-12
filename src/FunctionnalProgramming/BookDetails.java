package FunctionnalProgramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookDetails {

    public static void main(String[] args) {
        List<book> bookDetailsList = List.of(
                new book("Just as I am","Novel",200.06),
                new book("The Vanishing Half","Comic",150.66),
                new book("The Midnight Library","Novel",300.25),
                new book("Untamed","Comic",56.70),
                new book("Viscount who loved me","Novel",413.25)
                );
        bookDetailsList.stream()
                .filter(Predicate.isEqual("Comic"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static class book{
        private String bookName;
        private String bookCategory;
        private double bookPrice;

    public book(String bookName, String bookCategory, double bookPrice) {
            this.bookName = bookName;
            this.bookCategory = bookCategory;
            this.bookPrice = bookPrice;
        }
    }
}


//        @Override
//        public String toString() {
//            return "Book{" +
//                    "bookName='" + bookName + '\'' +
//                    ", bookCategory='" + bookCategory + '\'' +
//                    ", bookPrice=" + bookPrice +
//                    '}';
//        }

