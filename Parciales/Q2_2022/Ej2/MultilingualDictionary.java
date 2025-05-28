package Parciales.Q2_2022.Ej2;

import com.sun.source.tree.Tree;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MultilingualDictionary {
    private final Language originalLanguage;
    private final Map<Language, Map<String, String>> dictionary;

    public MultilingualDictionary(Language language){
        originalLanguage = language;
        dictionary = new EnumMap<>(Language.class);
    }

    public MultilingualDictionary addTranslation(String original, Language language, String translation){
        if(originalLanguage.equals(language)){
            throw new IllegalArgumentException(String.format("Cannot add %s translations", originalLanguage.name()));
        }
        dictionary.putIfAbsent(language, new HashMap<>());
        dictionary.get(language).putIfAbsent(original, translation);
        return this;
    }

    public String getTranslation(String original, Language language){
        if(!dictionary.getOrDefault(language, new HashMap<>()).containsKey(original)){
            throw new IllegalArgumentException(String.format("No %s translation for %s", language.name(), original));
        }
        return dictionary.getOrDefault(language, new HashMap<>()).get(original);
    }

    public int translationsCount(Language language){
        return dictionary.get(language).size();
    }

    public int removeTranslations(Language language){
        int removedAmount = translationsCount(language);
        dictionary.remove(language);
        return removedAmount;
    }

}
