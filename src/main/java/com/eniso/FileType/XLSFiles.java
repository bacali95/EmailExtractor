package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author Nasreddine
 */
public class XLSFiles implements MailList {

    protected File workFile;

    public XLSFiles() {
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
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            ExcelExtractor extractor = new ExcelExtractor(wb);
            Trait newTrait = new Trait();
            newTrait.extractMails(extractor.getText());
            return newTrait.getEmails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
