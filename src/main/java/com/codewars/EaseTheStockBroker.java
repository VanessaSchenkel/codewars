package com.codewars;
//Clients place orders to a stockbroker as strings. The order can be simple or multiple or empty.
//
//        Type of a simple order: Quote/white-space/Quantity/white-space/Price/white-space/Status
//
//        where Quote is formed of non-whitespace character, Quantity is an int, Price a double (with mandatory decimal
//        point "." ), Status is represented by the letter B (buy) or the letter S (sell).
//
//        Example:
//        "GOOG 300 542.0 B"
//
//        A multiple order is the concatenation of simple orders with a comma between each.
//
//        Example:
//        "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B"
//
//        or
//
//        "ZNGA 1300 2.66 B,CLH15.NYM 50 56.32 B,OWW 1000 11.623 B,OGG 20 580.1 B"
//
//        To ease the stockbroker your task is to produce a string of type
//
//        "Buy: b Sell: s" where b and s are 'double' formatted with no decimal, b representing the total price of
//        bought stocks and s the total price of sold stocks.
//
//        Example:
//        "Buy: 294990 Sell: 0"
//
//        Unfortunately sometimes clients make mistakes. When you find mistakes in orders, you must pinpoint these
//        badly formed orders and produce a string of type:
//
//        "Buy: b Sell: s; Badly formed nb: badly-formed 1st simple order ;badly-formed nth simple order ;"
//
//        where nb is the number of badly formed simple orders, b representing the total price of bought stocks with
//        correct simple order and s the total price of sold stocks with correct simple order.
//
//        Examples:
//        "Buy: 263 Sell: 11802; Badly formed 2: CLH16.NYM 50 56 S ;OWW 1000 11 S ;"
//
//        "Buy: 100 Sell: 56041; Badly formed 1: ZNGA 1300 2.66 ;"
//
//        Notes:
//        If the order is empty, Buy is 0 and Sell is 0 hence the return is: "Buy: 0 Sell: 0".
//        Due to Codewars whitespace differences will not always show up in test results.
//        With Golang (and maybe others) you can use a format with "%.0f" for "Buy" and "Sell".

public class EaseTheStockBroker {
    public static String balanceStatements(String lst) {
        if (lst.isEmpty()) return "Buy: 0 Sell: 0";

        String[] splittedList = lst.split(", ");
        double totalPriceSold = 0;
        double totalPriceBought = 0;
        int badlyFormatted = 0;
        StringBuilder withErrors = new StringBuilder();

        for (String product : splittedList) {
            String[] splitedString = product.split("\\s");
            if (splitedString.length < 4) {
                badlyFormatted++;
                withErrors.append(product);
                withErrors.append(" ;");
            }

            String quote = splitedString[0];
            String quantity = splitedString[1];
            String price = splitedString[2];
            String status = splitedString[3];


            if (status.equals("B") && isFormattedCorrectly(quantity, price)) {
                totalPriceBought += Double.parseDouble(price) * Integer.parseInt(quantity);
            } else if (status.equals("S") && isFormattedCorrectly(quantity, price)) {
                totalPriceSold += Double.parseDouble(price) * Integer.parseInt(quantity);
            } else {
                badlyFormatted++;
                withErrors.append(product);
                withErrors.append(" ;");
            }

        }

        String roundedBuy = String.format("%.0f", totalPriceBought);
        String roundedSold = String.format("%.0f", totalPriceSold);

        String balance = "Buy: " + roundedBuy + " Sell: " + roundedSold;

        if (badlyFormatted > 0) {
            balance += "; Badly formed " + badlyFormatted + ": " + withErrors;
        }

        return balance;
    }

    private static boolean isFormattedCorrectly(String quantity, String price) {
        return !quantity.contains(".") && price.contains(".");
    }
}
