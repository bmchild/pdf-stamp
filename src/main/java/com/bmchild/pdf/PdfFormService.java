package com.bmchild.pdf;

import java.util.Map;

/**
 * @author bchild
 *
 */
public interface PdfFormService {
	
	/**
	 * Applies the stamps that originate from the {@link PdfForm} to the pdf specified in the {@link PdfForm}
	 * @param pdfForm
	 * @return a map of the pdf keyed off of the file name specified in the {@link PdfForm} 
	 * @throws PdfFormException 
	 */
	Map<String, byte[]> stampPdf(PdfForm pdfForm) throws PdfFormException;

}
