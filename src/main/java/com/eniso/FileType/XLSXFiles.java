package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.extractor.XSSFExcelExtractor;

/**
 *
 * @author Nasreddine
 */
public class XLSXFiles implements MailList {

    protected File workFile;

    public XLSXFiles() {
        workFile = null;
    }

    @Override
    public void setWorkFile(File newFile) {
        workFile = newFile;
    }

    @Override
    public Set<String> getList() {
        try {
            XSSFWorkbook wb = new XSSFWorkbook(workFile);
            XSSFExcelExtractor extractor = new XSSFExcelExtractor(wb);
            Trait newTrait = new Trait();
            newTrait.extractMails(extractor.getText());
            return newTrait.getEmails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
