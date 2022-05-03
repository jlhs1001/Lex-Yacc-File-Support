package seewald.lexyaccfilesupport;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class YaccFileType extends LanguageFileType {

    public static final YaccFileType INSTANCE  = new YaccFileType();

    private YaccFileType() {
        super(Yacc.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Yacc File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Yacc language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "y";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SimpleIcons.FILE;
    }
}
