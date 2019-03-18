package UdemyJavaCourse.Section7.OOPMasterChallenge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DeluxeBurgerTest {

    @Test
    public void shouldReturnCorrectAmountForDeluxMeal() {
        // given
        DeluxeBurger deluxeBurger = new DeluxeBurger("Italian", "beef");
        deluxeBurger.setCheese(true);
        deluxeBurger.setLettuce(true);
        deluxeBurger.setPickle(true);
        deluxeBurger.setTomato(true);

        // when
        float totalCost = deluxeBurger.getTotalCost();

        // then
        assertThat(totalCost, is(10.3f));
    }
}
