package com.example.lib;

import java.util.Scanner;

public class MyClass {public static void main (String[] args ) {
    Scanner scanner = new Scanner(System.in);
    Phone phone = new Phone(1,"µØ­³","af626","2010","$1000");
    Phone phone1 = new Phone(2,"µØ×â","6g416sd","2011","$2000");
    Phone phone2 = new Phone(3,"¤T¬P","sgd1","2022","$26256");
    Phone phone3 = new Phone(4,"¥|¼w","af616","2000","$2033");
    Phone phone4 = new Phone(5,"¤­ºÖ","fasd46a4","2020","$6526");
    phone.alldetailedprint();
    phone1.alldetailedprint();
    phone2.alldetailedprint();
    phone3.alldetailedprint();
    phone4.alldetailedprint();
}
}
