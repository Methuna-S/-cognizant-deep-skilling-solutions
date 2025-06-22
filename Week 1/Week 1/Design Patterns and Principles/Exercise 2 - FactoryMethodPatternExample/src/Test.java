public class Test {
    public static void main(String[] args) {
        DocumentFactory wordMaker   = new WordFactory();
        DocumentFactory pdfMaker    = new PdfFactory();
        DocumentFactory excelMaker  = new ExcelFactory();

        Document word  = wordMaker.createDocument();
        Document pdf   = pdfMaker.createDocument();
        Document excel = excelMaker.createDocument();

        word.open();
        pdf.open();
        excel.open();
        
        System.out.println("word instanceof WordDocument  = " + (word instanceof WordDocument));
        System.out.println("pdf  instanceof PdfDocument   = " + (pdf  instanceof PdfDocument));
        System.out.println("excel instanceof ExcelDocument= " + (excel instanceof ExcelDocument));
    }
}