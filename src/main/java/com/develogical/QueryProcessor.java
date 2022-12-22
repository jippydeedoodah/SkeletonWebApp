package com.develogical;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("edgar")) {
            return "Edgar Allan Poe (January 19, 1809 – October 7, 1849) was an " +
                    "American writer, poet, editor, and literary critic. Poe is " +
                    "best known for his poetry and short stories, particularly " +
                    "his tales of mystery and the macabre. He is widely regarded " +
                    "as a central figure of Romanticism in the United States, " +
                    "and of American literature. ";
        }
        return "";
    }
    
}
