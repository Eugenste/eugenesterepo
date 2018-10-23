package ua.training.controller;

import java.util.regex.Pattern;

public interface Regex {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String NAME_REGEX_EN = "^[A-Za-z']+$";

    Pattern INDEX_REGEX = Pattern.compile("[0-9]{5}");
    Pattern DIGIT_REGEX = Pattern.compile("[0-9]+");
    Pattern NAME_REGEX = Pattern.compile("[A-Za-z']+");
    Pattern ADDRESS_REGEX = Pattern.compile("[a-zA-Z]+[[ '-]?[a-zA-Z]+]*");

    Pattern NICKNAME_REGEX = Pattern.compile("[A-Za-z0-9@()_']+");
    // +38 044 555 55 55
    Pattern REGEX_MOBILE_PHONE = Pattern.compile("[0-9]{10}");
    // mail@mail.com
    Pattern REGEX_MAIL = Pattern.compile("([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}");
}
