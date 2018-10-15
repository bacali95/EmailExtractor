package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
/**
 *
 * @author Nasreddine
 */
public class DOCFiles implements MailList {

    protected File workFile;

    public DOCFiles() {
        workFile = null;
    }

    @Override
    public void setWorkFile(File newFile) {
        workFile = newFile;
    }

    @Override
    public Set<String> getList() {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(workFile);
            HWPFDocument doc = new HWPFDocument(fs);
            WordExtractor we = new WordExtractor(doc);
            Trait newTrait = new Trait();
            newTrait.extractMails(we.getText());
            return newTrait.getEmails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
