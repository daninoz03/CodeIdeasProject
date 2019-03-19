package UdemyJavaCourse.Section8.ArrayListChallenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class MobilePhoneTest {

    private ArrayList<Contact> contacts = new ArrayList<>();

    private MobilePhone mobilePhone = new MobilePhone();

    @Before
    public void setUp() {
        contacts.add(new Contact("Dan", "12345"));
        contacts.add(new Contact("John", "087212"));
        contacts.add(new Contact("Sarah", "086543"));
        mobilePhone.setMyContacts(contacts);
    }

    @Test
    public void shouldReturnIndexWhenSearchingForContact() {
        // given

        // when
        int returnedIndex = mobilePhone.findContact("Sarah");

        // then
        Assert.assertThat(returnedIndex, is(2));
    }

    @Test
    public void shouldReturnCorrectIndexAfterAddingContact() {
        // given
        Contact contact = new Contact("Ally", "085123");
        // when
        boolean contactWasAdded = mobilePhone.storeContact(contact);

        // then
        Assert.assertThat(contactWasAdded, is(true));
        Assert.assertThat(mobilePhone.findContact("Ally"), is(3));
    }

    @Test
    public void shouldReturnCorrectIndexAfterUpdatingContact() {
        // given
        Contact contact = new Contact("DanNew", "54321");
        // when
        mobilePhone.updateContact("Dan", contact);

        // then
        Assert.assertThat(mobilePhone.findContact("DanNew"), greaterThan(-1));
    }

    @Test
    public void shouldRemoveContact() {
        // given

        // when
        mobilePhone.removeContact("Dan");

        // then
        Assert.assertThat(mobilePhone.findContact("Dan"), is(-1));
    }
}
