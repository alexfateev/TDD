import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    private PhoneBook phoneBook = new PhoneBook();
    @Test
    public void testAdd() {
        phoneBook = new PhoneBook();
        int count = phoneBook.add("name1", "012345");
        int result = phoneBook.add("name2", "012345");
        int expected = count + 1;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAddReplays() {
        phoneBook = new PhoneBook();
        int count = phoneBook.add("name1", "012345");
        int result = phoneBook.add("name1", "012345");
        int expected = count;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        String expected = "name1";
        String result = phoneBook.findByNumber("012345");
        Assertions.assertEquals(expected, result);
    }
}
