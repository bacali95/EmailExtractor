package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

/**
 *
 * @author Nasreddine
 */
public class CSVFiles implements MailList {

    protected File workFile;

    public CSVFiles() {
        workFile = null;
    }

    @Override
    public void setWorkFile(File newFile) {
        workFile = newFile;
    }

    @Override
    public Set<String> getList() {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(workFile));
            Trait newTrait = new Trait();
            while ((line = br.readLine()) != null) {
                newTrait.extractMails(line);
            }
            return newTrait.getEmails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
