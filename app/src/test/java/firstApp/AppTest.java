/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package firstApp;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
   public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(App.searchDifference(array, 4,2));
    }

    @Test
    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.searchDifference(array, 5,0));
    }

    @Test
    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(App.searchDifference(array, 1,2));
    }

    @Test
    public void testNull() {
      assertFalse(App.searchDifference(null, 1,2));
    }

}
