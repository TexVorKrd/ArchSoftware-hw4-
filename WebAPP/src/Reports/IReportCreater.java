package Reports;

import Model.Filters.ReportFilterData;

public interface IReportCreater {
    /**
     * Реализация логики формирования отчета из выборки данных и сонвертация
     * их в JSON String
     * @param data - Данные из БД
     * @return - JSON в строке.
     */
    String CreateReport(ReportFilterData data);
}
