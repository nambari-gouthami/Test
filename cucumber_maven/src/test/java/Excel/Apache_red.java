package Excel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Apache_red {
	public static void main(String[] args) throws IOException {
	String prjpath=System.getProperty("user.dir");
	FileInputStream fis=new FileInputStream("/home/labuser/Documents/cucumber_maven.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	System.out.println(sheet.getLastRowNum());
	System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
	System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
	sheet.getRow(5).createCell(2).setCellValue("FAIL");
	FileOutputStream fout=new FileOutputStream("/home/labuser/Documents/cucumber_maven.xlsx");
	wb.write(fout);
	wb.close();
}
}
