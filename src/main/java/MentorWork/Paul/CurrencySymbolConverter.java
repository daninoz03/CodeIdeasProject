package MentorWork.Paul;

import java.util.ArrayList;
import java.util.List;

public class CurrencySymbolConverter {

    private List<String> convertCurrencyToSymbol(List<String> list) {

        for (int i=0; i<list.size();i++) {
            if (list.get(i).toLowerCase().contains("euro")) {
                list.set(i, replaceCurrencyWithSymbol(list.get(i)));
            }
        }
        return list;
    }

    private String replaceCurrencyWithSymbol(String currency) {
        return currency.replace("euro","€");
    }

    private void go(String a){

    }

    public static void main(String[] args) {
        new CurrencySymbolConverter().go("blah");

        String name = "Dan";
        name = name.concat("OBrien");
        System.out.println(name);

        int x =1;
        x++;
        System.out.println(x);

        Integer y = 10;
        y++;
        System.out.println(y);


        /**
         * 1. Add code to the above methods (the entry method will be convertCurrencyToSymbol()) to swap the name of
         * the Euro currency with the € symbol.
         * Return this in a list and print out each item.
         *
         * Example:
         * Input:
         * Alan - Euro
         * Bob - Sterling
         * Frank - Euro
         *
         * Output:
         * Alan - €
         * Bob - Sterling
         * Frank - €
         */
        List<String> customersMainCurrency = new ArrayList<>();
        customersMainCurrency.add("Alan - euro");
        customersMainCurrency.add("Bob - Sterling");
        customersMainCurrency.add("Frank - Euro");

        CurrencySymbolConverter currencySymbolConverter = new CurrencySymbolConverter();

        List<String> returnedString = currencySymbolConverter.convertCurrencyToSymbol(customersMainCurrency);


        returnedString.forEach(System.out::println);

        /**
         * 2. Bonus: Do the conversions regardless of the case of the currency.
         *
         * Example:
         * Input:
         *  Alan - euro
         *  Bob - Sterling
         *  Frank - EURO
         *
         * Output:
         *  Alan - €
         *  Bob - Sterling
         *  Frank - €
         */

        /**
         * 3. Bonus: Make the code more robust by telling the method what currency you want to convert to what symbol
         * Example 1:
         * You want the method to convert sterling to £ symbol
         * Input:
         *  Alan - Euro
         *  Bob - Sterling
         *  Frank - Euro
         *
         * Output:
         *  Alan - Euro
         *  Bob - £
         *  Frank - Euro
         */

        /**
         * 4. Bonus: If a person does not have a currency then we default them to the dollar
         * Example:
         * You want the method to convert sterling to £ symbol
         * Input:
         *  Alan - Euro
         *  Bob - Sterling
         *  Frank - Euro
         *  Mike -
         *
         * Output:
         *  Alan - Euro
         *  Bob - £
         *  Frank - Euro
         *  Mike - $
         */

        /**
         * 5. Create a new method that only takes the list as an input param and converts all currency strings to symbols
         * Example:
         * The new method takes in the list and converts all the currencies to their equivalent symbols.
         * If one is not present OR it cannot be found then default to the dollar symbol.
         * Input:
         *  Alan - Euro
         *  Bob - Sterling
         *  Frank - Euro
         *  Mike -
         *  Mitch - madeUpCurrency
         *
         * Output:
         *  Alan - €
         *  Bob - £
         *  Frank - €
         *  Mike - $
         *  Mitch - $
         */



    }
}
