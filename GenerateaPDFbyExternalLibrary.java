import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerateaPDFbyExternalLibrary {

	public static void main(String[] args) {
		try {
			Document document= new Document();
			PdfWriter.getInstance(document, new FileOutputStream("PrintingPlayingCards.pdf"));
			document.open();
			
			//Creating table 
			PdfPTable table = new PdfPTable(4);
			table.getDefaultCell().setFixedHeight(180);
			table.setWidthPercentage(80);
			
			//Creating fonts of the PDF file
			
			BaseFont baseFont= BaseFont.createFont("C:\\Users\\DELL\\workspace\\CARDC.TTF", BaseFont.IDENTITY_H, true );
			Font black= new Font(baseFont, 30f, 0, BaseColor.BLACK);
			Font red= new Font(baseFont, 30f, 0, BaseColor.RED);
			
			// Creating Symbols of the Cards
			
			String card="";
			char color= ' ';
			for (int i = 2; i <= 14; i++) {
				switch (i) {
				case 10: card= "10"; 
					break;
				case 11: card= "J"; 
					break;
				case 12: card= "Q"; 
					break;
				case 13: card= "K"; 
					break;
				case 14: card= "A"; 
					break;
				
				default: card= " " + i;
					break;
				}
				for (int j = 1; j <=4; j++) {
					switch (j) {
					case 1: color= '\u2660'; table.addCell(new Paragraph(card + color + " ", black));break;
					case 2: color= '\u2663'; table.addCell(new Paragraph(card + color + " ", black));break;
					case 3: color= '\u2665'; table.addCell(new Paragraph(card + color + " ", red));break;
					case 4: color= '\u2666'; table.addCell(new Paragraph(card + color + " ", red));break;
							
					}
				}
			}
			document.add(table);
			document.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
