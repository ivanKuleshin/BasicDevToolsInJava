package SOLID.InterfaceSegregationPrinciple;

import java.util.List;

public interface ExcelReport {
    List<String> generateExcelReport(String reportName);
}
