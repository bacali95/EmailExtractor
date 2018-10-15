package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 *
 * @author Nasreddine
 */
public class PDFFiles implements MailList {

    protected File workFile;

    public PDFFiles() {
        workFile = null;
    }

    @Override
    public void setWorkFile(File newFile) {
        workFile = newFile;
    }

    @Override
    public Set<String> getList() {
        try {
            PDDocument doc = PDDocument.load(workFile);
            doc.getClass();
            if (!doc.isEncrypted()) {
                PDFTextStripperByArea stripper  = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);
                PDFTextStripper Tstripper = new PDFTextStripper();
                Trait newTrait = new Trait();
                newTrait.extractMails(Tstripper.getText(doc));
                return newTrait.getEmails();                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
