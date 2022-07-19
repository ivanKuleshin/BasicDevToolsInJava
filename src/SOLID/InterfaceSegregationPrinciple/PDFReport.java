package SOLID.InterfaceSegregationPrinciple;

import java.io.File;

public interface PDFReport {
    File generatePDFReport(String reportName, File source);
}
