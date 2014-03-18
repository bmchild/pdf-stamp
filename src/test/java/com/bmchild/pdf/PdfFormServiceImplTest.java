package com.bmchild.pdf;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.lowagie.text.Element;
import com.lowagie.text.Phrase;

/**
 * @author bchild
 *
 */
public class PdfFormServiceImplTest {
	
	// assumes you have a test pdf at this location
	private static final String TEST_PDF_PATH = "pdf/test-pdf.pdf";
	
	private PdfFormServiceImpl pdfFormService = new PdfFormServiceImpl();
	

	/**
	 * Test method for {@link com.bmchild.service.utils.pdf.PdfFormServiceImpl#stampPdf(com.bmchild.service.utils.pdf.PdfForm)}.
	 * @throws PdfFormException 
	 * @throws IOException 
	 */
	@Test
	public void testStampPdf() throws PdfFormException, IOException {
		PdfForm form = new TestPdfForm();
		Map<String, byte[]> result = pdfFormService.stampPdf(form);
		assertNotNull(result);
		byte[] body = result.get(form.getDestinationFileName());
		assertNotNull(body);
		/* Write to file to see layout 
		OutputStream os = new FileOutputStream("C:\\Users\\bchild\\tmp\\output\\testStampPdf-" + Calendar.getInstance().getTimeInMillis() + ".pdf");
		os.write(body);
		os.close(); 
		 */
	}
	
	private class TestPdfForm implements PdfForm {

		/* (non-Javadoc)
		 * @see com.bmchild.service.utils.pdf.PdfForm#getDestinationFileName()
		 */
		@Override
		public String getDestinationFileName() {
			return "tester.pdf";
		}

		@Override
		public String getOriginalFilePath() {
			return TEST_PDF_PATH;
		}

		@Override
		public List<PdfFormStamp> getPdfFormStamps() {
			PdfFormStamp stamp = new PdfFormStamp(new Phrase("tester"), new PdfFormPlaceholder(Element.ALIGN_JUSTIFIED, 10, 10, 0));
			return Arrays.asList(stamp);
		}
		
	}

}
