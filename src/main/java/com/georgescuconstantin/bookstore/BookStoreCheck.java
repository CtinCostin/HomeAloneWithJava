package main.java.com.georgescuconstantin.bookstore;

public class BookStoreCheck {

    public boolean isTheBookDuplicate(Book book1, Book otherBook) {
        return book1.getTitle().equalsIgnoreCase(otherBook.getTitle());
    }

    public Book isBookThickerThanOther(Book book1, Book otherBook) {
        if (book1.getPageCount() > otherBook.getPageCount()) {
            return book1;
        }
        return otherBook;

    }



//    public boolean areUniqueStudents() {
//        List<Student> studentsTemp = new ArrayList<>();
//        for (Student student : this.studentList) {
//            boolean isPresentInList = studentsTemp.stream().anyMatch((Student stud) -> student.getLastName().equalsIgnoreCase(stud.getLastName()));
//            if (isPresentInList) {
//                System.out.println("In this group there are students duplicated !");
//                return false;
//            } else {
//                studentsTemp.add(student);
//            }
//
//        }
//        return true;
//    }
}
