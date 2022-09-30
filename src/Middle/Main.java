package Middle;

public class Main {
    public static void main(String[] args) {

        Book [] books = new Book[11];  // Исходный список книг

        books[0] = new Book("Капитал", "Карл Маркс" , 1885);
        books[1] = new Book("Война и мир", "Лев Толстой" , 1970);
        books[2] = new Book("Мартин Иден", "Джек Лондон" , 1985);
        books[3] = new Book("Три товарища", "Э.М. Ремарк" , 1997);
        books[4] = new Book("Старик и море", "Э. Хеменгуэй" , 1992);
        books[5] = new Book("Алые паруса", "Александр Грин" , 1968);
        books[6] = new Book(null, null , 0);
        books[7] = new Book(null, null , 0);
        books[8] = new Book(null, null , 0);
        books[9] = new Book(null, null , 0);
        books[10] = new Book(null, null , 0);

        Book [] bookNew = new Book[11];   // Добавочный список книг

        bookNew[0] = new Book("Конвой PQ-17", "Валентин Пикуль" , 1995);
        bookNew[1] = new Book("Революция", "Владимир Ленин" , 1921);
        bookNew[2] = new Book("Тихий Дон", "Михаил Шолохов" , 1985);
        bookNew[3] = new Book("Живые и мертвые", "К. Симонов" , 1997);
        bookNew[4] = new Book("Огнём и мечём", "Г. Сенкевич" , 1992);

        books = addBooks ( books, bookNew);

        printListBooks (books);

    }
    // Мои методы ****************************************************************************************
        public static Book[] addBooks(Book[] books, Book[] bookNew) {
            int j = 0;
            // Находим своболную ячейку массива и записываем новую книгу:
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookName() == null) {
                    books[i] = bookNew[j];
                    j++;
                }
            }
            return books;
        }
        public static void printListBooks (Book[] books) {

            for (Book element : books) {
                System.out.println(element.getBookName() + " : " + element.getAutor() + " : " + element.getYearPublishing() + ".");
            }
        }

}  // скобка класса
