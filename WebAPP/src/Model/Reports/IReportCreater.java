package Model.Reports;

import Model.Filters.ReportFilter;

public interface IReportCreater {
    String CreateReport(ReportFilter filter);
}
