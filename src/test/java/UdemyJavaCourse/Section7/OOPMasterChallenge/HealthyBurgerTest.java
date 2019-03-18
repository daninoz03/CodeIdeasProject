package UdemyJavaCourse.Section7.OOPMasterChallenge;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class HealthyBurgerTest {

    @Test
    public void shouldReturnCorrectValueForFullyLoadedHealthyBurger() {
        // given
        HealthyBurger healthyBurger = new HealthyBurger("Beef",false, true);
        healthyBurger.setCheese(true);
        healthyBurger.setTomato(true);
        healthyBurger.setPickle(true);
        healthyBurger.setLettuce(true);

        // when
        float totalCost = healthyBurger.getTotalCost();

        // then
        Assert.assertThat(totalCost, is(8.8f));
    }
}
