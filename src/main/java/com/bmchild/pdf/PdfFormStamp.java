package com.bmchild.pdf;

import com.lowagie.text.Phrase;


/**
 * A representation of a stamp to be applied to a PdfForm
 * @author bchild
 *
 */
public class PdfFormStamp {

	private PdfFormPlaceholder pdfFormPlaceholder;
	private Phrase phrase;
	
	/**
	 * @param alignment (see {@link com.lowagie.text.Element}
	 * @param phrase
	 * @param x
	 * @param y
	 * @param rotation
	 */
	public PdfFormStamp(Phrase phrase, PdfFormPlaceholder pdfFormPlaceholder) {
		this.pdfFormPlaceholder = pdfFormPlaceholder;
		this.phrase = phrase;
	}

	public PdfFormPlaceholder getPdfFormPlaceholder() {
		return pdfFormPlaceholder;
	}

	public void setPdfFormPlaceholder(PdfFormPlaceholder pdfFormPlaceholder) {
		this.pdfFormPlaceholder = pdfFormPlaceholder;
	}

	public Phrase getPhrase() {
		return phrase;
	}

	public void setPhrase(Phrase phrase) {
		this.phrase = phrase;
	}

	
}
