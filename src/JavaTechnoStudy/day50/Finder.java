package JavaTechnoStudy.day50;

public class Finder {
    public static void main(String[] args) {

        ExcelFile excelFile = new ExcelFile();
        excelFile.close();
        excelFile.open();
        excelFile.read();
        excelFile.save();

    }

    static void workWitFile(MSOffice file) {
        System.out.println(file);
    }


}
