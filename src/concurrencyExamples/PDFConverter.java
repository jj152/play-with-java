package concurrencyExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import javax.swing.text.Document;


public class PDFConverter {
	private final Semaphore semaphore;

	public PDFConverter(int concurrencyLevel) {
		this.semaphore = new Semaphore(concurrencyLevel);
	}

	public void convertToPdf(File input, File output) throws InterruptedException {
		try {
			semaphore.acquire(); // Excess threads have to wait here till a permit becomes available
	        PdfOptions options = PdfOptions.create();
	        PdfConverter.getInstance().convert(input, output, options);
	    } catch (FileNotFoundException ex) {
	    	ex.printStackTrace();
	    } catch (IOException ex) {
	    	ex.printStackTrace();
	    } finally {
			semaphore.release();
		}
	}

	public static void main(String[] args) {
		PDFConverter pdfConverter = new PDFConverter(5);
		List<File> documents = new ArrayList<>();
		// add documents to the list using documents.add(doc1);
		documents.add(new File("Java Interview Questions.docx"));
		documents.parallelStream().forEach(document -> {
			try {
				pdfConverter.convertToPdf(document, new File(document.getName() + ".pdf"));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}
