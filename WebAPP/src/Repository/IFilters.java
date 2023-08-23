package Repository;

import Model.Filters.ReportFilterMask;
import Reports.Report;

/**
 * Получение маски фильтра для конкретного отчета из БД
 */
public interface IFilters {
    ReportFilterMask getFilterMask(Report report);
}
