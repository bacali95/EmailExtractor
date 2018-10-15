package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.hslf.extractor.PowerPointExtractor;

/**
 *
 * @author Nasreddine
 */
public class PPTFiles implements MailList {

    protected File workFile;

    public PPTFiles() {
        workFile = null;
    }

    @Override
    public void setWorkFile(File newFile) {
        workFile = newFile;
    }

    @Override
    public Set<String> getList() {
        POIFSFileSystem fs = null;
        try {
            fs = new POIFSFileSystem(new FileInputStream(workFile));
            PowerPointExtractor extractor = new PowerPointExtractor(fs);
            Trait newTrait = new Trait();
            newTrait.extractMails(extractor.getText());
            return newTrait.getEmails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
