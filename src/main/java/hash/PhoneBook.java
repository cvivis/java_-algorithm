package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PhoneBook {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < phone_book.length; i++) {
            set.add(phone_book[i]);
        }
//        Iterator<String> it = set.iterator();
        int len = 0;

        for (int i = 0; i < set.size(); i++) {
            len = phone_book[i].length();
            for (int j = 1; j < len; j++) {
//                System.out.println(phone_book[i].substring(0,j));
                if(set.contains(phone_book[i].substring(0,j)))return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] st= {"119", "97674223", "1195524421"};
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.solution(st));


    }
}
