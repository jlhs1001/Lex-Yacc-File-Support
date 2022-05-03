package seewald.lexyaccfilesupport;

import com.intellij.lang.Language;

public class Yacc extends Language {

    public static final Yacc INSTANCE = new Yacc();

    private Yacc() {
        super("Yacc");
    }
}
