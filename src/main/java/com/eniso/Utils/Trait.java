package com.eniso.Utils;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nasreddine
 */
public class Trait {

    private Set<String> emails;

    public Trait() {
        emails = new HashSet<>();
    }

    public void extractMails(String chaine) {
        Pattern p = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(chaine);
        while (matcher.find()) {
            emails.add(matcher.group().toLowerCase());
        }
    }

    public Set<String> getEmails() {
        return emails;
    }

}
