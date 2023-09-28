package com.sample.util;

import java.util.Random;

public class RandomDataGenerator {
    private static final String[] PREFIXES = {
            "John", "Emily", "Michael", "Jessica", "David", "Sarah", "William", "Jennifer",
            "James", "Elizabeth", "Robert", "Emma", "Mary", "Daniel", "Laura", "Richard"
    };

    private static final String[] MIDDLE_PARTS = {
            "son", "ville", "field", "ford", "ton", "land", "stone", "berg", "brook", "ville"
    };

    private static final String[] SUFFIXES = {
            "son", "berg", "ford", "man", "ton", "land", "field"
    };

    public static String generateRandomName() {
        Random random = new Random();

        String prefix = PREFIXES[random.nextInt(PREFIXES.length)];
        String middlePart = MIDDLE_PARTS[random.nextInt(MIDDLE_PARTS.length)];
        String suffix = SUFFIXES[random.nextInt(SUFFIXES.length)];

        return prefix + " "+middlePart;
    }

    private static final String[] SUBDOMAINS = {
            "www", "blog", "shop", "news", "forum", "support"
    };
    private static final String[] DOMAIN_NAMES = {
            "example", "randomsite", "webgen", "site123", "yourweb", "myweb"
    };
    private static final String[] TOP_LEVEL_DOMAINS = {
            "com", "net", "org", "io", "co", "xyz"
    };
    public static String generateRandomWebUrl() {
        Random random = new Random();

        String subdomain = SUBDOMAINS[random.nextInt(SUBDOMAINS.length)];
        String domainName = DOMAIN_NAMES[random.nextInt(DOMAIN_NAMES.length)];
        String topLevelDomain = TOP_LEVEL_DOMAINS[random.nextInt(TOP_LEVEL_DOMAINS.length)];

        return subdomain + "." + domainName + "." + topLevelDomain;
    }
    private static final String[] Firearms = {
            "AOW", "Machinegun", "Pistol", "Revolver", "SBR", "SBS" , "Shotgun"
    };
    public static String generateRandomFirearms(){
        Random random = new Random();
        return Firearms[random.nextInt(Firearms.length)];
    }
}
