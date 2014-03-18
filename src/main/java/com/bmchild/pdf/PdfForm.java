package com.bmchild.pdf;

import java.util.List;

/**
 * A representation of a form, where it is located and the file it should be know after the stamps are applied.
 * @author bchild
 *
 */
public interface PdfForm {

	
	/**
	 * The file name that this pdf form will have i.e. My_PDF.pdf
	 * @return
	 */
	String getDestinationFileName();
	
	/** 
	 * the file path where the original pdf is located.  i.e. /report/bmchild/My_PDF.pdf
	 * @return
	 */
	String getOriginalFilePath();
	
	/** 
	 * Gets all the stamps that should be applied to the pdf
	 * @return
	 */
	List<PdfFormStamp> getPdfFormStamps();
}
