package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
//        TextReport textReport = new TextReport();
//        HtmlReport htmlReport = new HtmlReport();
        JSONReport jsonReport = new JSONReport();
        String text = jsonReport.generate("name", "body");
        System.out.println(text);
    }
}
