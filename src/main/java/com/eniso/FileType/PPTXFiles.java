package com.eniso.FileType;

import com.eniso.Utils.Trait;
import java.io.File;
import java.io.FileInputStream;
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
public class PPTXFiles implements MailList {

    protected File workFile;

    public PPTXFiles() {
        workFile = null;
    }

    @Override
    public void setWorkFile(File newFile) {
        workFile = newFile;
    }

    @Override
    public Set<String> getList() {
        try {
            XMLSlideShow slides = new XMLSlideShow(new FileInputStream(workFile));
            List<XSLFSlide> sl = slides.getSlides();
            Trait newTrait = new Trait();
            for (XSLFSlide slide : slides.getSlides()) {
                for (XSLFShape shape : slide.getShapes()) {
                    if (shape instanceof XSLFTextShape) {
                        newTrait.extractMails(((XSLFTextShape) shape).getText());
                    }
                }
            }
            return newTrait.getEmails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashSet<>();
    }

}
