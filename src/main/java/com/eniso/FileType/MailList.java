
package com.eniso.FileType;

import java.io.File;
import java.util.Set;

/**
 *
 * @author Nasreddine
 */
public interface MailList {
    abstract void setWorkFile(File newFile);
    abstract Set<String> getList();
    
}
