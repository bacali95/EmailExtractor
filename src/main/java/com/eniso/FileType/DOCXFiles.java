package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 *
 * @author Nasreddine
 */
public class DOCXFiles implements MailList {

    protected File workFile;

    public DOCXFiles() {
        workFile = null;
    }

    @Override
    public void setWorkFile(File newFile) {
        workFile = newFile;
    }

    @Override
    public Set<String> getList() {
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(workFile);
            XWPFDocument doc = new XWPFDocument(fs);
            XWPFWordExtractor extractor = new XWPFWordExtractor(doc);
            Trait newTrait = new Trait();
            newTrait.extractMails(extractor.getText());
            return newTrait.getEmails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
