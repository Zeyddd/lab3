import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
public class ListTest {
    
    @Test
    public void testFilter() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> check = new ArrayList<>();
        check.add("a");
        check.add("b");
        check.add("c");

        StringChecker sc = new StringChecker() {
            public boolean checkString(String s){
                return true;
            }
        };
        assertEquals(check, ListExamples.filter(list, sc));
    }

    @Test
    public void testFilter2() {
        List<String> list = new ArrayList<>();

        List<String> check = new ArrayList<>();

        StringChecker sc = new StringChecker() {
            public boolean checkString(String s){
                return true;
            }
        };
        assertEquals(check, ListExamples.filter(list, sc));
    }

    @Test 
    public void testMerge1() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> check = new ArrayList<>();

        list.add("a");
        list2.add("b");
        check.add("a");
        check.add("b");

        assertEquals(check, ListExamples.merge(list, list2));
    }

    @Test 
    public void testMerge2() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> check = new ArrayList<>();

        list.add("a");
        list2.add("b");
        list2.add("c");
        check.add("a");
        check.add("b");
        check.add("c");

        assertEquals(check, ListExamples.merge(list, list2));
    }

    @Test 
    public void testMerge3() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> check = new ArrayList<>();

        list.add("a");
        list2.add("b");
        list.add("c");
        check.add("a");
        check.add("b");
        check.add("c");

        assertEquals(check, ListExamples.merge(list, list2));
    }

    @Test 
    public void testMerge4() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> check = new ArrayList<>();

        assertEquals(check, ListExamples.merge(list, list2));
    }
}
