package com.bmchild.pdf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

/**
 * Service to stamp the provided PdfForm
 * @author bchild
 *
 */
public class PdfFormServiceImpl implements PdfFormService {

	/* (non-Javadoc)
	 * @see com.bmchild.service.utils.pdf.PdfFormService#stampPdf(com.bmchild.service.utils.pdf.PdfForm)
	 */
	@Override
	public Map<String, byte[]> stampPdf(PdfForm pdfForm) throws PdfFormException {
		Map<String, byte[]> result = new HashMap<>();
		ByteArrayOutputStream output = null;
		PdfReader reader = null;
		PdfStamper stamper = null;
		
		try {
			output = new ByteArrayOutputStream();
			reader = new PdfReader(pdfForm.getOriginalFilePath());
	        stamper = new PdfStamper(reader, output);
	        PdfContentByte canvas = stamper.getOverContent(1);
	        for(PdfFormStamp stamp : pdfForm.getPdfFormStamps()) {
	        	ColumnText.showTextAligned(canvas,
	    				stamp.getPdfFormPlaceholder().getAlignment(), 
	    				new Phrase(stamp.getPhrase()), 
	    				stamp.getPdfFormPlaceholder().getX(), stamp.getPdfFormPlaceholder().getY(), 
	    				stamp.getPdfFormPlaceholder().getRotation());
	        }
	        reader.close();
	        stamper.close();
	        result.put(pdfForm.getDestinationFileName(), output.toByteArray());
	        output.close();
		} catch(DocumentException | IOException e) {
			throw new PdfFormException(e.getMessage(), e);
		} 
		
		return result;
	}
	
}
