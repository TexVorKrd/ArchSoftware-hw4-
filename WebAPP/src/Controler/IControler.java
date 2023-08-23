package Controler;

import Model.Filters.ReportFilterMask;
import Reports.Report;

public abstract class IControler {
    abstract void getReqestFilter(String request);
    abstract void getReqestReport(String request);
    abstract String sendAnswerFilter(ReportFilterMask mask);
    abstract String sendAnswerReport(Report report);

}
