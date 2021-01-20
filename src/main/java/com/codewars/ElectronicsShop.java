package com.codewars;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.OptionalInt;

@Component
public class ElectronicsShop {
//    A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget.
//    Given price lists for keyboards and USB drives and a budget, find the cost to buy them.
//    If it is not possible to buy both items, return -1.

//    Example
//    b = 60
//    keyboards=[40,50,60]
//    drives = [5,8,12]
//    The person can buy a 40 keyboard + 12 USB drive = 52, or a 50keyboard + 8 USB drive = 58.
//    Choose the latter as the more expensive option and return 58.


    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       int price = -1;
       OptionalInt priceKeyboard = Arrays.stream(keyboards).min();
       OptionalInt priceDrive = Arrays.stream(drives).min();

       if((priceKeyboard.getAsInt() + priceDrive.getAsInt()) > b) return price;

        price = priceKeyboard.getAsInt() + priceDrive.getAsInt();

       for (int i = 0; i < keyboards.length; i++) {
           for (int j = 0; j < drives.length; j++) {
               if (keyboards[i] + drives[j] > price && keyboards[i] + drives[j] <= b){
                   price = keyboards[i] + drives[j];
               }
           }
        }

       return price;

    }
}
